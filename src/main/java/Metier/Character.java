package Metier;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String characName;
    private Integer hp;
    private Integer dp;
    private Integer actionPoint;

    @OneToMany
    public List<Character> charactersList = new ArrayList<>();

    public Character() {
    }
    public Character(String characName, Integer hp, Integer dp, Integer actionPoint) {
        this.characName = characName;
        this.hp = hp;
        this.dp = dp;
        this.actionPoint = actionPoint;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCharacName() {
        return characName;
    }

    public void setCharacName(String characName) {
        this.characName = characName;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getDp() {
        return dp;
    }

    public void setDp(Integer dp) {
        this.dp = dp;
    }

    public Integer getActionPoint() {
        return actionPoint;
    }

    public void setActionPoint(Integer actionPoint) {
        this.actionPoint = actionPoint;
    }

    public List<Character> getCharactersList() {
        return charactersList;
    }

    public void setCharactersList(List<Character> charactersList) {
        this.charactersList = charactersList;
    }
}
