/*
 * Copyright (C) 1997-2001 Id Software, Inc.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 *  
 */
/* Modifications
   Copyright 2003-2004 Bytonic Software
   Copyright 2010 Google Inc.
*/
package com.googlecode.gwtquake.shared.game.monsters;

import com.googlecode.gwtquake.shared.client.ClientMonsterMethods;
import com.googlecode.gwtquake.shared.common.Defines;
import com.googlecode.gwtquake.shared.game.*;
import com.googlecode.gwtquake.shared.game.adapters.EntityDieAdapter;
import com.googlecode.gwtquake.shared.game.adapters.EntInteractAdapter;
import com.googlecode.gwtquake.shared.game.adapters.EntityThinkAdapter;
import com.googlecode.gwtquake.shared.game.adapters.EntityPainAdapter;
import com.googlecode.gwtquake.shared.game.adapters.EntityTouchAdapter;
import com.googlecode.gwtquake.shared.util.Lib;
import com.googlecode.gwtquake.shared.util.Math3D;


public class MonsterMutant {

    //	This file generated by ModelGen - Do NOT Modify

    public final static int FRAME_attack01 = 0;

    public final static int FRAME_attack02 = 1;

    public final static int FRAME_attack03 = 2;

    public final static int FRAME_attack04 = 3;

    public final static int FRAME_attack05 = 4;

    public final static int FRAME_attack06 = 5;

    public final static int FRAME_attack07 = 6;

    public final static int FRAME_attack08 = 7;

    public final static int FRAME_attack09 = 8;

    public final static int FRAME_attack10 = 9;

    public final static int FRAME_attack11 = 10;

    public final static int FRAME_attack12 = 11;

    public final static int FRAME_attack13 = 12;

    public final static int FRAME_attack14 = 13;

    public final static int FRAME_attack15 = 14;

    public final static int FRAME_death101 = 15;

    public final static int FRAME_death102 = 16;

    public final static int FRAME_death103 = 17;

    public final static int FRAME_death104 = 18;

    public final static int FRAME_death105 = 19;

    public final static int FRAME_death106 = 20;

    public final static int FRAME_death107 = 21;

    public final static int FRAME_death108 = 22;

    public final static int FRAME_death109 = 23;

    public final static int FRAME_death201 = 24;

    public final static int FRAME_death202 = 25;

    public final static int FRAME_death203 = 26;

    public final static int FRAME_death204 = 27;

    public final static int FRAME_death205 = 28;

    public final static int FRAME_death206 = 29;

    public final static int FRAME_death207 = 30;

    public final static int FRAME_death208 = 31;

    public final static int FRAME_death209 = 32;

    public final static int FRAME_death210 = 33;

    public final static int FRAME_pain101 = 34;

    public final static int FRAME_pain102 = 35;

    public final static int FRAME_pain103 = 36;

    public final static int FRAME_pain104 = 37;

    public final static int FRAME_pain105 = 38;

    public final static int FRAME_pain201 = 39;

    public final static int FRAME_pain202 = 40;

    public final static int FRAME_pain203 = 41;

    public final static int FRAME_pain204 = 42;

    public final static int FRAME_pain205 = 43;

    public final static int FRAME_pain206 = 44;

    public final static int FRAME_pain301 = 45;

    public final static int FRAME_pain302 = 46;

    public final static int FRAME_pain303 = 47;

    public final static int FRAME_pain304 = 48;

    public final static int FRAME_pain305 = 49;

    public final static int FRAME_pain306 = 50;

    public final static int FRAME_pain307 = 51;

    public final static int FRAME_pain308 = 52;

    public final static int FRAME_pain309 = 53;

    public final static int FRAME_pain310 = 54;

    public final static int FRAME_pain311 = 55;

    public final static int FRAME_run03 = 56;

    public final static int FRAME_run04 = 57;

    public final static int FRAME_run05 = 58;

    public final static int FRAME_run06 = 59;

    public final static int FRAME_run07 = 60;

    public final static int FRAME_run08 = 61;

    public final static int FRAME_stand101 = 62;

    public final static int FRAME_stand102 = 63;

    public final static int FRAME_stand103 = 64;

    public final static int FRAME_stand104 = 65;

    public final static int FRAME_stand105 = 66;

    public final static int FRAME_stand106 = 67;

