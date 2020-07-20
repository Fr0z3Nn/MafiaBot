package ru.sivanov.Mafia;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import ru.sivanov.ChooseOfChannelMafiaGame;
import ru.sivanov.MafiaCountPlayers;

import java.util.Objects;

public class MafiaGameStart extends Thread {
    private final MessageReceivedEvent event;
    public static String embedMessageStartId;

    public MafiaGameStart(MessageReceivedEvent event) {

        this.event = event;
    }

    @Override
    public void run() {
        //Создаем экземпляр стартового сообщения
        ChooseOfChannelMafiaGame.isGameOneStart = true;
        ChooseOfChannelMafiaGame.isGameOnePrepare = true;

        StartMessage startMessage = new StartMessage();
        startMessage.startMessage(event);

        WaitPlayers waitPlayers = new WaitPlayers();
        waitPlayers.waitPlayersJoin(event);

        ChooseOfChannelMafiaGame.isGameOnePrepare = false;

        PrintAndSendPlayers printAndSendPlayers = new PrintAndSendPlayers();
        printAndSendPlayers.printPlayers(event);


        MafiaCountPlayers.setOfPlayers.clear();
        ChooseOfChannelMafiaGame.isGameOneStart = false;



    }

}




           /* //Ждем игроков 30 секунд
            WaitPlayers waitPlayers = new WaitPlayers();
            waitPlayers.waitPlayersJoin(event);*/

