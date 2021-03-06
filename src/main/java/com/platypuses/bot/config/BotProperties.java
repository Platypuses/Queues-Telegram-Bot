package com.platypuses.bot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("bot")
public class BotProperties {

  private String username;
  private String token;
  private String backendBaseUrl;

}
