package ru.sivanov;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.MessageUpdateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import ru.sivanov.Mafia.MafiaAddReactions;
import ru.sivanov.Mafia.MafiaGameStart;
import ru.sivanov.Mafia.StartMessage;
import ru.sivanov.Quotes.Statham;

import javax.annotation.Nonnull;
import java.util.Objects;

public class MessagesParser extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        if(event.getMessage().getEmbeds().toString().startsWith("[net.dv8tion.jda.api.entities.MessageEmbed")){
            MafiaGameStart.embedMessageStartId = event.getMessageId();

            MafiaAddReactions mafiaAddReactions = new MafiaAddReactions();
            mafiaAddReactions.addReactionLis(event);
        }

        if(event.getMessage().getContentRaw().equals("!ст")){
            event.getChannel().sendMessage(Statham.say()+
                    " © Джейсон Стэтхэм").queue();
        }

        if(event.getMessage().getContentRaw().equals("!mute")){
            for (Member member : event.getGuild().getMembers()){
                try {
                    event.getGuild().mute(Objects.requireNonNull(member), true).complete();
                }catch (Exception e){
                    System.out.println("Игрок вне голосового канала!");
                }
            }
        }

        if(event.getMessage().getContentRaw().equals("!unmute")){
                for (Member member : event.getGuild().getMembers()){
                    try {
                        event.getGuild().mute(Objects.requireNonNull(member), false).complete();
                    }catch (Exception e){
                        System.out.println("Игрок вне голосового канала!");
                    }
                }
        }
        System.out.println(event.getMessage().getContentRaw());
    }


}
