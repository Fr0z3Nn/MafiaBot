package ru.sivanov.Mafia;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.awt.*;
import java.time.temporal.TemporalAccessor;

public class StartMessage {

    public void startMessage(MessageReceivedEvent event){
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setColor(Color.RED);
        embedBuilder.setTitle("Let's play? Будет жарко\uD83D\uDD25");
        embedBuilder.setDescription("✅ ЖМИ ✅");
        embedBuilder.setFooter("Начало через 30 секунд",event.getGuild().getIconUrl());
        embedBuilder.setTimestamp(null);
        event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage(embedBuilder.build()).queue(message ->
                message.addReaction("✅").queue());

    }
}
