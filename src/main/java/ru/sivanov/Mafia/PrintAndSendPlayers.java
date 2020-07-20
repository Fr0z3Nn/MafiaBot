package ru.sivanov.Mafia;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import ru.sivanov.MafiaCountPlayers;

import java.util.ArrayList;

public class PrintAndSendPlayers {
    public void printPlayers(MessageReceivedEvent event) {
        if (MafiaCountPlayers.setOfPlayers.size() > 6) {
            event.getChannel().sendMessage("Участники игры:").queue();
            Roles roles = new Roles();
            ArrayList<String> rolesForPlayers = roles.listOfRoles(MafiaCountPlayers.setOfPlayers.size());


            int i = 0;
            for (Member player : MafiaCountPlayers.setOfPlayers) {

                event.getChannel().sendMessage("▶" + player.getEffectiveName() + "◀").queue();
                int finalI = i;

                player.getUser().openPrivateChannel().queue((chan) ->
                {

                    chan.sendMessageFormat("Твоя роль в этой игре: " + rolesForPlayers.get(finalI) + " Приятной игры!").queue();

                });
                i++;
            }
        }else{
            event.getChannel().sendMessage("⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠\n" +
                    "Недостаточно игроков!\n" +
                    "⚠⚠⚠⚠⚠⚠⚠⚠⚠⚠\n " +
                    " Минимальное количество: 7").queue();
        }
    }
}
