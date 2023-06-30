package lk.epic.chatapp.controller;

import lk.epic.chatapp.dto.MessageDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/server")
@CrossOrigin
public class ServerController {

    private String messageFromServer = "Hello...!";

    @PostMapping
    public String ReadMessage(@ModelAttribute MessageDTO dto){
        System.out.println(dto.getName()+" : "+dto.getMessage());
        return messageFromServer;
    }

}
