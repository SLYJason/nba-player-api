package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
  private int id;
  private String name;
  private String team;

  public Player(int id, String name, String team) {
    this.id = id;
    this.name = name;
    this.team = team;
  }

  // Player id
  @JsonProperty("id")
  public int getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(int id){
    this.id = id;
  }

  // Player name
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  // Player team
  @JsonProperty("team")
  public String getTeam() {
    return team;
  }

  @JsonProperty("team")
  public void setTeam(String team) {
    this.team = team;
  }
}
