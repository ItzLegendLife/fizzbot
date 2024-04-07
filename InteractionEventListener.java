package events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class InteractionEventListener extends ListenerAdapter { //crtl+o
@Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);
        System.out.println("Interaction is loaded.");
        System.out.println(event.getUser() + " is using " + event.getName() + " command.");
        //send msg to cmd when user use slash command

        //event.reply("HELLO " + event.getUser()).setEphemeral(false).queue();
        //setEpthemeral only user who use the slash can view the msg


    switch (event.getName()) {
        case "hello" :
            event.reply("Hello User!!").setEphemeral(false).queue();
            break;
        case "bruh" :
            event.reply("Bruh").setEphemeral(false).queue();
            break;
        case "embeds" :
            EmbedBuilder builder = new EmbedBuilder();
            builder.setTitle("Title");
            builder.setDescription("Description");
            builder.addField("Example 1", "value", false);
            builder.addField("Example 2","value",true);
            builder.setFooter("Example footer");
            builder.setAuthor("Author");



            event.replyEmbeds(builder.build()).setEphemeral(false).queue();
    }

    }


}
