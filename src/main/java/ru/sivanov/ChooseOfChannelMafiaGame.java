package ru.sivanov;

import net.dv8tion.jda.api.entities.Emote;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import ru.sivanov.Mafia.MafiaGameStart;
import ru.sivanov.Mafia.StartMessage;
import ru.sivanov.Mafia.WaitPlayers;

import java.util.Objects;

public class ChooseOfChannelMafiaGame extends ListenerAdapter {
    public static boolean isGameOneStart = false;
    public static boolean isGameOnePrepare = false;
    public static MafiaGameStart mafiaGameOneStart;
    public void onMessageReceived(MessageReceivedEvent event){
        String tableOneId = "728272093250322562";

        if(event.getMessage().getContentRaw().equalsIgnoreCase("!maf")&&
                isGameOneStart){
            event.getChannel().sendMessage("Эй, дружок - пирожок, игра уже начата!").queue();
        }


        if(event.getMessage().getContentRaw().equalsIgnoreCase("!maf")&&
                event.getChannel().getId().equals(tableOneId)&& !isGameOneStart){

            //запускаем поток с новой игрой
            mafiaGameOneStart = new MafiaGameStart(event);
            mafiaGameOneStart.start();
        }

        if(event.getMessage().getContentRaw().equalsIgnoreCase("!stop")&&
                isGameOneStart){
            try {
                event.getChannel().sendMessage("Завершил игру? Опять все через жопу?").queue();
                mafiaGameOneStart.stop();

                MafiaCountPlayers.setOfPlayers.clear();
                isGameOnePrepare = false;
                isGameOneStart = false;
            } catch (Exception e) {
                System.out.println("Ошибка в завершении игры");
            }
        }
    }
}
