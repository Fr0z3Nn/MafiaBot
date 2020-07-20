package ru.sivanov.Mafia;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class MafiaAddReactions {
    public void addReactionLis(MessageReceivedEvent event){
        event.getMessage().addReaction("\uD83C\uDDF2").queue();
        event.getMessage().addReaction("\uD83C\uDD70").queue();
        event.getMessage().addReaction("\uD83C\uDDEB").queue();
    }
}
