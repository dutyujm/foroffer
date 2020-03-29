package cn.dutyujm.test;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class sa {
        public static void main(String[] args) {
            System.out.println(Instant.now());
            DateTimeFormatter e = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            System.out.println(e.format(Instant.now().atZone(ZoneId.systemDefault())));
        }


}
