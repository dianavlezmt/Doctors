package co.usa.ciclo32022.Reto3.Service;

import co.usa.ciclo32022.Reto3.Repository.MessageRepository;
import co.usa.ciclo32022.Reto3.modelo.MessageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<MessageModel> getAllMessages() {
        return messageRepository.getAllMessages();
    }

    public Optional<MessageModel> getMessage(Integer idMessage) {
        return messageRepository.getMessage(idMessage);
    }

    public MessageModel saveMessage(MessageModel messageModel){

        return messageRepository.saveMessage(messageModel);
    }
    public boolean deleteMessage(Integer idMessage){
        messageRepository.deleteMessage(idMessage);
        return true;
    }

    public MessageModel updateMessage (MessageModel messageModel ){
        return messageRepository.updateMessage(messageModel);
    }
}
