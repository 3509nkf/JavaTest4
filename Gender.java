package edu.rpg.personal;
public enum Gender2 {
	MALE("男性"),FEMALE("女性");
        private String name;
        private Gender(String name) {
           this.name = name;
        }
        public String getName() {
          return this.name;
        }
}