    public final static int FRAME_stand107 = 68;

    public final static int FRAME_stand108 = 69;

    public final static int FRAME_stand109 = 70;

    public final static int FRAME_stand110 = 71;

    public final static int FRAME_stand111 = 72;

    public final static int FRAME_stand112 = 73;

    public final static int FRAME_stand113 = 74;

    public final static int FRAME_stand114 = 75;

    public final static int FRAME_stand115 = 76;

    public final static int FRAME_stand116 = 77;

    public final static int FRAME_stand117 = 78;

    public final static int FRAME_stand118 = 79;

    public final static int FRAME_stand119 = 80;

    public final static int FRAME_stand120 = 81;

    public final static int FRAME_stand121 = 82;

    public final static int FRAME_stand122 = 83;

    public final static int FRAME_stand123 = 84;

    public final static int FRAME_stand124 = 85;

    public final static int FRAME_stand125 = 86;

    public final static int FRAME_stand126 = 87;

    public final static int FRAME_stand127 = 88;

    public final static int FRAME_stand128 = 89;

    public final static int FRAME_stand129 = 90;

    public final static int FRAME_stand130 = 91;

    public final static int FRAME_stand131 = 92;

    public final static int FRAME_stand132 = 93;

    public final static int FRAME_stand133 = 94;

    public final static int FRAME_stand134 = 95;

    public final static int FRAME_stand135 = 96;

    public final static int FRAME_stand136 = 97;

    public final static int FRAME_stand137 = 98;

    public final static int FRAME_stand138 = 99;

    public final static int FRAME_stand139 = 100;

    public final static int FRAME_stand140 = 101;

    public final static int FRAME_stand141 = 102;

    public final static int FRAME_stand142 = 103;

    public final static int FRAME_stand143 = 104;

    public final static int FRAME_stand144 = 105;

    public final static int FRAME_stand145 = 106;

    public final static int FRAME_stand146 = 107;

    public final static int FRAME_stand147 = 108;

    public final static int FRAME_stand148 = 109;

    public final static int FRAME_stand149 = 110;

    public final static int FRAME_stand150 = 111;

    public final static int FRAME_stand151 = 112;

    public final static int FRAME_stand152 = 113;

    public final static int FRAME_stand153 = 114;

    public final static int FRAME_stand154 = 115;

    public final static int FRAME_stand155 = 116;

    public final static int FRAME_stand156 = 117;

    public final static int FRAME_stand157 = 118;

    public final static int FRAME_stand158 = 119;

    public final static int FRAME_stand159 = 120;

    public final static int FRAME_stand160 = 121;

    public final static int FRAME_stand161 = 122;

    public final static int FRAME_stand162 = 123;

    public final static int FRAME_stand163 = 124;

    public final static int FRAME_stand164 = 125;

    public final static int FRAME_walk01 = 126;

    public final static int FRAME_walk02 = 127;

    public final static int FRAME_walk03 = 128;

    public final static int FRAME_walk04 = 129;

    public final static int FRAME_walk05 = 130;

    public final static int FRAME_walk06 = 131;

    public final static int FRAME_walk07 = 132;

    public final static int FRAME_walk08 = 133;

    public final static int FRAME_walk09 = 134;

    public final static int FRAME_walk10 = 135;

    public final static int FRAME_walk11 = 136;

    public final static int FRAME_walk12 = 137;

    public final static int FRAME_walk13 = 138;

    public final static int FRAME_walk14 = 139;

    public final static int FRAME_walk15 = 140;

    public final static int FRAME_walk16 = 141;

    public final static int FRAME_walk17 = 142;

    public final static int FRAME_walk18 = 143;

    public final static int FRAME_walk19 = 144;

    public final static int FRAME_walk20 = 145;

    public final static int FRAME_walk21 = 146;

    public final static int FRAME_walk22 = 147;

    public final static int FRAME_walk23 = 148;

    public final static float MODEL_SCALE = 1.000000f;

    static int sound_swing;

    static int sound_hit;

    static int sound_hit2;

    static int sound_death;

    static int sound_idle;

    static int sound_pain1;

    static int sound_pain2;

    static int sound_sight;

    static int sound_search;

    static int sound_step1;

    static int sound_step2;

    static int sound_step3;

    static int sound_thud;

