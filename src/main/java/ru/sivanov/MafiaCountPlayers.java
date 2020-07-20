package ru.sivanov;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import ru.sivanov.ChooseOfChannelMafiaGame;

import javax.annotation.Nonnull;
import java.util.HashSet;
import java.util.Objects;

public class MafiaCountPlayers extends ListenerAdapter {
    public static HashSet<Member> setOfPlayers = new HashSet<>();
    public void onMessageReactionAdd(@Nonnull MessageReactionAddEvent event){
        if(ChooseOfChannelMafiaGame.isGameOnePrepare &&
                !(Objects.requireNonNull(event.getMember()).getEffectiveName().equals("MafiaBotByCartman"))){
            setOfPlayers.add(event.getMember());
        }
    }
}
