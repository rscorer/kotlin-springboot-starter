package com.example.website.controllers

import com.example.website.data.Team
import com.example.website.data.TeamRepository
import org.springframework.security.access.annotation.Secured
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController(private val repository: TeamRepository) {
    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "blog"
    }

    @GetMapping("/user/index")
    fun userIndex(): String {
        return "user/index"
    }

    @GetMapping("/log-in")
    fun login(): String {
        return "login"
    }
}
