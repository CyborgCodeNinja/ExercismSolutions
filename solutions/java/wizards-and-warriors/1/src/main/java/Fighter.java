class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
    @Override
    public String toString(){
        return "fighter";
    }

}

// TODO: define the Warrior class
class Warrior extends Fighter{
    @Override
    boolean isVulnerable(){
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        int points = 0;
        if(fighter.isVulnerable()){
            points = 10;
        }else{
            points = 6;
        }
        return points;
    }

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

}
// TODO: define the Wizard class
class Wizard extends Fighter{
    boolean spellInAdv = false;

    void prepareSpell(){
         spellInAdv = true;
    }

    //vulnerable
    @Override
    boolean isVulnerable(){
        boolean isVul = true;
        if(spellInAdv){
            isVul = false;
        }

        return isVul;
    }

    @Override
    int getDamagePoints(Fighter figher){
        int points = 0;
        if(spellInAdv){
            points = 12;
        }else{
            points = 3;
        }
        return points;
    }

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }
    
}