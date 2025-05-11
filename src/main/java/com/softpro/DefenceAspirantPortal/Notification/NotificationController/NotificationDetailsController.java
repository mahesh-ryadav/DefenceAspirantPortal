package com.softpro.DefenceAspirantPortal.Notification.NotificationController;

import com.softpro.DefenceAspirantPortal.Notification.NotificationDto.NotificationDetailsDto;
import com.softpro.DefenceAspirantPortal.Notification.NotificationService.NotificationDetailsService;
import jakarta.validation.Valid;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class NotificationDetailsController {

    private final NotificationDetailsService notificationDetailsService;

    public NotificationDetailsController(NotificationDetailsService notificationDetailsService) {
        this.notificationDetailsService = notificationDetailsService;
    }


    @GetMapping("/")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public String index() {
        return "index";
    }

    @GetMapping("/add-notification")
    public String showNotificationForm(Model model) {
        NotificationDetailsDto dto = new NotificationDetailsDto();
        model.addAttribute("notificationDetailsDto", dto);
        return "notification-form";
    }

    @PostMapping("/save-notification")
    public String saveNotification(@Valid @ModelAttribute NotificationDetailsDto dto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "notification-form";
        }

        // If no errors, save the notification details
        notificationDetailsService.saveNotificationDetails(dto);
        return "redirect:/notifications";
    }

    @GetMapping("/notification/{id}")
    public String showNotificationById(@PathVariable Long id, Model model) {
        NotificationDetailsDto dto = notificationDetailsService.getNotificationDetailsById(id);
        if (dto == null) {
            return "redirect:/notifications?error=notfound";
        }
        model.addAttribute("notificationDetails", dto);
        return "notification/notification-details";
    }
}
