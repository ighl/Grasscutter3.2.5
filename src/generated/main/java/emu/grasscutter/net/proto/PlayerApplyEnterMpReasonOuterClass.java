// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Descriptors;

public final class PlayerApplyEnterMpReasonOuterClass
{
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerApplyEnterMpReasonOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerApplyEnterMpReasonOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001ePlayerApplyEnterMpReason.proto*\u00cf\u0002\n\u0018PlayerApplyEnterMpReason\u0012\u000f\n\u000bPlayerJudge\u0010\u0000\u0012\u0014\n\u0010SceneCannotEnter\u0010\u0001\u0012\u0017\n\u0013PlayerCannotEnterMp\u0010\u0002\u0012\u000f\n\u000bSystemJudge\u0010\u0003\u0012\u0018\n\u0014AllowEnterPlayerFull\u0010\u0004\u0012\u001b\n\u0017WorldLevelLowerThanHost\u0010\u0005\u0012\u000f\n\u000bHostInMatch\u0010\u0006\u0012\u0015\n\u0011PlayerInBlacklist\u0010\u0007\u0012\u001b\n\u0017PsPlayerNotAcceptOthers\u0010\b\u0012\u0011\n\rHostIsBlocked\u0010\t\u0012\u001d\n\u0019OtherDataVersionNotLatest\u0010\n\u0012\u0018\n\u0014DataVersionNotLatest\u0010\u000b\u0012\u001a\n\u0016PlayerNotInPlayerWorld\u0010\fB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerApplyEnterMpReasonOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
    }
    
    public enum PlayerApplyEnterMpReason implements ProtocolMessageEnum
    {
        PlayerJudge(0), 
        SceneCannotEnter(1), 
        PlayerCannotEnterMp(2), 
        SystemJudge(3), 
        AllowEnterPlayerFull(4), 
        WorldLevelLowerThanHost(5), 
        HostInMatch(6), 
        PlayerInBlacklist(7), 
        PsPlayerNotAcceptOthers(8), 
        HostIsBlocked(9), 
        OtherDataVersionNotLatest(10), 
        DataVersionNotLatest(11), 
        PlayerNotInPlayerWorld(12), 
        UNRECOGNIZED(-1);
        
        public static final int PlayerJudge_VALUE = 0;
        public static final int SceneCannotEnter_VALUE = 1;
        public static final int PlayerCannotEnterMp_VALUE = 2;
        public static final int SystemJudge_VALUE = 3;
        public static final int AllowEnterPlayerFull_VALUE = 4;
        public static final int WorldLevelLowerThanHost_VALUE = 5;
        public static final int HostInMatch_VALUE = 6;
        public static final int PlayerInBlacklist_VALUE = 7;
        public static final int PsPlayerNotAcceptOthers_VALUE = 8;
        public static final int HostIsBlocked_VALUE = 9;
        public static final int OtherDataVersionNotLatest_VALUE = 10;
        public static final int DataVersionNotLatest_VALUE = 11;
        public static final int PlayerNotInPlayerWorld_VALUE = 12;
        private static final Internal.EnumLiteMap<PlayerApplyEnterMpReason> internalValueMap;
        private static final PlayerApplyEnterMpReason[] VALUES;
        private final int value;
        
        @Override
        public final int getNumber() {
            if (this == PlayerApplyEnterMpReason.UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }
        
        @Deprecated
        public static PlayerApplyEnterMpReason valueOf(final int value) {
            return forNumber(value);
        }
        
        public static PlayerApplyEnterMpReason forNumber(final int value) {
            switch (value) {
                case 0: {
                    return PlayerApplyEnterMpReason.PlayerJudge;
                }
                case 1: {
                    return PlayerApplyEnterMpReason.SceneCannotEnter;
                }
                case 2: {
                    return PlayerApplyEnterMpReason.PlayerCannotEnterMp;
                }
                case 3: {
                    return PlayerApplyEnterMpReason.SystemJudge;
                }
                case 4: {
                    return PlayerApplyEnterMpReason.AllowEnterPlayerFull;
                }
                case 5: {
                    return PlayerApplyEnterMpReason.WorldLevelLowerThanHost;
                }
                case 6: {
                    return PlayerApplyEnterMpReason.HostInMatch;
                }
                case 7: {
                    return PlayerApplyEnterMpReason.PlayerInBlacklist;
                }
                case 8: {
                    return PlayerApplyEnterMpReason.PsPlayerNotAcceptOthers;
                }
                case 9: {
                    return PlayerApplyEnterMpReason.HostIsBlocked;
                }
                case 10: {
                    return PlayerApplyEnterMpReason.OtherDataVersionNotLatest;
                }
                case 11: {
                    return PlayerApplyEnterMpReason.DataVersionNotLatest;
                }
                case 12: {
                    return PlayerApplyEnterMpReason.PlayerNotInPlayerWorld;
                }
                default: {
                    return null;
                }
            }
        }
        
        public static Internal.EnumLiteMap<PlayerApplyEnterMpReason> internalGetValueMap() {
            return PlayerApplyEnterMpReason.internalValueMap;
        }
        
        @Override
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == PlayerApplyEnterMpReason.UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(this.ordinal());
        }
        
        @Override
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        
        public static final Descriptors.EnumDescriptor getDescriptor() {
            return PlayerApplyEnterMpReasonOuterClass.getDescriptor().getEnumTypes().get(0);
        }
        
        public static PlayerApplyEnterMpReason valueOf(final Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return PlayerApplyEnterMpReason.UNRECOGNIZED;
            }
            return PlayerApplyEnterMpReason.VALUES[desc.getIndex()];
        }
        
        private PlayerApplyEnterMpReason(final int value) {
            this.value = value;
        }
        
        private static /* synthetic */ PlayerApplyEnterMpReason[] value() {
            return new PlayerApplyEnterMpReason[] { PlayerApplyEnterMpReason.PlayerJudge, PlayerApplyEnterMpReason.SceneCannotEnter, PlayerApplyEnterMpReason.PlayerCannotEnterMp, PlayerApplyEnterMpReason.SystemJudge, PlayerApplyEnterMpReason.AllowEnterPlayerFull, PlayerApplyEnterMpReason.WorldLevelLowerThanHost, PlayerApplyEnterMpReason.HostInMatch, PlayerApplyEnterMpReason.PlayerInBlacklist, PlayerApplyEnterMpReason.PsPlayerNotAcceptOthers, PlayerApplyEnterMpReason.HostIsBlocked, PlayerApplyEnterMpReason.OtherDataVersionNotLatest, PlayerApplyEnterMpReason.DataVersionNotLatest, PlayerApplyEnterMpReason.PlayerNotInPlayerWorld, PlayerApplyEnterMpReason.UNRECOGNIZED };
        }
        
        static {
            VALUES = values();
            internalValueMap = new Internal.EnumLiteMap<PlayerApplyEnterMpReason>() {
                @Override
                public PlayerApplyEnterMpReason findValueByNumber(final int number) {
                    return PlayerApplyEnterMpReason.forNumber(number);
                }
            };

        }
    }
}
