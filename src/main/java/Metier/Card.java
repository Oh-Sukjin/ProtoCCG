package Metier;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameCard;
    private Integer cost;
    private String description;
    private Integer category;


    public Card() {
    }

    public Card(String nameCard, Integer cost, String description, Integer category) {
        this.nameCard = nameCard;
        this.cost = cost;
        this.description = description;
        this.category = category;
    }

    @ManyToMany
    public List<Card> cardsList = new ArrayList<>();

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", nameCard='" + nameCard + '\'' +
                ", cost=" + cost +
                ", desciption='" + description + '\'' +
                ", category=" + category +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desciption) {
        this.description = desciption;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
