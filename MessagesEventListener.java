package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessagesEventListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        super.onMessageReceived(event);
        //System.out.println( event.getMessage().getAuthor() + " sent: " + event.getMessage().getContentDisplay());
        //send user messages to cmd

    }
}
