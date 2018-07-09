package cc.moecraft.logger.text;

import cc.moecraft.logger.HyLogger;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 此类由 Hykilpikonna 在 18-7-8 创建!
 * Created by Hykilpikonna on 18-7-8!
 * Twitter: @Hykilpikonna
 * QQ/Wechat: 871674895
 */
public class Paragraph
{
    @Getter
    private ArrayList<String> sentences;

    public Paragraph(ArrayList<String> sentences)
    {
        this.sentences = sentences;
    }

    public Paragraph(String ... sentences)
    {
        this(new ArrayList<>());
        addSentences(sentences);
    }

    public Paragraph addSentences(String ... sentences)
    {
        return addSentences(Arrays.asList(sentences));
    }

    public Paragraph addSentences(Collection<? extends String> sentences)
    {
        this.sentences.addAll(sentences);
        return this;
    }

    public void processNewLines()
    {
        sentences = new ArrayList<>(Arrays.asList(toString().split("\n")));
    }

}
