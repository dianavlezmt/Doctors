package co.usa.ciclo32022.Reto3.Controller;

import co.usa.ciclo32022.Reto3.Service.MessageService;
import co.usa.ciclo32022.Reto3.modelo.MessageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<MessageModel> getAllMessages(){
        return messageService.getAllMessages();
    }

    @PostMapping("/all")
    @ResponseStatus(HttpStatus.CREATED)
    public List<MessageModel> getAllMessages2(){
        return messageService.getAllMessages();
    }

    @GetMapping("/{idMessage}")
    public Optional<MessageModel> getMessage(@PathVariable Integer idMessage){
        return messageService.getMessage(idMessage);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public MessageModel saveMessage(@RequestBody MessageModel messageModel){
        return messageService.saveMessage(messageModel);
    }

    @DeleteMapping("/delete/{idMessage}")
    public boolean deleteMessage(@PathVariable Integer idMessage){
        return messageService.deleteMessage(idMessage);
    }


    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public MessageModel updateMessage(@RequestBody MessageModel messageModel){
        return messageService.updateMessage(messageModel);
    }
}
