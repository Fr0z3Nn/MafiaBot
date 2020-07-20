package ru.sivanov;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class BotMain {
    public static final String token = "";
    public static JDA jda;
    public static void main(String[] args) {
        try{
            jda = JDABuilder.createDefault(token).build();

        }catch (LoginException e){
            System.out.println("Введен недействительный токен");
        }

        ChooseOfChannelMafiaGame mafiaGame = new ChooseOfChannelMafiaGame();
        jda.addEventListener(mafiaGame);

        MessagesParser messagesParser = new MessagesParser();
        jda.addEventListener(messagesParser);

        MafiaCountPlayers mafiaCountPlayers = new MafiaCountPlayers();
        jda.addEventListener(mafiaCountPlayers);

    }
}
