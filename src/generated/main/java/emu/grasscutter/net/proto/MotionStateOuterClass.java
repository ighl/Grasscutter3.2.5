// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class MotionStateOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private MotionStateOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MotionStateOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011MotionState.proto*¢\r\n\u000bMotionState\u0012\u0015\n\u0011MOTION_STATE_NONE\u0010\u0000\u0012\u0016\n\u0012MOTION_STATE_RESET\u0010\u0001\u0012\u0018\n\u0014MOTION_STATE_STANDBY\u0010\u0002\u0012\u001d\n\u0019MOTION_STATE_STANDBY_MOVE\u0010\u0003\u0012\u0015\n\u0011MOTION_STATE_WALK\u0010\u0004\u0012\u0014\n\u0010MOTION_STATE_RUN\u0010\u0005\u0012\u0015\n\u0011MOTION_STATE_DASH\u0010\u0006\u0012\u0016\n\u0012MOTION_STATE_CLIMB\u0010\u0007\u0012\u001b\n\u0017MOTION_STATE_CLIMB_JUMP\u0010\b\u0012!\n\u001dMOTION_STATE_STANDBY_TO_CLIMB\u0010\t\u0012\u0016\n\u0012MOTION_STATE_FIGHT\u0010\n\u0012\u0015\n\u0011MOTION_STATE_JUMP\u0010\u000b\u0012\u0015\n\u0011MOTION_STATE_DROP\u0010\f\u0012\u0014\n\u0010MOTION_STATE_FLY\u0010\r\u0012\u001a\n\u0016MOTION_STATE_SWIM_MOVE\u0010\u000e\u0012\u001a\n\u0016MOTION_STATE_SWIM_IDLE\u0010\u000f\u0012\u001a\n\u0016MOTION_STATE_SWIM_DASH\u0010\u0010\u0012\u001a\n\u0016MOTION_STATE_SWIM_JUMP\u0010\u0011\u0012\u0015\n\u0011MOTION_STATE_SLIP\u0010\u0012\u0012\u001c\n\u0018MOTION_STATE_GO_UPSTAIRS\u0010\u0013\u0012\u001f\n\u001bMOTION_STATE_FALL_ON_GROUND\u0010\u0014\u0012)\n%MOTION_STATE_JUMP_UP_WALL_FOR_STANDBY\u0010\u0015\u0012\u001e\n\u001aMOTION_STATE_JUMP_OFF_WALL\u0010\u0016\u0012\u001c\n\u0018MOTION_STATE_POWERED_FLY\u0010\u0017\u0012\u001c\n\u0018MOTION_STATE_LADDER_IDLE\u0010\u0018\u0012\u001c\n\u0018MOTION_STATE_LADDER_MOVE\u0010\u0019\u0012\u001c\n\u0018MOTION_STATE_LADDER_SLIP\u0010\u001a\u0012\"\n\u001eMOTION_STATE_STANDBY_TO_LADDER\u0010\u001b\u0012\"\n\u001eMOTION_STATE_LADDER_TO_STANDBY\u0010\u001c\u0012\u001f\n\u001bMOTION_STATE_DANGER_STANDBY\u0010\u001d\u0012$\n MOTION_STATE_DANGER_STANDBY_MOVE\u0010\u001e\u0012\u001c\n\u0018MOTION_STATE_DANGER_WALK\u0010\u001f\u0012\u001b\n\u0017MOTION_STATE_DANGER_RUN\u0010 \u0012\u001c\n\u0018MOTION_STATE_DANGER_DASH\u0010!\u0012\u001c\n\u0018MOTION_STATE_CROUCH_IDLE\u0010\"\u0012\u001c\n\u0018MOTION_STATE_CROUCH_MOVE\u0010#\u0012\u001c\n\u0018MOTION_STATE_CROUCH_ROLL\u0010$\u0012\u0017\n\u0013MOTION_STATE_NOTIFY\u0010%\u0012\u001b\n\u0017MOTION_STATE_LAND_SPEED\u0010&\u0012\u001e\n\u001aMOTION_STATE_MOVE_FAIL_ACK\u0010'\u0012\u001a\n\u0016MOTION_STATE_WATERFALL\u0010(\u0012\"\n\u001eMOTION_STATE_DASH_BEFORE_SHAKE\u0010)\u0012\u0019\n\u0015MOTION_STATE_SIT_IDLE\u0010*\u0012\u001e\n\u001aMOTION_STATE_FORCE_SET_POS\u0010+\u0012!\n\u001dMOTION_STATE_QUEST_FORCE_DRAG\u0010,\u0012\u001d\n\u0019MOTION_STATE_FOLLOW_ROUTE\u0010-\u0012\u001f\n\u001bMOTION_STATE_SKIFF_BOARDING\u0010.\u0012\u001d\n\u0019MOTION_STATE_SKIFF_NORMAL\u0010/\u0012\u001b\n\u0017MOTION_STATE_SKIFF_DASH\u00100\u0012#\n\u001fMOTION_STATE_SKIFF_POWERED_DASH\u00101\u0012 \n\u001cMOTION_STATE_DESTROY_VEHICLE\u00102\u0012\u0019\n\u0015MOTION_STATE_FLY_IDLE\u00103\u0012\u0019\n\u0015MOTION_STATE_FLY_SLOW\u00104\u0012\u0019\n\u0015MOTION_STATE_FLY_FAST\u00105\u0012\u0014\n\u0010MOTION_STATE_NUM\u00106\u0012$\n MOTION_STATE_Unk2700_OOFNNHKLEFE\u00107\u0012$\n MOTION_STATE_Unk2700_KMIGLMEGNOK\u00108B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MotionStateOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum MotionState implements ProtocolMessageEnum
    {
        MOTION_STATE_NONE(0), 
        MOTION_STATE_RESET(1), 
        MOTION_STATE_STANDBY(2), 
        MOTION_STATE_STANDBY_MOVE(3), 
        MOTION_STATE_WALK(4), 
        MOTION_STATE_RUN(5), 
        MOTION_STATE_DASH(6), 
        MOTION_STATE_CLIMB(7), 
        MOTION_STATE_CLIMB_JUMP(8), 
        MOTION_STATE_STANDBY_TO_CLIMB(9), 
        MOTION_STATE_FIGHT(10), 
        MOTION_STATE_JUMP(11), 
        MOTION_STATE_DROP(12), 
        MOTION_STATE_FLY(13), 
        MOTION_STATE_SWIM_MOVE(14), 
        MOTION_STATE_SWIM_IDLE(15), 
        MOTION_STATE_SWIM_DASH(16), 
        MOTION_STATE_SWIM_JUMP(17), 
        MOTION_STATE_SLIP(18), 
        MOTION_STATE_GO_UPSTAIRS(19), 
        MOTION_STATE_FALL_ON_GROUND(20), 
        MOTION_STATE_JUMP_UP_WALL_FOR_STANDBY(21), 
        MOTION_STATE_JUMP_OFF_WALL(22), 
        MOTION_STATE_POWERED_FLY(23), 
        MOTION_STATE_LADDER_IDLE(24), 
        MOTION_STATE_LADDER_MOVE(25), 
        MOTION_STATE_LADDER_SLIP(26), 
        MOTION_STATE_STANDBY_TO_LADDER(27), 
        MOTION_STATE_LADDER_TO_STANDBY(28), 
        MOTION_STATE_DANGER_STANDBY(29), 
        MOTION_STATE_DANGER_STANDBY_MOVE(30), 
        MOTION_STATE_DANGER_WALK(31), 
        MOTION_STATE_DANGER_RUN(32), 
        MOTION_STATE_DANGER_DASH(33), 
        MOTION_STATE_CROUCH_IDLE(34), 
        MOTION_STATE_CROUCH_MOVE(35), 
        MOTION_STATE_CROUCH_ROLL(36), 
        MOTION_STATE_NOTIFY(37), 
        MOTION_STATE_LAND_SPEED(38), 
        MOTION_STATE_MOVE_FAIL_ACK(39), 
        MOTION_STATE_WATERFALL(40), 
        MOTION_STATE_DASH_BEFORE_SHAKE(41), 
        MOTION_STATE_SIT_IDLE(42), 
        MOTION_STATE_FORCE_SET_POS(43), 
        MOTION_STATE_QUEST_FORCE_DRAG(44), 
        MOTION_STATE_FOLLOW_ROUTE(45), 
        MOTION_STATE_SKIFF_BOARDING(46), 
        MOTION_STATE_SKIFF_NORMAL(47), 
        MOTION_STATE_SKIFF_DASH(48), 
        MOTION_STATE_SKIFF_POWERED_DASH(49), 
        MOTION_STATE_DESTROY_VEHICLE(50), 
        MOTION_STATE_FLY_IDLE(51), 
        MOTION_STATE_FLY_SLOW(52), 
        MOTION_STATE_FLY_FAST(53), 
        MOTION_STATE_NUM(54), 
        MOTION_STATE_Unk2700_OOFNNHKLEFE(55), 
        MOTION_STATE_Unk2700_KMIGLMEGNOK(56), 
        UNRECOGNIZED(-1);
        
        public static final int MOTION_STATE_NONE_VALUE = 0;
        public static final int MOTION_STATE_RESET_VALUE = 1;
        public static final int MOTION_STATE_STANDBY_VALUE = 2;
        public static final int MOTION_STATE_STANDBY_MOVE_VALUE = 3;
        public static final int MOTION_STATE_WALK_VALUE = 4;
        public static final int MOTION_STATE_RUN_VALUE = 5;
        public static final int MOTION_STATE_DASH_VALUE = 6;
        public static final int MOTION_STATE_CLIMB_VALUE = 7;
        public static final int MOTION_STATE_CLIMB_JUMP_VALUE = 8;
        public static final int MOTION_STATE_STANDBY_TO_CLIMB_VALUE = 9;
        public static final int MOTION_STATE_FIGHT_VALUE = 10;
        public static final int MOTION_STATE_JUMP_VALUE = 11;
        public static final int MOTION_STATE_DROP_VALUE = 12;
        public static final int MOTION_STATE_FLY_VALUE = 13;
        public static final int MOTION_STATE_SWIM_MOVE_VALUE = 14;
        public static final int MOTION_STATE_SWIM_IDLE_VALUE = 15;
        public static final int MOTION_STATE_SWIM_DASH_VALUE = 16;
        public static final int MOTION_STATE_SWIM_JUMP_VALUE = 17;
        public static final int MOTION_STATE_SLIP_VALUE = 18;
        public static final int MOTION_STATE_GO_UPSTAIRS_VALUE = 19;
        public static final int MOTION_STATE_FALL_ON_GROUND_VALUE = 20;
        public static final int MOTION_STATE_JUMP_UP_WALL_FOR_STANDBY_VALUE = 21;
        public static final int MOTION_STATE_JUMP_OFF_WALL_VALUE = 22;
        public static final int MOTION_STATE_POWERED_FLY_VALUE = 23;
        public static final int MOTION_STATE_LADDER_IDLE_VALUE = 24;
        public static final int MOTION_STATE_LADDER_MOVE_VALUE = 25;
        public static final int MOTION_STATE_LADDER_SLIP_VALUE = 26;
        public static final int MOTION_STATE_STANDBY_TO_LADDER_VALUE = 27;
        public static final int MOTION_STATE_LADDER_TO_STANDBY_VALUE = 28;
        public static final int MOTION_STATE_DANGER_STANDBY_VALUE = 29;
        public static final int MOTION_STATE_DANGER_STANDBY_MOVE_VALUE = 30;
        public static final int MOTION_STATE_DANGER_WALK_VALUE = 31;
        public static final int MOTION_STATE_DANGER_RUN_VALUE = 32;
        public static final int MOTION_STATE_DANGER_DASH_VALUE = 33;
        public static final int MOTION_STATE_CROUCH_IDLE_VALUE = 34;
        public static final int MOTION_STATE_CROUCH_MOVE_VALUE = 35;
        public static final int MOTION_STATE_CROUCH_ROLL_VALUE = 36;
        public static final int MOTION_STATE_NOTIFY_VALUE = 37;
        public static final int MOTION_STATE_LAND_SPEED_VALUE = 38;
        public static final int MOTION_STATE_MOVE_FAIL_ACK_VALUE = 39;
        public static final int MOTION_STATE_WATERFALL_VALUE = 40;
        public static final int MOTION_STATE_DASH_BEFORE_SHAKE_VALUE = 41;
        public static final int MOTION_STATE_SIT_IDLE_VALUE = 42;
        public static final int MOTION_STATE_FORCE_SET_POS_VALUE = 43;
        public static final int MOTION_STATE_QUEST_FORCE_DRAG_VALUE = 44;
        public static final int MOTION_STATE_FOLLOW_ROUTE_VALUE = 45;
        public static final int MOTION_STATE_SKIFF_BOARDING_VALUE = 46;
        public static final int MOTION_STATE_SKIFF_NORMAL_VALUE = 47;
        public static final int MOTION_STATE_SKIFF_DASH_VALUE = 48;
        public static final int MOTION_STATE_SKIFF_POWERED_DASH_VALUE = 49;
        public static final int MOTION_STATE_DESTROY_VEHICLE_VALUE = 50;
        public static final int MOTION_STATE_FLY_IDLE_VALUE = 51;
        public static final int MOTION_STATE_FLY_SLOW_VALUE = 52;
        public static final int MOTION_STATE_FLY_FAST_VALUE = 53;
        public static final int MOTION_STATE_NUM_VALUE = 54;
        public static final int MOTION_STATE_Unk2700_OOFNNHKLEFE_VALUE = 55;
        public static final int MOTION_STATE_Unk2700_KMIGLMEGNOK_VALUE = 56;
        private static final Internal.EnumLiteMap<MotionState> internalValueMap;
        private static final MotionState[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == MotionState.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static MotionState valueOf(final int value) {
            return forNumber(value);
        }
        
        public static MotionState forNumber(final int value) {
            switch (value) {
                case 0: {
                    return MotionState.MOTION_STATE_NONE;
                }
                case 1: {
                    return MotionState.MOTION_STATE_RESET;
                }
                case 2: {
                    return MotionState.MOTION_STATE_STANDBY;
                }
                case 3: {
                    return MotionState.MOTION_STATE_STANDBY_MOVE;
                }
                case 4: {
                    return MotionState.MOTION_STATE_WALK;
                }
                case 5: {
                    return MotionState.MOTION_STATE_RUN;
                }
                case 6: {
                    return MotionState.MOTION_STATE_DASH;
                }
                case 7: {
                    return MotionState.MOTION_STATE_CLIMB;
                }
                case 8: {
                    return MotionState.MOTION_STATE_CLIMB_JUMP;
                }
                case 9: {
                    return MotionState.MOTION_STATE_STANDBY_TO_CLIMB;
                }
                case 10: {
                    return MotionState.MOTION_STATE_FIGHT;
                }
                case 11: {
                    return MotionState.MOTION_STATE_JUMP;
                }
                case 12: {
                    return MotionState.MOTION_STATE_DROP;
                }
                case 13: {
                    return MotionState.MOTION_STATE_FLY;
                }
                case 14: {
                    return MotionState.MOTION_STATE_SWIM_MOVE;
                }
                case 15: {
                    return MotionState.MOTION_STATE_SWIM_IDLE;
                }
                case 16: {
                    return MotionState.MOTION_STATE_SWIM_DASH;
                }
                case 17: {
                    return MotionState.MOTION_STATE_SWIM_JUMP;
                }
                case 18: {
                    return MotionState.MOTION_STATE_SLIP;
                }
                case 19: {
                    return MotionState.MOTION_STATE_GO_UPSTAIRS;
                }
                case 20: {
                    return MotionState.MOTION_STATE_FALL_ON_GROUND;
                }
                case 21: {
                    return MotionState.MOTION_STATE_JUMP_UP_WALL_FOR_STANDBY;
                }
                case 22: {
                    return MotionState.MOTION_STATE_JUMP_OFF_WALL;
                }
                case 23: {
                    return MotionState.MOTION_STATE_POWERED_FLY;
                }
                case 24: {
                    return MotionState.MOTION_STATE_LADDER_IDLE;
                }
                case 25: {
                    return MotionState.MOTION_STATE_LADDER_MOVE;
                }
                case 26: {
                    return MotionState.MOTION_STATE_LADDER_SLIP;
                }
                case 27: {
                    return MotionState.MOTION_STATE_STANDBY_TO_LADDER;
                }
                case 28: {
                    return MotionState.MOTION_STATE_LADDER_TO_STANDBY;
                }
                case 29: {
                    return MotionState.MOTION_STATE_DANGER_STANDBY;
                }
                case 30: {
                    return MotionState.MOTION_STATE_DANGER_STANDBY_MOVE;
                }
                case 31: {
                    return MotionState.MOTION_STATE_DANGER_WALK;
                }
                case 32: {
                    return MotionState.MOTION_STATE_DANGER_RUN;
                }
                case 33: {
                    return MotionState.MOTION_STATE_DANGER_DASH;
                }
                case 34: {
                    return MotionState.MOTION_STATE_CROUCH_IDLE;
                }
                case 35: {
                    return MotionState.MOTION_STATE_CROUCH_MOVE;
                }
                case 36: {
                    return MotionState.MOTION_STATE_CROUCH_ROLL;
                }
                case 37: {
                    return MotionState.MOTION_STATE_NOTIFY;
                }
                case 38: {
                    return MotionState.MOTION_STATE_LAND_SPEED;
                }
                case 39: {
                    return MotionState.MOTION_STATE_MOVE_FAIL_ACK;
                }
                case 40: {
                    return MotionState.MOTION_STATE_WATERFALL;
                }
                case 41: {
                    return MotionState.MOTION_STATE_DASH_BEFORE_SHAKE;
                }
                case 42: {
                    return MotionState.MOTION_STATE_SIT_IDLE;
                }
                case 43: {
                    return MotionState.MOTION_STATE_FORCE_SET_POS;
                }
                case 44: {
                    return MotionState.MOTION_STATE_QUEST_FORCE_DRAG;
                }
                case 45: {
                    return MotionState.MOTION_STATE_FOLLOW_ROUTE;
                }
                case 46: {
                    return MotionState.MOTION_STATE_SKIFF_BOARDING;
                }
                case 47: {
                    return MotionState.MOTION_STATE_SKIFF_NORMAL;
                }
                case 48: {
                    return MotionState.MOTION_STATE_SKIFF_DASH;
                }
                case 49: {
                    return MotionState.MOTION_STATE_SKIFF_POWERED_DASH;
                }
                case 50: {
                    return MotionState.MOTION_STATE_DESTROY_VEHICLE;
                }
                case 51: {
                    return MotionState.MOTION_STATE_FLY_IDLE;
                }
                case 52: {
                    return MotionState.MOTION_STATE_FLY_SLOW;
                }
                case 53: {
                    return MotionState.MOTION_STATE_FLY_FAST;
                }
                case 54: {
                    return MotionState.MOTION_STATE_NUM;
                }
                case 55: {
                    return MotionState.MOTION_STATE_Unk2700_OOFNNHKLEFE;
                }
                case 56: {
                    return MotionState.MOTION_STATE_Unk2700_KMIGLMEGNOK;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<MotionState> internalGetValueMap() {
            return MotionState.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == MotionState.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MotionStateOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static MotionState valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return MotionState.UNRECOGNIZED;
            }
            return MotionState.VALUES[desc.getIndex()];
        }
        
        private MotionState(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ MotionState[] value() {
            return new MotionState[] { MotionState.MOTION_STATE_NONE, MotionState.MOTION_STATE_RESET, MotionState.MOTION_STATE_STANDBY, MotionState.MOTION_STATE_STANDBY_MOVE, MotionState.MOTION_STATE_WALK, MotionState.MOTION_STATE_RUN, MotionState.MOTION_STATE_DASH, MotionState.MOTION_STATE_CLIMB, MotionState.MOTION_STATE_CLIMB_JUMP, MotionState.MOTION_STATE_STANDBY_TO_CLIMB, MotionState.MOTION_STATE_FIGHT, MotionState.MOTION_STATE_JUMP, MotionState.MOTION_STATE_DROP, MotionState.MOTION_STATE_FLY, MotionState.MOTION_STATE_SWIM_MOVE, MotionState.MOTION_STATE_SWIM_IDLE, MotionState.MOTION_STATE_SWIM_DASH, MotionState.MOTION_STATE_SWIM_JUMP, MotionState.MOTION_STATE_SLIP, MotionState.MOTION_STATE_GO_UPSTAIRS, MotionState.MOTION_STATE_FALL_ON_GROUND, MotionState.MOTION_STATE_JUMP_UP_WALL_FOR_STANDBY, MotionState.MOTION_STATE_JUMP_OFF_WALL, MotionState.MOTION_STATE_POWERED_FLY, MotionState.MOTION_STATE_LADDER_IDLE, MotionState.MOTION_STATE_LADDER_MOVE, MotionState.MOTION_STATE_LADDER_SLIP, MotionState.MOTION_STATE_STANDBY_TO_LADDER, MotionState.MOTION_STATE_LADDER_TO_STANDBY, MotionState.MOTION_STATE_DANGER_STANDBY, MotionState.MOTION_STATE_DANGER_STANDBY_MOVE, MotionState.MOTION_STATE_DANGER_WALK, MotionState.MOTION_STATE_DANGER_RUN, MotionState.MOTION_STATE_DANGER_DASH, MotionState.MOTION_STATE_CROUCH_IDLE, MotionState.MOTION_STATE_CROUCH_MOVE, MotionState.MOTION_STATE_CROUCH_ROLL, MotionState.MOTION_STATE_NOTIFY, MotionState.MOTION_STATE_LAND_SPEED, MotionState.MOTION_STATE_MOVE_FAIL_ACK, MotionState.MOTION_STATE_WATERFALL, MotionState.MOTION_STATE_DASH_BEFORE_SHAKE, MotionState.MOTION_STATE_SIT_IDLE, MotionState.MOTION_STATE_FORCE_SET_POS, MotionState.MOTION_STATE_QUEST_FORCE_DRAG, MotionState.MOTION_STATE_FOLLOW_ROUTE, MotionState.MOTION_STATE_SKIFF_BOARDING, MotionState.MOTION_STATE_SKIFF_NORMAL, MotionState.MOTION_STATE_SKIFF_DASH, MotionState.MOTION_STATE_SKIFF_POWERED_DASH, MotionState.MOTION_STATE_DESTROY_VEHICLE, MotionState.MOTION_STATE_FLY_IDLE, MotionState.MOTION_STATE_FLY_SLOW, MotionState.MOTION_STATE_FLY_FAST, MotionState.MOTION_STATE_NUM, MotionState.MOTION_STATE_Unk2700_OOFNNHKLEFE, MotionState.MOTION_STATE_Unk2700_KMIGLMEGNOK, MotionState.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<MotionState>() {
                @Override
                public MotionState findValueByNumber(final int number) {
                    return MotionState.forNumber(number);
                }
            };

        }
    }
}