    //
    //	SOUNDS
    //
    static EntityThinkAdapter mutant_step = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_step"; }
        public boolean think(Entity self) {
            int n;
            n = (Lib.rand() + 1) % 3;
            if (n == 0)
                GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_step1, 1,
                        Defines.ATTN_NORM, 0);
            else if (n == 1)
                GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_step2, 1,
                        Defines.ATTN_NORM, 0);
            else
                GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_step3, 1,
                        Defines.ATTN_NORM, 0);
            return true;
        }
    };

    static EntInteractAdapter mutant_sight = new EntInteractAdapter() {
    	public String getID(){ return "mutant_sight"; }
        public boolean interact(Entity self, Entity other) {
            GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_sight, 1,
                    Defines.ATTN_NORM, 0);
            return true;
        }
    };

    static EntityThinkAdapter mutant_search = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_search"; }
        public boolean think(Entity self) {
            GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_search, 1,
                    Defines.ATTN_NORM, 0);
            return true;
        }
    };

    static EntityThinkAdapter mutant_swing = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_swing"; }
        public boolean think(Entity self) {
            GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_swing, 1,
                    Defines.ATTN_NORM, 0);
            return true;
        }
    };

    //
    //	STAND
    //

    static Frame mutant_frames_stand[] = new Frame[] {
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            // 10)

            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            // 20)

            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            // 30)

            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            // 40)

            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            // 50)

            new Frame(GameAI.ai_stand, 0, null) };

    static MonsterMove mutant_move_stand = new MonsterMove(FRAME_stand101,
            FRAME_stand151, mutant_frames_stand, null);

    static EntityThinkAdapter mutant_stand = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_stand"; }
        public boolean think(Entity self) {
            self.monsterinfo.currentmove = mutant_move_stand;
            return true;
        }
    };

    //
    //	IDLE
    //

    static EntityThinkAdapter mutant_idle_loop = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_idle_loop"; }
        public boolean think(Entity self) {
            if (Lib.random() < 0.75)
                self.monsterinfo.nextframe = FRAME_stand155;
            return true;
        }
    };

    static Frame mutant_frames_idle[] = new Frame[] {
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            // scratch loop start
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, mutant_idle_loop),
            // scratch loop end
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null),
            new Frame(GameAI.ai_stand, 0, null) };

    static MonsterMove mutant_move_idle = new MonsterMove(FRAME_stand152,
            FRAME_stand164, mutant_frames_idle, mutant_stand);

    static EntityThinkAdapter mutant_idle = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_idle"; }
        public boolean think(Entity self) {
            self.monsterinfo.currentmove = mutant_move_idle;
            GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_idle, 1,
                    Defines.ATTN_IDLE, 0);
            return true;
        }
    };

    //
    //	WALK
    //

    static Frame mutant_frames_walk[] = new Frame[] {
            new Frame(GameAI.ai_walk, 3, null),
            new Frame(GameAI.ai_walk, 1, null),
            new Frame(GameAI.ai_walk, 5, null),
            new Frame(GameAI.ai_walk, 10, null),
            new Frame(GameAI.ai_walk, 13, null),
            new Frame(GameAI.ai_walk, 10, null),
            new Frame(GameAI.ai_walk, 0, null),
            new Frame(GameAI.ai_walk, 5, null),
            new Frame(GameAI.ai_walk, 6, null),
            new Frame(GameAI.ai_walk, 16, null),
            new Frame(GameAI.ai_walk, 15, null),
            new Frame(GameAI.ai_walk, 6, null) };

    static MonsterMove mutant_move_walk = new MonsterMove(FRAME_walk05, FRAME_walk16,
            mutant_frames_walk, null);

    static EntityThinkAdapter mutant_walk_loop = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_walk_loop"; }
        public boolean think(Entity self) {
            self.monsterinfo.currentmove = mutant_move_walk;
            return true;
        }
    };

    static Frame mutant_frames_start_walk[] = new Frame[] {
            new Frame(GameAI.ai_walk, 5, null),
            new Frame(GameAI.ai_walk, 5, null),
            new Frame(GameAI.ai_walk, -2, null),
            new Frame(GameAI.ai_walk, 1, null) };

    static MonsterMove mutant_move_start_walk = new MonsterMove(FRAME_walk01,
            FRAME_walk04, mutant_frames_start_walk, mutant_walk_loop);

    static EntityThinkAdapter mutant_walk = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_walk"; }
        public boolean think(Entity self) {
            self.monsterinfo.currentmove = mutant_move_start_walk;
            return true;
        }
    };

    //
    //	RUN
    //

    static Frame mutant_frames_run[] = new Frame[] {
            new Frame(GameAI.ai_run, 40, null),
            new Frame(GameAI.ai_run, 40, mutant_step),
            new Frame(GameAI.ai_run, 24, null),
            new Frame(GameAI.ai_run, 5, mutant_step),
            new Frame(GameAI.ai_run, 17, null),
            new Frame(GameAI.ai_run, 10, null) };

    static MonsterMove mutant_move_run = new MonsterMove(FRAME_run03, FRAME_run08,
            mutant_frames_run, null);

    static EntityThinkAdapter mutant_run = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_run"; }
        public boolean think(Entity self) {
            if ((self.monsterinfo.aiflags & Defines.AI_STAND_GROUND) != 0)
                self.monsterinfo.currentmove = mutant_move_stand;
            else
                self.monsterinfo.currentmove = mutant_move_run;

            return true;
        }
    };

    //
    //	MELEE
    //

    static EntityThinkAdapter mutant_hit_left = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_hit_left"; }
        public boolean think(Entity self) {
            float[] aim = { 0, 0, 0 };

            Math3D.VectorSet(aim, Defines.MELEE_DISTANCE, self.mins[0], 8);
            if (GameWeapon.fire_hit(self, aim, (10 + (Lib.rand() % 5)), 100))
                GameBase.gi.sound(self, Defines.CHAN_WEAPON, sound_hit, 1,
                        Defines.ATTN_NORM, 0);
            else
                GameBase.gi.sound(self, Defines.CHAN_WEAPON, sound_swing, 1,
                        Defines.ATTN_NORM, 0);
            return true;
        }
    };

    static EntityThinkAdapter mutant_hit_right = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_hit_right"; }
        public boolean think(Entity self) {
            float[] aim = { 0, 0, 0 };

            Math3D.VectorSet(aim, Defines.MELEE_DISTANCE, self.maxs[0], 8);
            if (GameWeapon.fire_hit(self, aim, (10 + (Lib.rand() % 5)), 100))
                GameBase.gi.sound(self, Defines.CHAN_WEAPON, sound_hit2, 1,
                        Defines.ATTN_NORM, 0);
            else
                GameBase.gi.sound(self, Defines.CHAN_WEAPON, sound_swing, 1,
                        Defines.ATTN_NORM, 0);
            return true;
        }
    };

    static EntityThinkAdapter mutant_check_refire = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_check_refire"; }
        public boolean think(Entity self) {
            if (null == self.enemy || !self.enemy.inuse
                    || self.enemy.health <= 0)
                return true;

            if (((GameBase.skill.value == 3) && (Lib.random() < 0.5))
                    || (GameUtil.range(self, self.enemy) == Defines.RANGE_MELEE))
                self.monsterinfo.nextframe = FRAME_attack09;
            return true;
        }
    };

    static Frame mutant_frames_attack[] = new Frame[] {
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 0, mutant_hit_left),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 0, mutant_hit_right),
            new Frame(GameAI.ai_charge, 0, mutant_check_refire) };

    static MonsterMove mutant_move_attack = new MonsterMove(FRAME_attack09,
            FRAME_attack15, mutant_frames_attack, mutant_run);

    static EntityThinkAdapter mutant_melee = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_melee"; }
        public boolean think(Entity self) {
            self.monsterinfo.currentmove = mutant_move_attack;
            return true;
        }
    };

    //
    //	ATTACK
    //

    static EntityTouchAdapter mutant_jump_touch = new EntityTouchAdapter() {
    	public String getID(){ return "mutant_jump_touch"; }

        public void touch(Entity self, Entity other, Plane plane,
                Surface surf) {
            if (self.health <= 0) {
                self.touch = null;
                return;
            }

            if (other.takedamage != 0) {
                if (Math3D.VectorLength(self.velocity) > 400) {
                    float[] point = { 0, 0, 0 };
                    float[] normal = { 0, 0, 0 };
                    int damage;

                    Math3D.VectorCopy(self.velocity, normal);
                    Math3D.VectorNormalize(normal);
                    Math3D.VectorMA(self.s.origin, self.maxs[0], normal, point);
                    damage = (int) (40 + 10 * Lib.random());
                    GameCombat.T_Damage(other, self, self, self.velocity, point,
                            normal, damage, damage, 0, Defines.MOD_UNKNOWN);
                }
            }

            if (!ClientMonsterMethods.M_CheckBottom(self)) {
                if (self.groundentity != null) {
                    self.monsterinfo.nextframe = FRAME_attack02;
                    self.touch = null;
                }
                return;
            }

            self.touch = null;
        }
    };

    static EntityThinkAdapter mutant_jump_takeoff = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_jump_takeoff"; }
        public boolean think(Entity self) {

            float[] forward = { 0, 0, 0 };

            GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_sight, 1,
                    Defines.ATTN_NORM, 0);
            Math3D.AngleVectors(self.s.angles, forward, null, null);
            self.s.origin[2] += 1;
            Math3D.VectorScale(forward, 600, self.velocity);
            self.velocity[2] = 250;
            self.groundentity = null;
            self.monsterinfo.aiflags |= Defines.AI_DUCKED;
            self.monsterinfo.attack_finished = GameBase.level.time + 3;
            self.touch = mutant_jump_touch;
            return true;
        }
    };

    static EntityThinkAdapter mutant_check_landing = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_check_landing"; }
        public boolean think(Entity self) {
            if (self.groundentity != null) {
                GameBase.gi.sound(self, Defines.CHAN_WEAPON, sound_thud, 1,
                        Defines.ATTN_NORM, 0);
                self.monsterinfo.attack_finished = 0;
                self.monsterinfo.aiflags &= ~Defines.AI_DUCKED;
                return true;
            }

            if (GameBase.level.time > self.monsterinfo.attack_finished)
                self.monsterinfo.nextframe = FRAME_attack02;
            else
                self.monsterinfo.nextframe = FRAME_attack05;
            return true;
        }
    };

    static Frame mutant_frames_jump[] = new Frame[] {
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 17, null),
            new Frame(GameAI.ai_charge, 15, mutant_jump_takeoff),
            new Frame(GameAI.ai_charge, 15, null),
            new Frame(GameAI.ai_charge, 15, mutant_check_landing),
            new Frame(GameAI.ai_charge, 0, null),
            new Frame(GameAI.ai_charge, 3, null),
            new Frame(GameAI.ai_charge, 0, null) };

    static MonsterMove mutant_move_jump = new MonsterMove(FRAME_attack01,
            FRAME_attack08, mutant_frames_jump, mutant_run);

    static EntityThinkAdapter mutant_jump = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_jump"; }
        public boolean think(Entity self) {

            self.monsterinfo.currentmove = mutant_move_jump;
            return true;
        }
    };

    //
    //	CHECKATTACK
    //
    static EntityThinkAdapter mutant_check_melee = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_check_melee"; }
        public boolean think(Entity self) {
            if (GameUtil.range(self, self.enemy) == Defines.RANGE_MELEE)
                return true;
            return false;

        }
    };

    static EntityThinkAdapter mutant_check_jump = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_check_jump"; }
        public boolean think(Entity self) {

            float[] v = { 0, 0, 0 };
            float distance;

            if (self.absmin[2] > (self.enemy.absmin[2] + 0.75 * self.enemy.size[2]))
                return false;

            if (self.absmax[2] < (self.enemy.absmin[2] + 0.25 * self.enemy.size[2]))
                return false;

            v[0] = self.s.origin[0] - self.enemy.s.origin[0];
            v[1] = self.s.origin[1] - self.enemy.s.origin[1];
            v[2] = 0;
            distance = Math3D.VectorLength(v);

            if (distance < 100)
                return false;
            if (distance > 100) {
                if (Lib.random() < 0.9)
                    return false;
            }

            return true;
        }
    };

    static EntityThinkAdapter mutant_checkattack = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_checkattack"; }
        public boolean think(Entity self) {

            if (null == self.enemy || self.enemy.health <= 0)
                return false;

            if (mutant_check_melee.think(self)) {
                self.monsterinfo.attack_state = Defines.AS_MELEE;
                return true;
            }

            if (mutant_check_jump.think(self)) {
                self.monsterinfo.attack_state = Defines.AS_MISSILE;
                // FIXME play a jump sound here
                return true;
            }

            return false;
        }
    };

    //
    //	PAIN
    //

    static Frame mutant_frames_pain1[] = new Frame[] {
            new Frame(GameAI.ai_move, 4, null),
            new Frame(GameAI.ai_move, -3, null),
            new Frame(GameAI.ai_move, -8, null),
            new Frame(GameAI.ai_move, 2, null),
            new Frame(GameAI.ai_move, 5, null) };

    static MonsterMove mutant_move_pain1 = new MonsterMove(FRAME_pain101,
            FRAME_pain105, mutant_frames_pain1, mutant_run);

    static Frame mutant_frames_pain2[] = new Frame[] {
            new Frame(GameAI.ai_move, -24, null),
            new Frame(GameAI.ai_move, 11, null),
            new Frame(GameAI.ai_move, 5, null),
            new Frame(GameAI.ai_move, -2, null),
            new Frame(GameAI.ai_move, 6, null),
            new Frame(GameAI.ai_move, 4, null) };

    static MonsterMove mutant_move_pain2 = new MonsterMove(FRAME_pain201,
            FRAME_pain206, mutant_frames_pain2, mutant_run);

    static Frame mutant_frames_pain3[] = new Frame[] {
            new Frame(GameAI.ai_move, -22, null),
            new Frame(GameAI.ai_move, 3, null),
            new Frame(GameAI.ai_move, 3, null),
            new Frame(GameAI.ai_move, 2, null),
            new Frame(GameAI.ai_move, 1, null),
            new Frame(GameAI.ai_move, 1, null),
            new Frame(GameAI.ai_move, 6, null),
            new Frame(GameAI.ai_move, 3, null),
            new Frame(GameAI.ai_move, 2, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 1, null) };

    static MonsterMove mutant_move_pain3 = new MonsterMove(FRAME_pain301,
            FRAME_pain311, mutant_frames_pain3, mutant_run);

    static EntityPainAdapter mutant_pain = new EntityPainAdapter() {
    	public String getID(){ return "mutant_pain"; }
        public void pain(Entity self, Entity other, float kick, int damage) {
            float r;

            if (self.health < (self.max_health / 2))
                self.s.skinnum = 1;

            if (GameBase.level.time < self.pain_debounce_time)
                return;

            self.pain_debounce_time = GameBase.level.time + 3;

            if (GameBase.skill.value == 3)
                return; // no pain anims in nightmare

            r = Lib.random();
            if (r < 0.33) {
                GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_pain1, 1,
                        Defines.ATTN_NORM, 0);
                self.monsterinfo.currentmove = mutant_move_pain1;
            } else if (r < 0.66) {
                GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_pain2, 1,
                        Defines.ATTN_NORM, 0);
                self.monsterinfo.currentmove = mutant_move_pain2;
            } else {
                GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_pain1, 1,
                        Defines.ATTN_NORM, 0);
                self.monsterinfo.currentmove = mutant_move_pain3;
            }
        }
    };

    //
    //	DEATH
    //
    static EntityThinkAdapter mutant_dead = new EntityThinkAdapter() {
    	public String getID(){ return "mutant_dead"; }
        public boolean think(Entity self) {
            Math3D.VectorSet(self.mins, -16, -16, -24);
            Math3D.VectorSet(self.maxs, 16, 16, -8);
            self.movetype = Defines.MOVETYPE_TOSS;
            self.svflags |= Defines.SVF_DEADMONSTER;
            GameBase.gi.linkentity(self);

            ClientMonsterMethods.M_FlyCheck.think(self);
            return true;
        }
    };

    static Frame mutant_frames_death1[] = new Frame[] {
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null) };

    static MonsterMove mutant_move_death1 = new MonsterMove(FRAME_death101,
            FRAME_death109, mutant_frames_death1, mutant_dead);

    static Frame mutant_frames_death2[] = new Frame[] {
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null),
            new Frame(GameAI.ai_move, 0, null) };

    static MonsterMove mutant_move_death2 = new MonsterMove(FRAME_death201,
            FRAME_death210, mutant_frames_death2, mutant_dead);

    static EntityDieAdapter mutant_die = new EntityDieAdapter() {
    	public String getID(){ return "mutant_die"; }
        public void die(Entity self, Entity inflictor, Entity attacker,
                int damage, float[] point) {
            int n;

            if (self.health <= self.gib_health) {
                GameBase.gi
                        .sound(self, Defines.CHAN_VOICE, GameBase.gi
                                .soundindex("misc/udeath.wav"), 1,
                                Defines.ATTN_NORM, 0);
                for (n = 0; n < 2; n++)
                    GameMisc.ThrowGib(self, "models/objects/gibs/bone/tris.md2",
                            damage, Defines.GIB_ORGANIC);
                for (n = 0; n < 4; n++)
                    GameMisc.ThrowGib(self,
                            "models/objects/gibs/sm_meat/tris.md2", damage,
                            Defines.GIB_ORGANIC);
                GameMisc.ThrowHead(self, "models/objects/gibs/head2/tris.md2",
                        damage, Defines.GIB_ORGANIC);
                self.deadflag = Defines.DEAD_DEAD;
                return;
            }

            if (self.deadflag == Defines.DEAD_DEAD)
                return;

            GameBase.gi.sound(self, Defines.CHAN_VOICE, sound_death, 1,
                    Defines.ATTN_NORM, 0);
            self.deadflag = Defines.DEAD_DEAD;
            self.takedamage = Defines.DAMAGE_YES;
            self.s.skinnum = 1;

            if (Lib.random() < 0.5)
                self.monsterinfo.currentmove = mutant_move_death1;
            else
                self.monsterinfo.currentmove = mutant_move_death2;
        }
    };

    //
    //	SPAWN
    //

    /*
     * QUAKED monster_mutant (1 .5 0) (-32 -32 -24) (32 32 32) Ambush
     * Trigger_Spawn Sight
     */
    public static EntityThinkAdapter SP_monster_mutant = new EntityThinkAdapter() {
    	public String getID(){ return "SP_monster_mutant"; }
        public boolean think(Entity self) {
            if (GameBase.deathmatch.value != 0) {
                GameUtil.G_FreeEdict(self);
                return false;
            }

            sound_swing = GameBase.gi.soundindex("mutant/mutatck1.wav");
            sound_hit = GameBase.gi.soundindex("mutant/mutatck2.wav");
            sound_hit2 = GameBase.gi.soundindex("mutant/mutatck3.wav");
            sound_death = GameBase.gi.soundindex("mutant/mutdeth1.wav");
            sound_idle = GameBase.gi.soundindex("mutant/mutidle1.wav");
            sound_pain1 = GameBase.gi.soundindex("mutant/mutpain1.wav");
            sound_pain2 = GameBase.gi.soundindex("mutant/mutpain2.wav");
            sound_sight = GameBase.gi.soundindex("mutant/mutsght1.wav");
            sound_search = GameBase.gi.soundindex("mutant/mutsrch1.wav");
            sound_step1 = GameBase.gi.soundindex("mutant/step1.wav");
            sound_step2 = GameBase.gi.soundindex("mutant/step2.wav");
            sound_step3 = GameBase.gi.soundindex("mutant/step3.wav");
            sound_thud = GameBase.gi.soundindex("mutant/thud1.wav");

            self.movetype = Defines.MOVETYPE_STEP;
            self.solid = Defines.SOLID_BBOX;
            self.s.modelindex = GameBase.gi
                    .modelindex("models/monsters/mutant/tris.md2");
            Math3D.VectorSet(self.mins, -32, -32, -24);
            Math3D.VectorSet(self.maxs, 32, 32, 48);

            self.health = 300;
            self.gib_health = -120;
            self.mass = 300;

            self.pain = mutant_pain;
            self.die = mutant_die;

            self.monsterinfo.stand = mutant_stand;
            self.monsterinfo.walk = mutant_walk;
            self.monsterinfo.run = mutant_run;
            self.monsterinfo.dodge = null;
            self.monsterinfo.attack = mutant_jump;
            self.monsterinfo.melee = mutant_melee;
            self.monsterinfo.sight = mutant_sight;
            self.monsterinfo.search = mutant_search;
            self.monsterinfo.idle = mutant_idle;
            self.monsterinfo.checkattack = mutant_checkattack;

            GameBase.gi.linkentity(self);

            self.monsterinfo.currentmove = mutant_move_stand;

            self.monsterinfo.scale = MODEL_SCALE;
            GameAI.walkmonster_start.think(self);
            return true;
        }
    };
}
