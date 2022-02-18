package edu.rpg.personal;
import edu.rpg.weapon.Weapon;

public class Character {
 private String name;
 private String gender;
 private Weapon weapon;
 /**HP*/
 private int hp;
 /**MP*/
 private int mp;
 /**攻撃力*/
 private int power;
 /**防御力*/
 private int defense;

 public Character(String name,String gender) {
    this.name = name;
    this.gender = gender;
 }

 public String  getName() {
      return name; 
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getGender() {
      return gender;
 }

 public Weapon getWeapon(){
   return weapon;
 }

 public void setWeapon(Weapon weapon) {
   this.weapon = weapon;
 }

 public void setGender(String gender) {
   this.gender = gender;
 }
 
 public int getHp() {
  return hp;
 }

 public void setHp(int hp) {
   this.hp = hp;
 }
 public int getMp() {
   return mp;
 }

 public void setMp(int mp){
   this.mp = mp;
 }

 public int getPower() {
  return power;
 }

 public void setPower(int power) {
  this.power = power;
 }

 public int getAttackPower() {
   return weapon.getPower() + this.power;
 }
}