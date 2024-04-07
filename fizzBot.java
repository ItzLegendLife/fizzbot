import events.*;
//import all events in the package

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class fizzBot {
    public static void main(String[] args){
        JDABuilder jdaBuilder = JDABuilder.createDefault ("MTIyNTMyMTI1NzAyMTYwMzkyMw.GgK1jr.2XCEf0Vq9VEf9gjXpF-j7MrasJ5M0XExjz2yck");
        //token

        JDA jda = jdaBuilder //define jda
                .enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new ReadyEventListener(), new MessagesEventListener(), new InteractionEventListener())
                .build(); //bot event

        jda.upsertCommand("hello", "This is a slash command.").setGuildOnly(true).queue();
        jda.upsertCommand("bruh","Bruh LOL").setGuildOnly(true).queue();
        jda.upsertCommand("embeds","Show embeds messages").setGuildOnly(true).queue();
        //set setGuildOnly false to show globally
    }
}
