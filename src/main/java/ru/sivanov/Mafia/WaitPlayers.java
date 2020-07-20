package ru.sivanov.Mafia;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageReaction;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class WaitPlayers {
    public void waitPlayersJoin(MessageReceivedEvent event){
        try{
            event.getChannel().sendMessage("\uD83D\uDD3C \uD83D\uDD3C \uD83D\uDD3C \uD83D\uDD3C \uD83D\uDD3C \uD83D\uDD3C" +
                " \uD83D\uDD3C \uD83D\uDD3C \uD83D\uDD3C \uD83D\uDD3C" +
                "\nВремя скоротечно, успей вступить").queue();
        Thread.sleep(15000);
        event.getChannel().sendMessage("Осталось 15 секунд, успей присоединиться!\uD83D\uDCAA").queue();
        Thread.sleep(10000);
        event.getChannel().sendMessage("5 секунд и начинаем!\uD83E\uDD1C \uD83E\uDD1B").queue();
        Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("Исключение в WaitPlayers");
            e.printStackTrace();
        }


    }
}
