package com.protein.factioncollector.enums;

import org.bukkit.ChatColor;

public enum Messages {

    NO_PERMISSION("&c&l(!) &cNo permission!"),
    NOT_ONLINE("&c&l(!) &c{player} is not online!"),
    YOU_CANT_PLACE_HERE("&c&l(!) &cYou can't place this here!"),
    CANT_PLACE_IN_WILDERNESS("&c&l(!) &cYou can't place this in the Wilderness!"),
    MUST_REMOVE_COLLECTORS("&c&l(!) &cYou must remove your faction collectors before doing this!"),
    ALREADY_COLLECTOR_IN_CHUNK("&c&l(!) &cThere's already a Faction Collector in this chunk!"),
    SOLD("&2&l+{amount}"),
    ERROR("&c&l(!) &cError parsing command!"),
    GIVEN("&a&l(!) &aYou've given {player} {amount} {item-type}!"),
    COLLECTED_TNT("&a&l(!) &aYou've deposited {amount} to your faction's TNTBank!"),
    NO_TNT_TO_DEPOSIT("&c&l(!) &cYou don't have any TNT to deposit"),
    NOTHING_TO_SELL("&c&l(!) &cNothing to sell in the Faction Collector"),
    ONLY_USED_IN_COLLECTOR_CHUNK("&c&l(!) &cA Faction Collector must be placed inside the chunk to be able to use this!"),
    EXCEEDED_MAX_SPAWNERS("&c&l(!) &cYou have exceeded the limit of 250 spawners per chunk!");

    private String message;

    Messages(String message) {
        this.message = message;
    }

    public String getKey() {
        return name().toLowerCase().replace("_", "-");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
