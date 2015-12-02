/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.game.player;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import org.example.game.drawable.DimensionedTexture;
import org.example.game.drawable.SteerableDrawer;
import org.example.game.steering.BasicSteerable;
import org.example.game.steering.Steerable;
import org.example.game.steering.SteeringBehavior;

/**
 *
 * @author alisonbnt
 */
public class GamePlayer {

    private Steerable character;
    private SteeringBehavior behavior;
    private SteerableDrawer characterDrawable;

    public GamePlayer(DimensionedTexture playerImg) {
        character = new BasicSteerable();
        characterDrawable = new SteerableDrawer(new TextureRegion(playerImg.getTexture()), getCharacter());
        characterDrawable.getSprite().setSize(playerImg.getWidth(), playerImg.getHeight());
    }

    public void draw(Batch batch) {
        getCharacterDrawable().draw(batch);
    }

    public void update() {
        if(behavior != null){
            behavior.apply(character);
        }
        getCharacter().update();
    }

    /**
     * @return the character
     */
    public Steerable getCharacter() {
        return character;
    }

    /**
     * @param character the character to set
     */
    public void setCharacter(Steerable character) {
        this.character = character;
    }

    /**
     * @return the behavior
     */
    public SteeringBehavior getBehavior() {
        return behavior;
    }

    /**
     * @param behavior the behavior to set
     */
    public void setBehavior(SteeringBehavior behavior) {
        this.behavior = behavior;
    }

    /**
     * @return the characterDrawable
     */
    public SteerableDrawer getCharacterDrawable() {
        return characterDrawable;
    }

    /**
     * @param characterDrawable the characterDrawable to set
     */
    public void setCharacterDrawable(SteerableDrawer characterDrawable) {
        this.characterDrawable = characterDrawable;
    }
    
    

}