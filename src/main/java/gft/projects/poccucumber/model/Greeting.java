package gft.projects.poccucumber.model;

import lombok.Getter;
import lombok.Setter;

public class Greeting {

    @Getter
    @Setter
    private long id;

    public String getContent() {
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    @Setter
    @Getter
    private String content;

    public Greeting(long id, String content){
        this.id= id;
        this.content = content;
    }
}
