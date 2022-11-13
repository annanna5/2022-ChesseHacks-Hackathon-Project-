package cheese22.shelter.controller;

import cheese22.shelter.domain.Dog;
import cheese22.shelter.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DogController {
    private final DogService dogService;

    @Autowired
    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping(value = "/dogs/list")
    public String dog_list(Model model) {
        List<Dog> dogs = dogService.findDogs();
        model.addAttribute("dogs", dogs);

        return "dogs/dog_test";
    }

    @GetMapping(value = "/dogs/list/madison")
    public String dog_Madison(Model model) {
        List<Dog> dogs = dogService.findDogsByLocation("Madison, WI");
        model.addAttribute("dogs", dogs);
        model.addAttribute("location", "Madison, WI");

        return "archive/friends";
    }

    @GetMapping(value = "/dogs/list/chicago")
    public String dog_Chicago(Model model) {
        List<Dog> dogs = dogService.findDogsByLocation("Chicago, IL");
        model.addAttribute("dogs", dogs);
        model.addAttribute("location", "Chicago, IL");

        return "archive/friends";
    }

    @GetMapping(value = "/dogs/chatList")
    public String dog_chat_list(Model model) {

    }
}