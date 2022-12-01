// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SceneGadgetInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneGadgetInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneGadgetInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneGadgetInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneGadgetInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015SceneGadgetInfo.proto\u001a\u0017AbilityGadgetInfo.proto\u001a\u0016BlossomChestInfo.proto\u001a\u0013BossChestInfo.proto\u001a\u0016ClientGadgetInfo.proto\u001a\u001aCustomGadgetTreeInfo.proto\u001a\u001eDeshretObeliskGadgetInfo.proto\u001a\u0013EchoShellInfo.proto\u001a\u0012FishPoolInfo.proto\u001a\u0014FoundationInfo.proto\u001a\u0014GadgetBornType.proto\u001a\u001dGadgetGeneralRewardInfo.proto\u001a\u0014GadgetPlayInfo.proto\u001a\u0016GatherGadgetInfo.proto\u001a\nItem.proto\u001a\u0016MpPlayRewardInfo.proto\u001a\u0019NightCrowGadgetInfo.proto\u001a\u0012OfferingInfo.proto\u001a\u0012PlatformInfo.proto\u001a\u0019RoguelikeGadgetInfo.proto\u001a\u0010ScreenInfo.proto\u001a\u0016StatueGadgetInfo.proto\u001a\u0011VehicleInfo.proto\u001a\u0011WeatherInfo.proto\u001a\u0011WorktopInfo.proto\"\u00fd\n\n\u000fSceneGadgetInfo\u0012\u0011\n\tgadget_id\u0018\u0001 \u0001(\r\u0012\u0010\n\bgroup_id\u0018\u0002 \u0001(\r\u0012\u0011\n\tconfig_id\u0018\u0003 \u0001(\r\u0012\u0017\n\u000fowner_entity_id\u0018\u0004 \u0001(\r\u0012\"\n\tborn_type\u0018\u0005 \u0001(\u000e2\u000f.GadgetBornType\u0012\u0014\n\fgadget_state\u0018\u0006 \u0001(\r\u0012\u0013\n\u000bgadget_type\u0018\u0007 \u0001(\r\u0012\u0018\n\u0010is_show_cutscene\u0018\b \u0001(\b\u0012\u0019\n\u0011authority_peer_id\u0018\t \u0001(\r\u0012\u001a\n\u0012is_enable_interact\u0018\n \u0001(\b\u0012\u0013\n\u000binteract_id\u0018\u000b \u0001(\r\u0012\u0011\n\tmark_flag\u0018\u0015 \u0001(\r\u0012\u001c\n\u0014prop_owner_entity_id\u0018\u0016 \u0001(\r\u0012\u001f\n\bplatform\u0018\u0017 \u0001(\u000b2\r.PlatformInfo\u0012\u0019\n\u0011interact_uid_list\u0018\u0018 \u0003(\r\u0012\u0010\n\bdraft_id\u0018\u0019 \u0001(\r\u0012\u0019\n\u0011gadget_talk_state\u0018\u001a \u0001(\r\u0012\"\n\tplay_info\u0018d \u0001(\u000b2\u000f.GadgetPlayInfo\u0012\u001c\n\u000btrifle_item\u0018\f \u0001(\u000b2\u0005.ItemH\u0000\u0012*\n\rgather_gadget\u0018\r \u0001(\u000b2\u0011.GatherGadgetInfoH\u0000\u0012\u001f\n\u0007worktop\u0018\u000e \u0001(\u000b2\f.WorktopInfoH\u0000\u0012*\n\rclient_gadget\u0018\u000f \u0001(\u000b2\u0011.ClientGadgetInfoH\u0000\u0012\u001f\n\u0007weather\u0018\u0011 \u0001(\u000b2\f.WeatherInfoH\u0000\u0012,\n\u000eability_gadget\u0018\u0012 \u0001(\u000b2\u0012.AbilityGadgetInfoH\u0000\u0012*\n\rstatue_gadget\u0018\u0013 \u0001(\u000b2\u0011.StatueGadgetInfoH\u0000\u0012$\n\nboss_chest\u0018\u0014 \u0001(\u000b2\u000e.BossChestInfoH\u0000\u0012*\n\rblossom_chest\u0018) \u0001(\u000b2\u0011.BlossomChestInfoH\u0000\u0012+\n\u000emp_play_reward\u0018* \u0001(\u000b2\u0011.MpPlayRewardInfoH\u0000\u00122\n\u000egeneral_reward\u0018+ \u0001(\u000b2\u0018.GadgetGeneralRewardInfoH\u0000\u0012&\n\roffering_info\u0018, \u0001(\u000b2\r.OfferingInfoH\u0000\u0012*\n\u000ffoundation_info\u0018- \u0001(\u000b2\u000f.FoundationInfoH\u0000\u0012$\n\fvehicle_info\u0018. \u0001(\u000b2\f.VehicleInfoH\u0000\u0012$\n\nshell_info\u0018/ \u0001(\u000b2\u000e.EchoShellInfoH\u0000\u0012\"\n\u000bscreen_info\u00180 \u0001(\u000b2\u000b.ScreenInfoH\u0000\u0012'\n\u000efish_pool_info\u0018; \u0001(\u000b2\r.FishPoolInfoH\u0000\u00128\n\u0017custom_gadget_tree_info\u0018< \u0001(\u000b2\u0015.CustomGadgetTreeInfoH\u0000\u00125\n\u0015roguelike_gadget_info\u0018= \u0001(\u000b2\u0014.RoguelikeGadgetInfoH\u0000\u00126\n\u0016night_crow_gadget_info\u0018> \u0001(\u000b2\u0014.NightCrowGadgetInfoH\u0000\u0012@\n\u001bdeshret_obelisk_gadget_info\u0018? \u0001(\u000b2\u0019.DeshretObeliskGadgetInfoH\u0000B\t\n\u0007contentB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneGadgetInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityGadgetInfoOuterClass.getDescriptor(), BlossomChestInfoOuterClass.getDescriptor(), BossChestInfoOuterClass.getDescriptor(), ClientGadgetInfoOuterClass.getDescriptor(), CustomGadgetTreeInfoOuterClass.getDescriptor(), DeshretObeliskGadgetInfoOuterClass.getDescriptor(), EchoShellInfoOuterClass.getDescriptor(), FishPoolInfoOuterClass.getDescriptor(), FoundationInfoOuterClass.getDescriptor(), GadgetBornTypeOuterClass.getDescriptor(), GadgetGeneralRewardInfoOuterClass.getDescriptor(), GadgetPlayInfoOuterClass.getDescriptor(), GatherGadgetInfoOuterClass.getDescriptor(), ItemOuterClass.getDescriptor(), MpPlayRewardInfoOuterClass.getDescriptor(), NightCrowGadgetInfoOuterClass.getDescriptor(), OfferingInfoOuterClass.getDescriptor(), PlatformInfoOuterClass.getDescriptor(), RoguelikeGadgetInfoOuterClass.getDescriptor(), ScreenInfoOuterClass.getDescriptor(), StatueGadgetInfoOuterClass.getDescriptor(), VehicleInfoOuterClass.getDescriptor(), WeatherInfoOuterClass.getDescriptor(), WorktopInfoOuterClass.getDescriptor() });
        internal_static_SceneGadgetInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneGadgetInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneGadgetInfoOuterClass.internal_static_SceneGadgetInfo_descriptor, new String[] { "GadgetId", "GroupId", "ConfigId", "OwnerEntityId", "BornType", "GadgetState", "GadgetType", "IsShowCutscene", "AuthorityPeerId", "IsEnableInteract", "InteractId", "MarkFlag", "PropOwnerEntityId", "Platform", "InteractUidList", "DraftId", "GadgetTalkState", "PlayInfo", "TrifleItem", "GatherGadget", "Worktop", "ClientGadget", "Weather", "AbilityGadget", "StatueGadget", "BossChest", "BlossomChest", "MpPlayReward", "GeneralReward", "OfferingInfo", "FoundationInfo", "VehicleInfo", "ShellInfo", "ScreenInfo", "FishPoolInfo", "CustomGadgetTreeInfo", "RoguelikeGadgetInfo", "NightCrowGadgetInfo", "DeshretObeliskGadgetInfo", "Content" });
        AbilityGadgetInfoOuterClass.getDescriptor();
        BlossomChestInfoOuterClass.getDescriptor();
        BossChestInfoOuterClass.getDescriptor();
        ClientGadgetInfoOuterClass.getDescriptor();
        CustomGadgetTreeInfoOuterClass.getDescriptor();
        DeshretObeliskGadgetInfoOuterClass.getDescriptor();
        EchoShellInfoOuterClass.getDescriptor();
        FishPoolInfoOuterClass.getDescriptor();
        FoundationInfoOuterClass.getDescriptor();
        GadgetBornTypeOuterClass.getDescriptor();
        GadgetGeneralRewardInfoOuterClass.getDescriptor();
        GadgetPlayInfoOuterClass.getDescriptor();
        GatherGadgetInfoOuterClass.getDescriptor();
        ItemOuterClass.getDescriptor();
        MpPlayRewardInfoOuterClass.getDescriptor();
        NightCrowGadgetInfoOuterClass.getDescriptor();
        OfferingInfoOuterClass.getDescriptor();
        PlatformInfoOuterClass.getDescriptor();
        RoguelikeGadgetInfoOuterClass.getDescriptor();
        ScreenInfoOuterClass.getDescriptor();
        StatueGadgetInfoOuterClass.getDescriptor();
        VehicleInfoOuterClass.getDescriptor();
        WeatherInfoOuterClass.getDescriptor();
        WorktopInfoOuterClass.getDescriptor();
    }
    
    public static final class SceneGadgetInfo extends GeneratedMessageV3 implements SceneGadgetInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int contentCase_;
        private Object content_;
        public static final int GADGET_ID_FIELD_NUMBER = 1;
        private int gadgetId_;
        public static final int GROUP_ID_FIELD_NUMBER = 2;
        private int groupId_;
        public static final int CONFIG_ID_FIELD_NUMBER = 3;
        private int configId_;
        public static final int OWNER_ENTITY_ID_FIELD_NUMBER = 4;
        private int ownerEntityId_;
        public static final int BORN_TYPE_FIELD_NUMBER = 5;
        private int bornType_;
        public static final int GADGET_STATE_FIELD_NUMBER = 6;
        private int gadgetState_;
        public static final int GADGET_TYPE_FIELD_NUMBER = 7;
        private int gadgetType_;
        public static final int IS_SHOW_CUTSCENE_FIELD_NUMBER = 8;
        private boolean isShowCutscene_;
        public static final int AUTHORITY_PEER_ID_FIELD_NUMBER = 9;
        private int authorityPeerId_;
        public static final int IS_ENABLE_INTERACT_FIELD_NUMBER = 10;
        private boolean isEnableInteract_;
        public static final int INTERACT_ID_FIELD_NUMBER = 11;
        private int interactId_;
        public static final int MARK_FLAG_FIELD_NUMBER = 21;
        private int markFlag_;
        public static final int PROP_OWNER_ENTITY_ID_FIELD_NUMBER = 22;
        private int propOwnerEntityId_;
        public static final int PLATFORM_FIELD_NUMBER = 23;
        private PlatformInfoOuterClass.PlatformInfo platform_;
        public static final int INTERACT_UID_LIST_FIELD_NUMBER = 24;
        private Internal.IntList interactUidList_;
        private int interactUidListMemoizedSerializedSize;
        public static final int DRAFT_ID_FIELD_NUMBER = 25;
        private int draftId_;
        public static final int GADGET_TALK_STATE_FIELD_NUMBER = 26;
        private int gadgetTalkState_;
        public static final int PLAY_INFO_FIELD_NUMBER = 100;
        private GadgetPlayInfoOuterClass.GadgetPlayInfo playInfo_;
        public static final int TRIFLE_ITEM_FIELD_NUMBER = 12;
        public static final int GATHER_GADGET_FIELD_NUMBER = 13;
        public static final int WORKTOP_FIELD_NUMBER = 14;
        public static final int CLIENT_GADGET_FIELD_NUMBER = 15;
        public static final int WEATHER_FIELD_NUMBER = 17;
        public static final int ABILITY_GADGET_FIELD_NUMBER = 18;
        public static final int STATUE_GADGET_FIELD_NUMBER = 19;
        public static final int BOSS_CHEST_FIELD_NUMBER = 20;
        public static final int BLOSSOM_CHEST_FIELD_NUMBER = 41;
        public static final int MP_PLAY_REWARD_FIELD_NUMBER = 42;
        public static final int GENERAL_REWARD_FIELD_NUMBER = 43;
        public static final int OFFERING_INFO_FIELD_NUMBER = 44;
        public static final int FOUNDATION_INFO_FIELD_NUMBER = 45;
        public static final int VEHICLE_INFO_FIELD_NUMBER = 46;
        public static final int SHELL_INFO_FIELD_NUMBER = 47;
        public static final int SCREEN_INFO_FIELD_NUMBER = 48;
        public static final int FISH_POOL_INFO_FIELD_NUMBER = 59;
        public static final int CUSTOM_GADGET_TREE_INFO_FIELD_NUMBER = 60;
        public static final int ROGUELIKE_GADGET_INFO_FIELD_NUMBER = 61;
        public static final int NIGHT_CROW_GADGET_INFO_FIELD_NUMBER = 62;
        public static final int DESHRET_OBELISK_GADGET_INFO_FIELD_NUMBER = 63;
        private byte memoizedIsInitialized;
        private static final SceneGadgetInfo DEFAULT_INSTANCE;
        private static final Parser<SceneGadgetInfo> PARSER;
        
        private SceneGadgetInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.contentCase_ = 0;
            this.interactUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private SceneGadgetInfo() {
            this.contentCase_ = 0;
            this.interactUidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.bornType_ = 0;
            this.interactUidList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneGadgetInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneGadgetInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.gadgetId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.groupId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.configId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.ownerEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            final int rawValue = input.readEnum();
                            this.bornType_ = rawValue;
                            continue;
                        }
                        case 48: {
                            this.gadgetState_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.gadgetType_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.isShowCutscene_ = input.readBool();
                            continue;
                        }
                        case 72: {
                            this.authorityPeerId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.isEnableInteract_ = input.readBool();
                            continue;
                        }
                        case 88: {
                            this.interactId_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            ItemOuterClass.Item.Builder subBuilder = null;
                            if (this.contentCase_ == 12) {
                                subBuilder = ((ItemOuterClass.Item)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(ItemOuterClass.Item.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((ItemOuterClass.Item)this.content_);
                                this.content_ = subBuilder.buildPartial();
                            }
                            this.contentCase_ = 12;
                            continue;
                        }
                        case 106: {
                            GatherGadgetInfoOuterClass.GatherGadgetInfo.Builder subBuilder2 = null;
                            if (this.contentCase_ == 13) {
                                subBuilder2 = ((GatherGadgetInfoOuterClass.GatherGadgetInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(GatherGadgetInfoOuterClass.GatherGadgetInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((GatherGadgetInfoOuterClass.GatherGadgetInfo)this.content_);
                                this.content_ = subBuilder2.buildPartial();
                            }
                            this.contentCase_ = 13;
                            continue;
                        }
                        case 114: {
                            WorktopInfoOuterClass.WorktopInfo.Builder subBuilder3 = null;
                            if (this.contentCase_ == 14) {
                                subBuilder3 = ((WorktopInfoOuterClass.WorktopInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(WorktopInfoOuterClass.WorktopInfo.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom((WorktopInfoOuterClass.WorktopInfo)this.content_);
                                this.content_ = subBuilder3.buildPartial();
                            }
                            this.contentCase_ = 14;
                            continue;
                        }
                        case 122: {
                            ClientGadgetInfoOuterClass.ClientGadgetInfo.Builder subBuilder4 = null;
                            if (this.contentCase_ == 15) {
                                subBuilder4 = ((ClientGadgetInfoOuterClass.ClientGadgetInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(ClientGadgetInfoOuterClass.ClientGadgetInfo.parser(), extensionRegistry);
                            if (subBuilder4 != null) {
                                subBuilder4.mergeFrom((ClientGadgetInfoOuterClass.ClientGadgetInfo)this.content_);
                                this.content_ = subBuilder4.buildPartial();
                            }
                            this.contentCase_ = 15;
                            continue;
                        }
                        case 138: {
                            WeatherInfoOuterClass.WeatherInfo.Builder subBuilder5 = null;
                            if (this.contentCase_ == 17) {
                                subBuilder5 = ((WeatherInfoOuterClass.WeatherInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(WeatherInfoOuterClass.WeatherInfo.parser(), extensionRegistry);
                            if (subBuilder5 != null) {
                                subBuilder5.mergeFrom((WeatherInfoOuterClass.WeatherInfo)this.content_);
                                this.content_ = subBuilder5.buildPartial();
                            }
                            this.contentCase_ = 17;
                            continue;
                        }
                        case 146: {
                            AbilityGadgetInfoOuterClass.AbilityGadgetInfo.Builder subBuilder6 = null;
                            if (this.contentCase_ == 18) {
                                subBuilder6 = ((AbilityGadgetInfoOuterClass.AbilityGadgetInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(AbilityGadgetInfoOuterClass.AbilityGadgetInfo.parser(), extensionRegistry);
                            if (subBuilder6 != null) {
                                subBuilder6.mergeFrom((AbilityGadgetInfoOuterClass.AbilityGadgetInfo)this.content_);
                                this.content_ = subBuilder6.buildPartial();
                            }
                            this.contentCase_ = 18;
                            continue;
                        }
                        case 154: {
                            StatueGadgetInfoOuterClass.StatueGadgetInfo.Builder subBuilder7 = null;
                            if (this.contentCase_ == 19) {
                                subBuilder7 = ((StatueGadgetInfoOuterClass.StatueGadgetInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(StatueGadgetInfoOuterClass.StatueGadgetInfo.parser(), extensionRegistry);
                            if (subBuilder7 != null) {
                                subBuilder7.mergeFrom((StatueGadgetInfoOuterClass.StatueGadgetInfo)this.content_);
                                this.content_ = subBuilder7.buildPartial();
                            }
                            this.contentCase_ = 19;
                            continue;
                        }
                        case 162: {
                            BossChestInfoOuterClass.BossChestInfo.Builder subBuilder8 = null;
                            if (this.contentCase_ == 20) {
                                subBuilder8 = ((BossChestInfoOuterClass.BossChestInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(BossChestInfoOuterClass.BossChestInfo.parser(), extensionRegistry);
                            if (subBuilder8 != null) {
                                subBuilder8.mergeFrom((BossChestInfoOuterClass.BossChestInfo)this.content_);
                                this.content_ = subBuilder8.buildPartial();
                            }
                            this.contentCase_ = 20;
                            continue;
                        }
                        case 168: {
                            this.markFlag_ = input.readUInt32();
                            continue;
                        }
                        case 176: {
                            this.propOwnerEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 186: {
                            PlatformInfoOuterClass.PlatformInfo.Builder subBuilder9 = null;
                            if (this.platform_ != null) {
                                subBuilder9 = this.platform_.toBuilder();
                            }
                            this.platform_ = input.readMessage(PlatformInfoOuterClass.PlatformInfo.parser(), extensionRegistry);
                            if (subBuilder9 != null) {
                                subBuilder9.mergeFrom(this.platform_);
                                this.platform_ = subBuilder9.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 192: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.interactUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.interactUidList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 194: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.interactUidList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.interactUidList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 200: {
                            this.draftId_ = input.readUInt32();
                            continue;
                        }
                        case 208: {
                            this.gadgetTalkState_ = input.readUInt32();
                            continue;
                        }
                        case 330: {
                            BlossomChestInfoOuterClass.BlossomChestInfo.Builder subBuilder10 = null;
                            if (this.contentCase_ == 41) {
                                subBuilder10 = ((BlossomChestInfoOuterClass.BlossomChestInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(BlossomChestInfoOuterClass.BlossomChestInfo.parser(), extensionRegistry);
                            if (subBuilder10 != null) {
                                subBuilder10.mergeFrom((BlossomChestInfoOuterClass.BlossomChestInfo)this.content_);
                                this.content_ = subBuilder10.buildPartial();
                            }
                            this.contentCase_ = 41;
                            continue;
                        }
                        case 338: {
                            MpPlayRewardInfoOuterClass.MpPlayRewardInfo.Builder subBuilder11 = null;
                            if (this.contentCase_ == 42) {
                                subBuilder11 = ((MpPlayRewardInfoOuterClass.MpPlayRewardInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(MpPlayRewardInfoOuterClass.MpPlayRewardInfo.parser(), extensionRegistry);
                            if (subBuilder11 != null) {
                                subBuilder11.mergeFrom((MpPlayRewardInfoOuterClass.MpPlayRewardInfo)this.content_);
                                this.content_ = subBuilder11.buildPartial();
                            }
                            this.contentCase_ = 42;
                            continue;
                        }
                        case 346: {
                            GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder subBuilder12 = null;
                            if (this.contentCase_ == 43) {
                                subBuilder12 = ((GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.parser(), extensionRegistry);
                            if (subBuilder12 != null) {
                                subBuilder12.mergeFrom((GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo)this.content_);
                                this.content_ = subBuilder12.buildPartial();
                            }
                            this.contentCase_ = 43;
                            continue;
                        }
                        case 354: {
                            OfferingInfoOuterClass.OfferingInfo.Builder subBuilder13 = null;
                            if (this.contentCase_ == 44) {
                                subBuilder13 = ((OfferingInfoOuterClass.OfferingInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(OfferingInfoOuterClass.OfferingInfo.parser(), extensionRegistry);
                            if (subBuilder13 != null) {
                                subBuilder13.mergeFrom((OfferingInfoOuterClass.OfferingInfo)this.content_);
                                this.content_ = subBuilder13.buildPartial();
                            }
                            this.contentCase_ = 44;
                            continue;
                        }
                        case 362: {
                            FoundationInfoOuterClass.FoundationInfo.Builder subBuilder14 = null;
                            if (this.contentCase_ == 45) {
                                subBuilder14 = ((FoundationInfoOuterClass.FoundationInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(FoundationInfoOuterClass.FoundationInfo.parser(), extensionRegistry);
                            if (subBuilder14 != null) {
                                subBuilder14.mergeFrom((FoundationInfoOuterClass.FoundationInfo)this.content_);
                                this.content_ = subBuilder14.buildPartial();
                            }
                            this.contentCase_ = 45;
                            continue;
                        }
                        case 370: {
                            VehicleInfoOuterClass.VehicleInfo.Builder subBuilder15 = null;
                            if (this.contentCase_ == 46) {
                                subBuilder15 = ((VehicleInfoOuterClass.VehicleInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(VehicleInfoOuterClass.VehicleInfo.parser(), extensionRegistry);
                            if (subBuilder15 != null) {
                                subBuilder15.mergeFrom((VehicleInfoOuterClass.VehicleInfo)this.content_);
                                this.content_ = subBuilder15.buildPartial();
                            }
                            this.contentCase_ = 46;
                            continue;
                        }
                        case 378: {
                            EchoShellInfoOuterClass.EchoShellInfo.Builder subBuilder16 = null;
                            if (this.contentCase_ == 47) {
                                subBuilder16 = ((EchoShellInfoOuterClass.EchoShellInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(EchoShellInfoOuterClass.EchoShellInfo.parser(), extensionRegistry);
                            if (subBuilder16 != null) {
                                subBuilder16.mergeFrom((EchoShellInfoOuterClass.EchoShellInfo)this.content_);
                                this.content_ = subBuilder16.buildPartial();
                            }
                            this.contentCase_ = 47;
                            continue;
                        }
                        case 386: {
                            ScreenInfoOuterClass.ScreenInfo.Builder subBuilder17 = null;
                            if (this.contentCase_ == 48) {
                                subBuilder17 = ((ScreenInfoOuterClass.ScreenInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(ScreenInfoOuterClass.ScreenInfo.parser(), extensionRegistry);
                            if (subBuilder17 != null) {
                                subBuilder17.mergeFrom((ScreenInfoOuterClass.ScreenInfo)this.content_);
                                this.content_ = subBuilder17.buildPartial();
                            }
                            this.contentCase_ = 48;
                            continue;
                        }
                        case 474: {
                            FishPoolInfoOuterClass.FishPoolInfo.Builder subBuilder18 = null;
                            if (this.contentCase_ == 59) {
                                subBuilder18 = ((FishPoolInfoOuterClass.FishPoolInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(FishPoolInfoOuterClass.FishPoolInfo.parser(), extensionRegistry);
                            if (subBuilder18 != null) {
                                subBuilder18.mergeFrom((FishPoolInfoOuterClass.FishPoolInfo)this.content_);
                                this.content_ = subBuilder18.buildPartial();
                            }
                            this.contentCase_ = 59;
                            continue;
                        }
                        case 482: {
                            CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder subBuilder19 = null;
                            if (this.contentCase_ == 60) {
                                subBuilder19 = ((CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.parser(), extensionRegistry);
                            if (subBuilder19 != null) {
                                subBuilder19.mergeFrom((CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo)this.content_);
                                this.content_ = subBuilder19.buildPartial();
                            }
                            this.contentCase_ = 60;
                            continue;
                        }
                        case 490: {
                            RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.Builder subBuilder20 = null;
                            if (this.contentCase_ == 61) {
                                subBuilder20 = ((RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.parser(), extensionRegistry);
                            if (subBuilder20 != null) {
                                subBuilder20.mergeFrom((RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo)this.content_);
                                this.content_ = subBuilder20.buildPartial();
                            }
                            this.contentCase_ = 61;
                            continue;
                        }
                        case 498: {
                            NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.Builder subBuilder21 = null;
                            if (this.contentCase_ == 62) {
                                subBuilder21 = ((NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.parser(), extensionRegistry);
                            if (subBuilder21 != null) {
                                subBuilder21.mergeFrom((NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo)this.content_);
                                this.content_ = subBuilder21.buildPartial();
                            }
                            this.contentCase_ = 62;
                            continue;
                        }
                        case 506: {
                            DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.Builder subBuilder22 = null;
                            if (this.contentCase_ == 63) {
                                subBuilder22 = ((DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo)this.content_).toBuilder();
                            }
                            this.content_ = input.readMessage(DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.parser(), extensionRegistry);
                            if (subBuilder22 != null) {
                                subBuilder22.mergeFrom((DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo)this.content_);
                                this.content_ = subBuilder22.buildPartial();
                            }
                            this.contentCase_ = 63;
                            continue;
                        }
                        case 802: {
                            GadgetPlayInfoOuterClass.GadgetPlayInfo.Builder subBuilder23 = null;
                            if (this.playInfo_ != null) {
                                subBuilder23 = this.playInfo_.toBuilder();
                            }
                            this.playInfo_ = input.readMessage(GadgetPlayInfoOuterClass.GadgetPlayInfo.parser(), extensionRegistry);
                            if (subBuilder23 != null) {
                                subBuilder23.mergeFrom(this.playInfo_);
                                this.playInfo_ = subBuilder23.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.interactUidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneGadgetInfoOuterClass.internal_static_SceneGadgetInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneGadgetInfoOuterClass.internal_static_SceneGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneGadgetInfo.class, Builder.class);
        }
        
        @Override
        public ContentCase getContentCase() {
            return ContentCase.forNumber(this.contentCase_);
        }
        
        @Override
        public int getGadgetId() {
            return this.gadgetId_;
        }
        
        @Override
        public int getGroupId() {
            return this.groupId_;
        }
        
        @Override
        public int getConfigId() {
            return this.configId_;
        }
        
        @Override
        public int getOwnerEntityId() {
            return this.ownerEntityId_;
        }
        
        @Override
        public int getBornTypeValue() {
            return this.bornType_;
        }
        
        @Override
        public GadgetBornTypeOuterClass.GadgetBornType getBornType() {
            final GadgetBornTypeOuterClass.GadgetBornType result = GadgetBornTypeOuterClass.GadgetBornType.valueOf(this.bornType_);
            return (result == null) ? GadgetBornTypeOuterClass.GadgetBornType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getGadgetState() {
            return this.gadgetState_;
        }
        
        @Override
        public int getGadgetType() {
            return this.gadgetType_;
        }
        
        @Override
        public boolean getIsShowCutscene() {
            return this.isShowCutscene_;
        }
        
        @Override
        public int getAuthorityPeerId() {
            return this.authorityPeerId_;
        }
        
        @Override
        public boolean getIsEnableInteract() {
            return this.isEnableInteract_;
        }
        
        @Override
        public int getInteractId() {
            return this.interactId_;
        }
        
        @Override
        public int getMarkFlag() {
            return this.markFlag_;
        }
        
        @Override
        public int getPropOwnerEntityId() {
            return this.propOwnerEntityId_;
        }
        
        @Override
        public boolean hasPlatform() {
            return this.platform_ != null;
        }
        
        @Override
        public PlatformInfoOuterClass.PlatformInfo getPlatform() {
            return (this.platform_ == null) ? PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : this.platform_;
        }
        
        @Override
        public PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder() {
            return this.getPlatform();
        }
        
        @Override
        public List<Integer> getInteractUidListList() {
            return this.interactUidList_;
        }
        
        @Override
        public int getInteractUidListCount() {
            return this.interactUidList_.size();
        }
        
        @Override
        public int getInteractUidList(final int index) {
            return this.interactUidList_.getInt(index);
        }
        
        @Override
        public int getDraftId() {
            return this.draftId_;
        }
        
        @Override
        public int getGadgetTalkState() {
            return this.gadgetTalkState_;
        }
        
        @Override
        public boolean hasPlayInfo() {
            return this.playInfo_ != null;
        }
        
        @Override
        public GadgetPlayInfoOuterClass.GadgetPlayInfo getPlayInfo() {
            return (this.playInfo_ == null) ? GadgetPlayInfoOuterClass.GadgetPlayInfo.getDefaultInstance() : this.playInfo_;
        }
        
        @Override
        public GadgetPlayInfoOuterClass.GadgetPlayInfoOrBuilder getPlayInfoOrBuilder() {
            return this.getPlayInfo();
        }
        
        @Override
        public boolean hasTrifleItem() {
            return this.contentCase_ == 12;
        }
        
        @Override
        public ItemOuterClass.Item getTrifleItem() {
            if (this.contentCase_ == 12) {
                return (ItemOuterClass.Item)this.content_;
            }
            return ItemOuterClass.Item.getDefaultInstance();
        }
        
        @Override
        public ItemOuterClass.ItemOrBuilder getTrifleItemOrBuilder() {
            if (this.contentCase_ == 12) {
                return (ItemOuterClass.Item)this.content_;
            }
            return ItemOuterClass.Item.getDefaultInstance();
        }
        
        @Override
        public boolean hasGatherGadget() {
            return this.contentCase_ == 13;
        }
        
        @Override
        public GatherGadgetInfoOuterClass.GatherGadgetInfo getGatherGadget() {
            if (this.contentCase_ == 13) {
                return (GatherGadgetInfoOuterClass.GatherGadgetInfo)this.content_;
            }
            return GatherGadgetInfoOuterClass.GatherGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public GatherGadgetInfoOuterClass.GatherGadgetInfoOrBuilder getGatherGadgetOrBuilder() {
            if (this.contentCase_ == 13) {
                return (GatherGadgetInfoOuterClass.GatherGadgetInfo)this.content_;
            }
            return GatherGadgetInfoOuterClass.GatherGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasWorktop() {
            return this.contentCase_ == 14;
        }
        
        @Override
        public WorktopInfoOuterClass.WorktopInfo getWorktop() {
            if (this.contentCase_ == 14) {
                return (WorktopInfoOuterClass.WorktopInfo)this.content_;
            }
            return WorktopInfoOuterClass.WorktopInfo.getDefaultInstance();
        }
        
        @Override
        public WorktopInfoOuterClass.WorktopInfoOrBuilder getWorktopOrBuilder() {
            if (this.contentCase_ == 14) {
                return (WorktopInfoOuterClass.WorktopInfo)this.content_;
            }
            return WorktopInfoOuterClass.WorktopInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasClientGadget() {
            return this.contentCase_ == 15;
        }
        
        @Override
        public ClientGadgetInfoOuterClass.ClientGadgetInfo getClientGadget() {
            if (this.contentCase_ == 15) {
                return (ClientGadgetInfoOuterClass.ClientGadgetInfo)this.content_;
            }
            return ClientGadgetInfoOuterClass.ClientGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public ClientGadgetInfoOuterClass.ClientGadgetInfoOrBuilder getClientGadgetOrBuilder() {
            if (this.contentCase_ == 15) {
                return (ClientGadgetInfoOuterClass.ClientGadgetInfo)this.content_;
            }
            return ClientGadgetInfoOuterClass.ClientGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasWeather() {
            return this.contentCase_ == 17;
        }
        
        @Override
        public WeatherInfoOuterClass.WeatherInfo getWeather() {
            if (this.contentCase_ == 17) {
                return (WeatherInfoOuterClass.WeatherInfo)this.content_;
            }
            return WeatherInfoOuterClass.WeatherInfo.getDefaultInstance();
        }
        
        @Override
        public WeatherInfoOuterClass.WeatherInfoOrBuilder getWeatherOrBuilder() {
            if (this.contentCase_ == 17) {
                return (WeatherInfoOuterClass.WeatherInfo)this.content_;
            }
            return WeatherInfoOuterClass.WeatherInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasAbilityGadget() {
            return this.contentCase_ == 18;
        }
        
        @Override
        public AbilityGadgetInfoOuterClass.AbilityGadgetInfo getAbilityGadget() {
            if (this.contentCase_ == 18) {
                return (AbilityGadgetInfoOuterClass.AbilityGadgetInfo)this.content_;
            }
            return AbilityGadgetInfoOuterClass.AbilityGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public AbilityGadgetInfoOuterClass.AbilityGadgetInfoOrBuilder getAbilityGadgetOrBuilder() {
            if (this.contentCase_ == 18) {
                return (AbilityGadgetInfoOuterClass.AbilityGadgetInfo)this.content_;
            }
            return AbilityGadgetInfoOuterClass.AbilityGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasStatueGadget() {
            return this.contentCase_ == 19;
        }
        
        @Override
        public StatueGadgetInfoOuterClass.StatueGadgetInfo getStatueGadget() {
            if (this.contentCase_ == 19) {
                return (StatueGadgetInfoOuterClass.StatueGadgetInfo)this.content_;
            }
            return StatueGadgetInfoOuterClass.StatueGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public StatueGadgetInfoOuterClass.StatueGadgetInfoOrBuilder getStatueGadgetOrBuilder() {
            if (this.contentCase_ == 19) {
                return (StatueGadgetInfoOuterClass.StatueGadgetInfo)this.content_;
            }
            return StatueGadgetInfoOuterClass.StatueGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasBossChest() {
            return this.contentCase_ == 20;
        }
        
        @Override
        public BossChestInfoOuterClass.BossChestInfo getBossChest() {
            if (this.contentCase_ == 20) {
                return (BossChestInfoOuterClass.BossChestInfo)this.content_;
            }
            return BossChestInfoOuterClass.BossChestInfo.getDefaultInstance();
        }
        
        @Override
        public BossChestInfoOuterClass.BossChestInfoOrBuilder getBossChestOrBuilder() {
            if (this.contentCase_ == 20) {
                return (BossChestInfoOuterClass.BossChestInfo)this.content_;
            }
            return BossChestInfoOuterClass.BossChestInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasBlossomChest() {
            return this.contentCase_ == 41;
        }
        
        @Override
        public BlossomChestInfoOuterClass.BlossomChestInfo getBlossomChest() {
            if (this.contentCase_ == 41) {
                return (BlossomChestInfoOuterClass.BlossomChestInfo)this.content_;
            }
            return BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance();
        }
        
        @Override
        public BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder getBlossomChestOrBuilder() {
            if (this.contentCase_ == 41) {
                return (BlossomChestInfoOuterClass.BlossomChestInfo)this.content_;
            }
            return BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasMpPlayReward() {
            return this.contentCase_ == 42;
        }
        
        @Override
        public MpPlayRewardInfoOuterClass.MpPlayRewardInfo getMpPlayReward() {
            if (this.contentCase_ == 42) {
                return (MpPlayRewardInfoOuterClass.MpPlayRewardInfo)this.content_;
            }
            return MpPlayRewardInfoOuterClass.MpPlayRewardInfo.getDefaultInstance();
        }
        
        @Override
        public MpPlayRewardInfoOuterClass.MpPlayRewardInfoOrBuilder getMpPlayRewardOrBuilder() {
            if (this.contentCase_ == 42) {
                return (MpPlayRewardInfoOuterClass.MpPlayRewardInfo)this.content_;
            }
            return MpPlayRewardInfoOuterClass.MpPlayRewardInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasGeneralReward() {
            return this.contentCase_ == 43;
        }
        
        @Override
        public GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo getGeneralReward() {
            if (this.contentCase_ == 43) {
                return (GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo)this.content_;
            }
            return GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.getDefaultInstance();
        }
        
        @Override
        public GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder getGeneralRewardOrBuilder() {
            if (this.contentCase_ == 43) {
                return (GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo)this.content_;
            }
            return GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasOfferingInfo() {
            return this.contentCase_ == 44;
        }
        
        @Override
        public OfferingInfoOuterClass.OfferingInfo getOfferingInfo() {
            if (this.contentCase_ == 44) {
                return (OfferingInfoOuterClass.OfferingInfo)this.content_;
            }
            return OfferingInfoOuterClass.OfferingInfo.getDefaultInstance();
        }
        
        @Override
        public OfferingInfoOuterClass.OfferingInfoOrBuilder getOfferingInfoOrBuilder() {
            if (this.contentCase_ == 44) {
                return (OfferingInfoOuterClass.OfferingInfo)this.content_;
            }
            return OfferingInfoOuterClass.OfferingInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasFoundationInfo() {
            return this.contentCase_ == 45;
        }
        
        @Override
        public FoundationInfoOuterClass.FoundationInfo getFoundationInfo() {
            if (this.contentCase_ == 45) {
                return (FoundationInfoOuterClass.FoundationInfo)this.content_;
            }
            return FoundationInfoOuterClass.FoundationInfo.getDefaultInstance();
        }
        
        @Override
        public FoundationInfoOuterClass.FoundationInfoOrBuilder getFoundationInfoOrBuilder() {
            if (this.contentCase_ == 45) {
                return (FoundationInfoOuterClass.FoundationInfo)this.content_;
            }
            return FoundationInfoOuterClass.FoundationInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasVehicleInfo() {
            return this.contentCase_ == 46;
        }
        
        @Override
        public VehicleInfoOuterClass.VehicleInfo getVehicleInfo() {
            if (this.contentCase_ == 46) {
                return (VehicleInfoOuterClass.VehicleInfo)this.content_;
            }
            return VehicleInfoOuterClass.VehicleInfo.getDefaultInstance();
        }
        
        @Override
        public VehicleInfoOuterClass.VehicleInfoOrBuilder getVehicleInfoOrBuilder() {
            if (this.contentCase_ == 46) {
                return (VehicleInfoOuterClass.VehicleInfo)this.content_;
            }
            return VehicleInfoOuterClass.VehicleInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasShellInfo() {
            return this.contentCase_ == 47;
        }
        
        @Override
        public EchoShellInfoOuterClass.EchoShellInfo getShellInfo() {
            if (this.contentCase_ == 47) {
                return (EchoShellInfoOuterClass.EchoShellInfo)this.content_;
            }
            return EchoShellInfoOuterClass.EchoShellInfo.getDefaultInstance();
        }
        
        @Override
        public EchoShellInfoOuterClass.EchoShellInfoOrBuilder getShellInfoOrBuilder() {
            if (this.contentCase_ == 47) {
                return (EchoShellInfoOuterClass.EchoShellInfo)this.content_;
            }
            return EchoShellInfoOuterClass.EchoShellInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasScreenInfo() {
            return this.contentCase_ == 48;
        }
        
        @Override
        public ScreenInfoOuterClass.ScreenInfo getScreenInfo() {
            if (this.contentCase_ == 48) {
                return (ScreenInfoOuterClass.ScreenInfo)this.content_;
            }
            return ScreenInfoOuterClass.ScreenInfo.getDefaultInstance();
        }
        
        @Override
        public ScreenInfoOuterClass.ScreenInfoOrBuilder getScreenInfoOrBuilder() {
            if (this.contentCase_ == 48) {
                return (ScreenInfoOuterClass.ScreenInfo)this.content_;
            }
            return ScreenInfoOuterClass.ScreenInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasFishPoolInfo() {
            return this.contentCase_ == 59;
        }
        
        @Override
        public FishPoolInfoOuterClass.FishPoolInfo getFishPoolInfo() {
            if (this.contentCase_ == 59) {
                return (FishPoolInfoOuterClass.FishPoolInfo)this.content_;
            }
            return FishPoolInfoOuterClass.FishPoolInfo.getDefaultInstance();
        }
        
        @Override
        public FishPoolInfoOuterClass.FishPoolInfoOrBuilder getFishPoolInfoOrBuilder() {
            if (this.contentCase_ == 59) {
                return (FishPoolInfoOuterClass.FishPoolInfo)this.content_;
            }
            return FishPoolInfoOuterClass.FishPoolInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasCustomGadgetTreeInfo() {
            return this.contentCase_ == 60;
        }
        
        @Override
        public CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCustomGadgetTreeInfo() {
            if (this.contentCase_ == 60) {
                return (CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo)this.content_;
            }
            return CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance();
        }
        
        @Override
        public CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCustomGadgetTreeInfoOrBuilder() {
            if (this.contentCase_ == 60) {
                return (CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo)this.content_;
            }
            return CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasRoguelikeGadgetInfo() {
            return this.contentCase_ == 61;
        }
        
        @Override
        public RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo getRoguelikeGadgetInfo() {
            if (this.contentCase_ == 61) {
                return (RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo)this.content_;
            }
            return RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfoOrBuilder getRoguelikeGadgetInfoOrBuilder() {
            if (this.contentCase_ == 61) {
                return (RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo)this.content_;
            }
            return RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasNightCrowGadgetInfo() {
            return this.contentCase_ == 62;
        }
        
        @Override
        public NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo getNightCrowGadgetInfo() {
            if (this.contentCase_ == 62) {
                return (NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo)this.content_;
            }
            return NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public NightCrowGadgetInfoOuterClass.NightCrowGadgetInfoOrBuilder getNightCrowGadgetInfoOrBuilder() {
            if (this.contentCase_ == 62) {
                return (NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo)this.content_;
            }
            return NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasDeshretObeliskGadgetInfo() {
            return this.contentCase_ == 63;
        }
        
        @Override
        public DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo getDeshretObeliskGadgetInfo() {
            if (this.contentCase_ == 63) {
                return (DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo)this.content_;
            }
            return DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfoOrBuilder getDeshretObeliskGadgetInfoOrBuilder() {
            if (this.contentCase_ == 63) {
                return (DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo)this.content_;
            }
            return DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            this.getSerializedSize();
            if (this.gadgetId_ != 0) {
                output.writeUInt32(1, this.gadgetId_);
            }
            if (this.groupId_ != 0) {
                output.writeUInt32(2, this.groupId_);
            }
            if (this.configId_ != 0) {
                output.writeUInt32(3, this.configId_);
            }
            if (this.ownerEntityId_ != 0) {
                output.writeUInt32(4, this.ownerEntityId_);
            }
            if (this.bornType_ != GadgetBornTypeOuterClass.GadgetBornType.GADGET_BORN_TYPE_NONE.getNumber()) {
                output.writeEnum(5, this.bornType_);
            }
            if (this.gadgetState_ != 0) {
                output.writeUInt32(6, this.gadgetState_);
            }
            if (this.gadgetType_ != 0) {
                output.writeUInt32(7, this.gadgetType_);
            }
            if (this.isShowCutscene_) {
                output.writeBool(8, this.isShowCutscene_);
            }
            if (this.authorityPeerId_ != 0) {
                output.writeUInt32(9, this.authorityPeerId_);
            }
            if (this.isEnableInteract_) {
                output.writeBool(10, this.isEnableInteract_);
            }
            if (this.interactId_ != 0) {
                output.writeUInt32(11, this.interactId_);
            }
            if (this.contentCase_ == 12) {
                output.writeMessage(12, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 13) {
                output.writeMessage(13, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 14) {
                output.writeMessage(14, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 15) {
                output.writeMessage(15, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 17) {
                output.writeMessage(17, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 18) {
                output.writeMessage(18, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 19) {
                output.writeMessage(19, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 20) {
                output.writeMessage(20, (MessageLite)this.content_);
            }
            if (this.markFlag_ != 0) {
                output.writeUInt32(21, this.markFlag_);
            }
            if (this.propOwnerEntityId_ != 0) {
                output.writeUInt32(22, this.propOwnerEntityId_);
            }
            if (this.platform_ != null) {
                output.writeMessage(23, this.getPlatform());
            }
            if (this.getInteractUidListList().size() > 0) {
                output.writeUInt32NoTag(194);
                output.writeUInt32NoTag(this.interactUidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.interactUidList_.size(); ++i) {
                output.writeUInt32NoTag(this.interactUidList_.getInt(i));
            }
            if (this.draftId_ != 0) {
                output.writeUInt32(25, this.draftId_);
            }
            if (this.gadgetTalkState_ != 0) {
                output.writeUInt32(26, this.gadgetTalkState_);
            }
            if (this.contentCase_ == 41) {
                output.writeMessage(41, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 42) {
                output.writeMessage(42, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 43) {
                output.writeMessage(43, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 44) {
                output.writeMessage(44, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 45) {
                output.writeMessage(45, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 46) {
                output.writeMessage(46, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 47) {
                output.writeMessage(47, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 48) {
                output.writeMessage(48, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 59) {
                output.writeMessage(59, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 60) {
                output.writeMessage(60, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 61) {
                output.writeMessage(61, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 62) {
                output.writeMessage(62, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 63) {
                output.writeMessage(63, (MessageLite)this.content_);
            }
            if (this.playInfo_ != null) {
                output.writeMessage(100, this.getPlayInfo());
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.gadgetId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.gadgetId_);
            }
            if (this.groupId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.groupId_);
            }
            if (this.configId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.configId_);
            }
            if (this.ownerEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.ownerEntityId_);
            }
            if (this.bornType_ != GadgetBornTypeOuterClass.GadgetBornType.GADGET_BORN_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(5, this.bornType_);
            }
            if (this.gadgetState_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.gadgetState_);
            }
            if (this.gadgetType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.gadgetType_);
            }
            if (this.isShowCutscene_) {
                size += CodedOutputStream.computeBoolSize(8, this.isShowCutscene_);
            }
            if (this.authorityPeerId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.authorityPeerId_);
            }
            if (this.isEnableInteract_) {
                size += CodedOutputStream.computeBoolSize(10, this.isEnableInteract_);
            }
            if (this.interactId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.interactId_);
            }
            if (this.contentCase_ == 12) {
                size += CodedOutputStream.computeMessageSize(12, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 13) {
                size += CodedOutputStream.computeMessageSize(13, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 14) {
                size += CodedOutputStream.computeMessageSize(14, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 15) {
                size += CodedOutputStream.computeMessageSize(15, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 17) {
                size += CodedOutputStream.computeMessageSize(17, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 18) {
                size += CodedOutputStream.computeMessageSize(18, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 19) {
                size += CodedOutputStream.computeMessageSize(19, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 20) {
                size += CodedOutputStream.computeMessageSize(20, (MessageLite)this.content_);
            }
            if (this.markFlag_ != 0) {
                size += CodedOutputStream.computeUInt32Size(21, this.markFlag_);
            }
            if (this.propOwnerEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(22, this.propOwnerEntityId_);
            }
            if (this.platform_ != null) {
                size += CodedOutputStream.computeMessageSize(23, this.getPlatform());
            }
            int dataSize = 0;
            for (int i = 0; i < this.interactUidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.interactUidList_.getInt(i));
            }
            size += dataSize;
            if (!this.getInteractUidListList().isEmpty()) {
                size += 2;
                size += CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.interactUidListMemoizedSerializedSize = dataSize;
            if (this.draftId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(25, this.draftId_);
            }
            if (this.gadgetTalkState_ != 0) {
                size += CodedOutputStream.computeUInt32Size(26, this.gadgetTalkState_);
            }
            if (this.contentCase_ == 41) {
                size += CodedOutputStream.computeMessageSize(41, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 42) {
                size += CodedOutputStream.computeMessageSize(42, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 43) {
                size += CodedOutputStream.computeMessageSize(43, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 44) {
                size += CodedOutputStream.computeMessageSize(44, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 45) {
                size += CodedOutputStream.computeMessageSize(45, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 46) {
                size += CodedOutputStream.computeMessageSize(46, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 47) {
                size += CodedOutputStream.computeMessageSize(47, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 48) {
                size += CodedOutputStream.computeMessageSize(48, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 59) {
                size += CodedOutputStream.computeMessageSize(59, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 60) {
                size += CodedOutputStream.computeMessageSize(60, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 61) {
                size += CodedOutputStream.computeMessageSize(61, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 62) {
                size += CodedOutputStream.computeMessageSize(62, (MessageLite)this.content_);
            }
            if (this.contentCase_ == 63) {
                size += CodedOutputStream.computeMessageSize(63, (MessageLite)this.content_);
            }
            if (this.playInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(100, this.getPlayInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneGadgetInfo)) {
                return super.equals(obj);
            }
            final SceneGadgetInfo other = (SceneGadgetInfo)obj;
            if (this.getGadgetId() != other.getGadgetId()) {
                return false;
            }
            if (this.getGroupId() != other.getGroupId()) {
                return false;
            }
            if (this.getConfigId() != other.getConfigId()) {
                return false;
            }
            if (this.getOwnerEntityId() != other.getOwnerEntityId()) {
                return false;
            }
            if (this.bornType_ != other.bornType_) {
                return false;
            }
            if (this.getGadgetState() != other.getGadgetState()) {
                return false;
            }
            if (this.getGadgetType() != other.getGadgetType()) {
                return false;
            }
            if (this.getIsShowCutscene() != other.getIsShowCutscene()) {
                return false;
            }
            if (this.getAuthorityPeerId() != other.getAuthorityPeerId()) {
                return false;
            }
            if (this.getIsEnableInteract() != other.getIsEnableInteract()) {
                return false;
            }
            if (this.getInteractId() != other.getInteractId()) {
                return false;
            }
            if (this.getMarkFlag() != other.getMarkFlag()) {
                return false;
            }
            if (this.getPropOwnerEntityId() != other.getPropOwnerEntityId()) {
                return false;
            }
            if (this.hasPlatform() != other.hasPlatform()) {
                return false;
            }
            if (this.hasPlatform() && !this.getPlatform().equals(other.getPlatform())) {
                return false;
            }
            if (!this.getInteractUidListList().equals(other.getInteractUidListList())) {
                return false;
            }
            if (this.getDraftId() != other.getDraftId()) {
                return false;
            }
            if (this.getGadgetTalkState() != other.getGadgetTalkState()) {
                return false;
            }
            if (this.hasPlayInfo() != other.hasPlayInfo()) {
                return false;
            }
            if (this.hasPlayInfo() && !this.getPlayInfo().equals(other.getPlayInfo())) {
                return false;
            }
            if (!this.getContentCase().equals(other.getContentCase())) {
                return false;
            }
            switch (this.contentCase_) {
                case 12: {
                    if (!this.getTrifleItem().equals(other.getTrifleItem())) {
                        return false;
                    }
                    break;
                }
                case 13: {
                    if (!this.getGatherGadget().equals(other.getGatherGadget())) {
                        return false;
                    }
                    break;
                }
                case 14: {
                    if (!this.getWorktop().equals(other.getWorktop())) {
                        return false;
                    }
                    break;
                }
                case 15: {
                    if (!this.getClientGadget().equals(other.getClientGadget())) {
                        return false;
                    }
                    break;
                }
                case 17: {
                    if (!this.getWeather().equals(other.getWeather())) {
                        return false;
                    }
                    break;
                }
                case 18: {
                    if (!this.getAbilityGadget().equals(other.getAbilityGadget())) {
                        return false;
                    }
                    break;
                }
                case 19: {
                    if (!this.getStatueGadget().equals(other.getStatueGadget())) {
                        return false;
                    }
                    break;
                }
                case 20: {
                    if (!this.getBossChest().equals(other.getBossChest())) {
                        return false;
                    }
                    break;
                }
                case 41: {
                    if (!this.getBlossomChest().equals(other.getBlossomChest())) {
                        return false;
                    }
                    break;
                }
                case 42: {
                    if (!this.getMpPlayReward().equals(other.getMpPlayReward())) {
                        return false;
                    }
                    break;
                }
                case 43: {
                    if (!this.getGeneralReward().equals(other.getGeneralReward())) {
                        return false;
                    }
                    break;
                }
                case 44: {
                    if (!this.getOfferingInfo().equals(other.getOfferingInfo())) {
                        return false;
                    }
                    break;
                }
                case 45: {
                    if (!this.getFoundationInfo().equals(other.getFoundationInfo())) {
                        return false;
                    }
                    break;
                }
                case 46: {
                    if (!this.getVehicleInfo().equals(other.getVehicleInfo())) {
                        return false;
                    }
                    break;
                }
                case 47: {
                    if (!this.getShellInfo().equals(other.getShellInfo())) {
                        return false;
                    }
                    break;
                }
                case 48: {
                    if (!this.getScreenInfo().equals(other.getScreenInfo())) {
                        return false;
                    }
                    break;
                }
                case 59: {
                    if (!this.getFishPoolInfo().equals(other.getFishPoolInfo())) {
                        return false;
                    }
                    break;
                }
                case 60: {
                    if (!this.getCustomGadgetTreeInfo().equals(other.getCustomGadgetTreeInfo())) {
                        return false;
                    }
                    break;
                }
                case 61: {
                    if (!this.getRoguelikeGadgetInfo().equals(other.getRoguelikeGadgetInfo())) {
                        return false;
                    }
                    break;
                }
                case 62: {
                    if (!this.getNightCrowGadgetInfo().equals(other.getNightCrowGadgetInfo())) {
                        return false;
                    }
                    break;
                }
                case 63: {
                    if (!this.getDeshretObeliskGadgetInfo().equals(other.getDeshretObeliskGadgetInfo())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getGadgetId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getGroupId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getConfigId();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getOwnerEntityId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.bornType_;
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getGadgetState();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getGadgetType();
            hash = 37 * hash + 8;
            hash = 53 * hash + Internal.hashBoolean(this.getIsShowCutscene());
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getAuthorityPeerId();
            hash = 37 * hash + 10;
            hash = 53 * hash + Internal.hashBoolean(this.getIsEnableInteract());
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getInteractId();
            hash = 37 * hash + 21;
            hash = 53 * hash + this.getMarkFlag();
            hash = 37 * hash + 22;
            hash = 53 * hash + this.getPropOwnerEntityId();
            if (this.hasPlatform()) {
                hash = 37 * hash + 23;
                hash = 53 * hash + this.getPlatform().hashCode();
            }
            if (this.getInteractUidListCount() > 0) {
                hash = 37 * hash + 24;
                hash = 53 * hash + this.getInteractUidListList().hashCode();
            }
            hash = 37 * hash + 25;
            hash = 53 * hash + this.getDraftId();
            hash = 37 * hash + 26;
            hash = 53 * hash + this.getGadgetTalkState();
            if (this.hasPlayInfo()) {
                hash = 37 * hash + 100;
                hash = 53 * hash + this.getPlayInfo().hashCode();
            }
            switch (this.contentCase_) {
                case 12: {
                    hash = 37 * hash + 12;
                    hash = 53 * hash + this.getTrifleItem().hashCode();
                    break;
                }
                case 13: {
                    hash = 37 * hash + 13;
                    hash = 53 * hash + this.getGatherGadget().hashCode();
                    break;
                }
                case 14: {
                    hash = 37 * hash + 14;
                    hash = 53 * hash + this.getWorktop().hashCode();
                    break;
                }
                case 15: {
                    hash = 37 * hash + 15;
                    hash = 53 * hash + this.getClientGadget().hashCode();
                    break;
                }
                case 17: {
                    hash = 37 * hash + 17;
                    hash = 53 * hash + this.getWeather().hashCode();
                    break;
                }
                case 18: {
                    hash = 37 * hash + 18;
                    hash = 53 * hash + this.getAbilityGadget().hashCode();
                    break;
                }
                case 19: {
                    hash = 37 * hash + 19;
                    hash = 53 * hash + this.getStatueGadget().hashCode();
                    break;
                }
                case 20: {
                    hash = 37 * hash + 20;
                    hash = 53 * hash + this.getBossChest().hashCode();
                    break;
                }
                case 41: {
                    hash = 37 * hash + 41;
                    hash = 53 * hash + this.getBlossomChest().hashCode();
                    break;
                }
                case 42: {
                    hash = 37 * hash + 42;
                    hash = 53 * hash + this.getMpPlayReward().hashCode();
                    break;
                }
                case 43: {
                    hash = 37 * hash + 43;
                    hash = 53 * hash + this.getGeneralReward().hashCode();
                    break;
                }
                case 44: {
                    hash = 37 * hash + 44;
                    hash = 53 * hash + this.getOfferingInfo().hashCode();
                    break;
                }
                case 45: {
                    hash = 37 * hash + 45;
                    hash = 53 * hash + this.getFoundationInfo().hashCode();
                    break;
                }
                case 46: {
                    hash = 37 * hash + 46;
                    hash = 53 * hash + this.getVehicleInfo().hashCode();
                    break;
                }
                case 47: {
                    hash = 37 * hash + 47;
                    hash = 53 * hash + this.getShellInfo().hashCode();
                    break;
                }
                case 48: {
                    hash = 37 * hash + 48;
                    hash = 53 * hash + this.getScreenInfo().hashCode();
                    break;
                }
                case 59: {
                    hash = 37 * hash + 59;
                    hash = 53 * hash + this.getFishPoolInfo().hashCode();
                    break;
                }
                case 60: {
                    hash = 37 * hash + 60;
                    hash = 53 * hash + this.getCustomGadgetTreeInfo().hashCode();
                    break;
                }
                case 61: {
                    hash = 37 * hash + 61;
                    hash = 53 * hash + this.getRoguelikeGadgetInfo().hashCode();
                    break;
                }
                case 62: {
                    hash = 37 * hash + 62;
                    hash = 53 * hash + this.getNightCrowGadgetInfo().hashCode();
                    break;
                }
                case 63: {
                    hash = 37 * hash + 63;
                    hash = 53 * hash + this.getDeshretObeliskGadgetInfo().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneGadgetInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static SceneGadgetInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneGadgetInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static SceneGadgetInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneGadgetInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneGadgetInfo.PARSER.parseFrom(data);
        }
        
        public static SceneGadgetInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneGadgetInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneGadgetInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneGadgetInfo.PARSER, input);
        }
        
        public static SceneGadgetInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneGadgetInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneGadgetInfo.PARSER, input);
        }
        
        public static SceneGadgetInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneGadgetInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneGadgetInfo.PARSER, input);
        }
        
        public static SceneGadgetInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneGadgetInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneGadgetInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneGadgetInfo prototype) {
            return SceneGadgetInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneGadgetInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneGadgetInfo getDefaultInstance() {
            return SceneGadgetInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneGadgetInfo> parser() {
            return SceneGadgetInfo.PARSER;
        }
        
        @Override
        public Parser<SceneGadgetInfo> getParserForType() {
            return SceneGadgetInfo.PARSER;
        }
        
        @Override
        public SceneGadgetInfo getDefaultInstanceForType() {
            return SceneGadgetInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneGadgetInfo();
            PARSER = new AbstractParser<SceneGadgetInfo>() {
                @Override
                public SceneGadgetInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneGadgetInfo(input, extensionRegistry);
                }
            };
        }
        
        public enum ContentCase implements Internal.EnumLite, InternalOneOfEnum
        {
            TRIFLE_ITEM(12), 
            GATHER_GADGET(13), 
            WORKTOP(14), 
            CLIENT_GADGET(15), 
            WEATHER(17), 
            ABILITY_GADGET(18), 
            STATUE_GADGET(19), 
            BOSS_CHEST(20), 
            BLOSSOM_CHEST(41), 
            MP_PLAY_REWARD(42), 
            GENERAL_REWARD(43), 
            OFFERING_INFO(44), 
            FOUNDATION_INFO(45), 
            VEHICLE_INFO(46), 
            SHELL_INFO(47), 
            SCREEN_INFO(48), 
            FISH_POOL_INFO(59), 
            CUSTOM_GADGET_TREE_INFO(60), 
            ROGUELIKE_GADGET_INFO(61), 
            NIGHT_CROW_GADGET_INFO(62), 
            DESHRET_OBELISK_GADGET_INFO(63), 
            CONTENT_NOT_SET(0);
            
            private final int value;
            
            private ContentCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static ContentCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ContentCase forNumber(final int value) {
                switch (value) {
                    case 12: {
                        return ContentCase.TRIFLE_ITEM;
                    }
                    case 13: {
                        return ContentCase.GATHER_GADGET;
                    }
                    case 14: {
                        return ContentCase.WORKTOP;
                    }
                    case 15: {
                        return ContentCase.CLIENT_GADGET;
                    }
                    case 17: {
                        return ContentCase.WEATHER;
                    }
                    case 18: {
                        return ContentCase.ABILITY_GADGET;
                    }
                    case 19: {
                        return ContentCase.STATUE_GADGET;
                    }
                    case 20: {
                        return ContentCase.BOSS_CHEST;
                    }
                    case 41: {
                        return ContentCase.BLOSSOM_CHEST;
                    }
                    case 42: {
                        return ContentCase.MP_PLAY_REWARD;
                    }
                    case 43: {
                        return ContentCase.GENERAL_REWARD;
                    }
                    case 44: {
                        return ContentCase.OFFERING_INFO;
                    }
                    case 45: {
                        return ContentCase.FOUNDATION_INFO;
                    }
                    case 46: {
                        return ContentCase.VEHICLE_INFO;
                    }
                    case 47: {
                        return ContentCase.SHELL_INFO;
                    }
                    case 48: {
                        return ContentCase.SCREEN_INFO;
                    }
                    case 59: {
                        return ContentCase.FISH_POOL_INFO;
                    }
                    case 60: {
                        return ContentCase.CUSTOM_GADGET_TREE_INFO;
                    }
                    case 61: {
                        return ContentCase.ROGUELIKE_GADGET_INFO;
                    }
                    case 62: {
                        return ContentCase.NIGHT_CROW_GADGET_INFO;
                    }
                    case 63: {
                        return ContentCase.DESHRET_OBELISK_GADGET_INFO;
                    }
                    case 0: {
                        return ContentCase.CONTENT_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ ContentCase[] value() {
                return new ContentCase[] { ContentCase.TRIFLE_ITEM, ContentCase.GATHER_GADGET, ContentCase.WORKTOP, ContentCase.CLIENT_GADGET, ContentCase.WEATHER, ContentCase.ABILITY_GADGET, ContentCase.STATUE_GADGET, ContentCase.BOSS_CHEST, ContentCase.BLOSSOM_CHEST, ContentCase.MP_PLAY_REWARD, ContentCase.GENERAL_REWARD, ContentCase.OFFERING_INFO, ContentCase.FOUNDATION_INFO, ContentCase.VEHICLE_INFO, ContentCase.SHELL_INFO, ContentCase.SCREEN_INFO, ContentCase.FISH_POOL_INFO, ContentCase.CUSTOM_GADGET_TREE_INFO, ContentCase.ROGUELIKE_GADGET_INFO, ContentCase.NIGHT_CROW_GADGET_INFO, ContentCase.DESHRET_OBELISK_GADGET_INFO, ContentCase.CONTENT_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneGadgetInfoOrBuilder
        {
            private int contentCase_;
            private Object content_;
            private int bitField0_;
            private int gadgetId_;
            private int groupId_;
            private int configId_;
            private int ownerEntityId_;
            private int bornType_;
            private int gadgetState_;
            private int gadgetType_;
            private boolean isShowCutscene_;
            private int authorityPeerId_;
            private boolean isEnableInteract_;
            private int interactId_;
            private int markFlag_;
            private int propOwnerEntityId_;
            private PlatformInfoOuterClass.PlatformInfo platform_;
            private SingleFieldBuilderV3<PlatformInfoOuterClass.PlatformInfo, PlatformInfoOuterClass.PlatformInfo.Builder, PlatformInfoOuterClass.PlatformInfoOrBuilder> platformBuilder_;
            private Internal.IntList interactUidList_;
            private int draftId_;
            private int gadgetTalkState_;
            private GadgetPlayInfoOuterClass.GadgetPlayInfo playInfo_;
            private SingleFieldBuilderV3<GadgetPlayInfoOuterClass.GadgetPlayInfo, GadgetPlayInfoOuterClass.GadgetPlayInfo.Builder, GadgetPlayInfoOuterClass.GadgetPlayInfoOrBuilder> playInfoBuilder_;
            private SingleFieldBuilderV3<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder> trifleItemBuilder_;
            private SingleFieldBuilderV3<GatherGadgetInfoOuterClass.GatherGadgetInfo, GatherGadgetInfoOuterClass.GatherGadgetInfo.Builder, GatherGadgetInfoOuterClass.GatherGadgetInfoOrBuilder> gatherGadgetBuilder_;
            private SingleFieldBuilderV3<WorktopInfoOuterClass.WorktopInfo, WorktopInfoOuterClass.WorktopInfo.Builder, WorktopInfoOuterClass.WorktopInfoOrBuilder> worktopBuilder_;
            private SingleFieldBuilderV3<ClientGadgetInfoOuterClass.ClientGadgetInfo, ClientGadgetInfoOuterClass.ClientGadgetInfo.Builder, ClientGadgetInfoOuterClass.ClientGadgetInfoOrBuilder> clientGadgetBuilder_;
            private SingleFieldBuilderV3<WeatherInfoOuterClass.WeatherInfo, WeatherInfoOuterClass.WeatherInfo.Builder, WeatherInfoOuterClass.WeatherInfoOrBuilder> weatherBuilder_;
            private SingleFieldBuilderV3<AbilityGadgetInfoOuterClass.AbilityGadgetInfo, AbilityGadgetInfoOuterClass.AbilityGadgetInfo.Builder, AbilityGadgetInfoOuterClass.AbilityGadgetInfoOrBuilder> abilityGadgetBuilder_;
            private SingleFieldBuilderV3<StatueGadgetInfoOuterClass.StatueGadgetInfo, StatueGadgetInfoOuterClass.StatueGadgetInfo.Builder, StatueGadgetInfoOuterClass.StatueGadgetInfoOrBuilder> statueGadgetBuilder_;
            private SingleFieldBuilderV3<BossChestInfoOuterClass.BossChestInfo, BossChestInfoOuterClass.BossChestInfo.Builder, BossChestInfoOuterClass.BossChestInfoOrBuilder> bossChestBuilder_;
            private SingleFieldBuilderV3<BlossomChestInfoOuterClass.BlossomChestInfo, BlossomChestInfoOuterClass.BlossomChestInfo.Builder, BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder> blossomChestBuilder_;
            private SingleFieldBuilderV3<MpPlayRewardInfoOuterClass.MpPlayRewardInfo, MpPlayRewardInfoOuterClass.MpPlayRewardInfo.Builder, MpPlayRewardInfoOuterClass.MpPlayRewardInfoOrBuilder> mpPlayRewardBuilder_;
            private SingleFieldBuilderV3<GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder> generalRewardBuilder_;
            private SingleFieldBuilderV3<OfferingInfoOuterClass.OfferingInfo, OfferingInfoOuterClass.OfferingInfo.Builder, OfferingInfoOuterClass.OfferingInfoOrBuilder> offeringInfoBuilder_;
            private SingleFieldBuilderV3<FoundationInfoOuterClass.FoundationInfo, FoundationInfoOuterClass.FoundationInfo.Builder, FoundationInfoOuterClass.FoundationInfoOrBuilder> foundationInfoBuilder_;
            private SingleFieldBuilderV3<VehicleInfoOuterClass.VehicleInfo, VehicleInfoOuterClass.VehicleInfo.Builder, VehicleInfoOuterClass.VehicleInfoOrBuilder> vehicleInfoBuilder_;
            private SingleFieldBuilderV3<EchoShellInfoOuterClass.EchoShellInfo, EchoShellInfoOuterClass.EchoShellInfo.Builder, EchoShellInfoOuterClass.EchoShellInfoOrBuilder> shellInfoBuilder_;
            private SingleFieldBuilderV3<ScreenInfoOuterClass.ScreenInfo, ScreenInfoOuterClass.ScreenInfo.Builder, ScreenInfoOuterClass.ScreenInfoOrBuilder> screenInfoBuilder_;
            private SingleFieldBuilderV3<FishPoolInfoOuterClass.FishPoolInfo, FishPoolInfoOuterClass.FishPoolInfo.Builder, FishPoolInfoOuterClass.FishPoolInfoOrBuilder> fishPoolInfoBuilder_;
            private SingleFieldBuilderV3<CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> customGadgetTreeInfoBuilder_;
            private SingleFieldBuilderV3<RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo, RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.Builder, RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfoOrBuilder> roguelikeGadgetInfoBuilder_;
            private SingleFieldBuilderV3<NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo, NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.Builder, NightCrowGadgetInfoOuterClass.NightCrowGadgetInfoOrBuilder> nightCrowGadgetInfoBuilder_;
            private SingleFieldBuilderV3<DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo, DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.Builder, DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfoOrBuilder> deshretObeliskGadgetInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneGadgetInfoOuterClass.internal_static_SceneGadgetInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneGadgetInfoOuterClass.internal_static_SceneGadgetInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneGadgetInfo.class, Builder.class);
            }
            
            private Builder() {
                this.contentCase_ = 0;
                this.bornType_ = 0;
                this.interactUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.contentCase_ = 0;
                this.bornType_ = 0;
                this.interactUidList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneGadgetInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.gadgetId_ = 0;
                this.groupId_ = 0;
                this.configId_ = 0;
                this.ownerEntityId_ = 0;
                this.bornType_ = 0;
                this.gadgetState_ = 0;
                this.gadgetType_ = 0;
                this.isShowCutscene_ = false;
                this.authorityPeerId_ = 0;
                this.isEnableInteract_ = false;
                this.interactId_ = 0;
                this.markFlag_ = 0;
                this.propOwnerEntityId_ = 0;
                if (this.platformBuilder_ == null) {
                    this.platform_ = null;
                }
                else {
                    this.platform_ = null;
                    this.platformBuilder_ = null;
                }
                this.interactUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.draftId_ = 0;
                this.gadgetTalkState_ = 0;
                if (this.playInfoBuilder_ == null) {
                    this.playInfo_ = null;
                }
                else {
                    this.playInfo_ = null;
                    this.playInfoBuilder_ = null;
                }
                this.contentCase_ = 0;
                this.content_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneGadgetInfoOuterClass.internal_static_SceneGadgetInfo_descriptor;
            }
            
            @Override
            public SceneGadgetInfo getDefaultInstanceForType() {
                return SceneGadgetInfo.getDefaultInstance();
            }
            
            @Override
            public SceneGadgetInfo build() {
                final SceneGadgetInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneGadgetInfo buildPartial() {
                final SceneGadgetInfo result = new SceneGadgetInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.gadgetId_ = this.gadgetId_;
                result.groupId_ = this.groupId_;
                result.configId_ = this.configId_;
                result.ownerEntityId_ = this.ownerEntityId_;
                result.bornType_ = this.bornType_;
                result.gadgetState_ = this.gadgetState_;
                result.gadgetType_ = this.gadgetType_;
                result.isShowCutscene_ = this.isShowCutscene_;
                result.authorityPeerId_ = this.authorityPeerId_;
                result.isEnableInteract_ = this.isEnableInteract_;
                result.interactId_ = this.interactId_;
                result.markFlag_ = this.markFlag_;
                result.propOwnerEntityId_ = this.propOwnerEntityId_;
                if (this.platformBuilder_ == null) {
                    result.platform_ = this.platform_;
                }
                else {
                    result.platform_ = this.platformBuilder_.build();
                }
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.interactUidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.interactUidList_ = this.interactUidList_;
                result.draftId_ = this.draftId_;
                result.gadgetTalkState_ = this.gadgetTalkState_;
                if (this.playInfoBuilder_ == null) {
                    result.playInfo_ = this.playInfo_;
                }
                else {
                    result.playInfo_ = this.playInfoBuilder_.build();
                }
                if (this.contentCase_ == 12) {
                    if (this.trifleItemBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.trifleItemBuilder_.build();
                    }
                }
                if (this.contentCase_ == 13) {
                    if (this.gatherGadgetBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.gatherGadgetBuilder_.build();
                    }
                }
                if (this.contentCase_ == 14) {
                    if (this.worktopBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.worktopBuilder_.build();
                    }
                }
                if (this.contentCase_ == 15) {
                    if (this.clientGadgetBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.clientGadgetBuilder_.build();
                    }
                }
                if (this.contentCase_ == 17) {
                    if (this.weatherBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.weatherBuilder_.build();
                    }
                }
                if (this.contentCase_ == 18) {
                    if (this.abilityGadgetBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.abilityGadgetBuilder_.build();
                    }
                }
                if (this.contentCase_ == 19) {
                    if (this.statueGadgetBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.statueGadgetBuilder_.build();
                    }
                }
                if (this.contentCase_ == 20) {
                    if (this.bossChestBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.bossChestBuilder_.build();
                    }
                }
                if (this.contentCase_ == 41) {
                    if (this.blossomChestBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.blossomChestBuilder_.build();
                    }
                }
                if (this.contentCase_ == 42) {
                    if (this.mpPlayRewardBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.mpPlayRewardBuilder_.build();
                    }
                }
                if (this.contentCase_ == 43) {
                    if (this.generalRewardBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.generalRewardBuilder_.build();
                    }
                }
                if (this.contentCase_ == 44) {
                    if (this.offeringInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.offeringInfoBuilder_.build();
                    }
                }
                if (this.contentCase_ == 45) {
                    if (this.foundationInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.foundationInfoBuilder_.build();
                    }
                }
                if (this.contentCase_ == 46) {
                    if (this.vehicleInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.vehicleInfoBuilder_.build();
                    }
                }
                if (this.contentCase_ == 47) {
                    if (this.shellInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.shellInfoBuilder_.build();
                    }
                }
                if (this.contentCase_ == 48) {
                    if (this.screenInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.screenInfoBuilder_.build();
                    }
                }
                if (this.contentCase_ == 59) {
                    if (this.fishPoolInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.fishPoolInfoBuilder_.build();
                    }
                }
                if (this.contentCase_ == 60) {
                    if (this.customGadgetTreeInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.customGadgetTreeInfoBuilder_.build();
                    }
                }
                if (this.contentCase_ == 61) {
                    if (this.roguelikeGadgetInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.roguelikeGadgetInfoBuilder_.build();
                    }
                }
                if (this.contentCase_ == 62) {
                    if (this.nightCrowGadgetInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.nightCrowGadgetInfoBuilder_.build();
                    }
                }
                if (this.contentCase_ == 63) {
                    if (this.deshretObeliskGadgetInfoBuilder_ == null) {
                        result.content_ = this.content_;
                    }
                    else {
                        result.content_ = this.deshretObeliskGadgetInfoBuilder_.build();
                    }
                }
                result.contentCase_ = this.contentCase_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof SceneGadgetInfo) {
                    return this.mergeFrom((SceneGadgetInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneGadgetInfo other) {
                if (other == SceneGadgetInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getGadgetId() != 0) {
                    this.setGadgetId(other.getGadgetId());
                }
                if (other.getGroupId() != 0) {
                    this.setGroupId(other.getGroupId());
                }
                if (other.getConfigId() != 0) {
                    this.setConfigId(other.getConfigId());
                }
                if (other.getOwnerEntityId() != 0) {
                    this.setOwnerEntityId(other.getOwnerEntityId());
                }
                if (other.bornType_ != 0) {
                    this.setBornTypeValue(other.getBornTypeValue());
                }
                if (other.getGadgetState() != 0) {
                    this.setGadgetState(other.getGadgetState());
                }
                if (other.getGadgetType() != 0) {
                    this.setGadgetType(other.getGadgetType());
                }
                if (other.getIsShowCutscene()) {
                    this.setIsShowCutscene(other.getIsShowCutscene());
                }
                if (other.getAuthorityPeerId() != 0) {
                    this.setAuthorityPeerId(other.getAuthorityPeerId());
                }
                if (other.getIsEnableInteract()) {
                    this.setIsEnableInteract(other.getIsEnableInteract());
                }
                if (other.getInteractId() != 0) {
                    this.setInteractId(other.getInteractId());
                }
                if (other.getMarkFlag() != 0) {
                    this.setMarkFlag(other.getMarkFlag());
                }
                if (other.getPropOwnerEntityId() != 0) {
                    this.setPropOwnerEntityId(other.getPropOwnerEntityId());
                }
                if (other.hasPlatform()) {
                    this.mergePlatform(other.getPlatform());
                }
                if (!other.interactUidList_.isEmpty()) {
                    if (this.interactUidList_.isEmpty()) {
                        this.interactUidList_ = other.interactUidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureInteractUidListIsMutable();
                        this.interactUidList_.addAll(other.interactUidList_);
                    }
                    this.onChanged();
                }
                if (other.getDraftId() != 0) {
                    this.setDraftId(other.getDraftId());
                }
                if (other.getGadgetTalkState() != 0) {
                    this.setGadgetTalkState(other.getGadgetTalkState());
                }
                if (other.hasPlayInfo()) {
                    this.mergePlayInfo(other.getPlayInfo());
                }
                switch (other.getContentCase()) {
                    case TRIFLE_ITEM: {
                        this.mergeTrifleItem(other.getTrifleItem());
                        break;
                    }
                    case GATHER_GADGET: {
                        this.mergeGatherGadget(other.getGatherGadget());
                        break;
                    }
                    case WORKTOP: {
                        this.mergeWorktop(other.getWorktop());
                        break;
                    }
                    case CLIENT_GADGET: {
                        this.mergeClientGadget(other.getClientGadget());
                        break;
                    }
                    case WEATHER: {
                        this.mergeWeather(other.getWeather());
                        break;
                    }
                    case ABILITY_GADGET: {
                        this.mergeAbilityGadget(other.getAbilityGadget());
                        break;
                    }
                    case STATUE_GADGET: {
                        this.mergeStatueGadget(other.getStatueGadget());
                        break;
                    }
                    case BOSS_CHEST: {
                        this.mergeBossChest(other.getBossChest());
                        break;
                    }
                    case BLOSSOM_CHEST: {
                        this.mergeBlossomChest(other.getBlossomChest());
                        break;
                    }
                    case MP_PLAY_REWARD: {
                        this.mergeMpPlayReward(other.getMpPlayReward());
                        break;
                    }
                    case GENERAL_REWARD: {
                        this.mergeGeneralReward(other.getGeneralReward());
                        break;
                    }
                    case OFFERING_INFO: {
                        this.mergeOfferingInfo(other.getOfferingInfo());
                        break;
                    }
                    case FOUNDATION_INFO: {
                        this.mergeFoundationInfo(other.getFoundationInfo());
                        break;
                    }
                    case VEHICLE_INFO: {
                        this.mergeVehicleInfo(other.getVehicleInfo());
                        break;
                    }
                    case SHELL_INFO: {
                        this.mergeShellInfo(other.getShellInfo());
                        break;
                    }
                    case SCREEN_INFO: {
                        this.mergeScreenInfo(other.getScreenInfo());
                        break;
                    }
                    case FISH_POOL_INFO: {
                        this.mergeFishPoolInfo(other.getFishPoolInfo());
                        break;
                    }
                    case CUSTOM_GADGET_TREE_INFO: {
                        this.mergeCustomGadgetTreeInfo(other.getCustomGadgetTreeInfo());
                        break;
                    }
                    case ROGUELIKE_GADGET_INFO: {
                        this.mergeRoguelikeGadgetInfo(other.getRoguelikeGadgetInfo());
                        break;
                    }
                    case NIGHT_CROW_GADGET_INFO: {
                        this.mergeNightCrowGadgetInfo(other.getNightCrowGadgetInfo());
                        break;
                    }
                    case DESHRET_OBELISK_GADGET_INFO: {
                        this.mergeDeshretObeliskGadgetInfo(other.getDeshretObeliskGadgetInfo());
                        break;
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                SceneGadgetInfo parsedMessage = null;
                try {
                    parsedMessage = SceneGadgetInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneGadgetInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public ContentCase getContentCase() {
                return ContentCase.forNumber(this.contentCase_);
            }
            
            public Builder clearContent() {
                this.contentCase_ = 0;
                this.content_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGadgetId() {
                return this.gadgetId_;
            }
            
            public Builder setGadgetId(final int value) {
                this.gadgetId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGadgetId() {
                this.gadgetId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGroupId() {
                return this.groupId_;
            }
            
            public Builder setGroupId(final int value) {
                this.groupId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGroupId() {
                this.groupId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getConfigId() {
                return this.configId_;
            }
            
            public Builder setConfigId(final int value) {
                this.configId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearConfigId() {
                this.configId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOwnerEntityId() {
                return this.ownerEntityId_;
            }
            
            public Builder setOwnerEntityId(final int value) {
                this.ownerEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOwnerEntityId() {
                this.ownerEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBornTypeValue() {
                return this.bornType_;
            }
            
            public Builder setBornTypeValue(final int value) {
                this.bornType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public GadgetBornTypeOuterClass.GadgetBornType getBornType() {
                final GadgetBornTypeOuterClass.GadgetBornType result = GadgetBornTypeOuterClass.GadgetBornType.valueOf(this.bornType_);
                return (result == null) ? GadgetBornTypeOuterClass.GadgetBornType.UNRECOGNIZED : result;
            }
            
            public Builder setBornType(final GadgetBornTypeOuterClass.GadgetBornType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.bornType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearBornType() {
                this.bornType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGadgetState() {
                return this.gadgetState_;
            }
            
            public Builder setGadgetState(final int value) {
                this.gadgetState_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGadgetState() {
                this.gadgetState_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGadgetType() {
                return this.gadgetType_;
            }
            
            public Builder setGadgetType(final int value) {
                this.gadgetType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGadgetType() {
                this.gadgetType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsShowCutscene() {
                return this.isShowCutscene_;
            }
            
            public Builder setIsShowCutscene(final boolean value) {
                this.isShowCutscene_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsShowCutscene() {
                this.isShowCutscene_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAuthorityPeerId() {
                return this.authorityPeerId_;
            }
            
            public Builder setAuthorityPeerId(final int value) {
                this.authorityPeerId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAuthorityPeerId() {
                this.authorityPeerId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsEnableInteract() {
                return this.isEnableInteract_;
            }
            
            public Builder setIsEnableInteract(final boolean value) {
                this.isEnableInteract_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsEnableInteract() {
                this.isEnableInteract_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getInteractId() {
                return this.interactId_;
            }
            
            public Builder setInteractId(final int value) {
                this.interactId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearInteractId() {
                this.interactId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMarkFlag() {
                return this.markFlag_;
            }
            
            public Builder setMarkFlag(final int value) {
                this.markFlag_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMarkFlag() {
                this.markFlag_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPropOwnerEntityId() {
                return this.propOwnerEntityId_;
            }
            
            public Builder setPropOwnerEntityId(final int value) {
                this.propOwnerEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPropOwnerEntityId() {
                this.propOwnerEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasPlatform() {
                return this.platformBuilder_ != null || this.platform_ != null;
            }
            
            @Override
            public PlatformInfoOuterClass.PlatformInfo getPlatform() {
                if (this.platformBuilder_ == null) {
                    return (this.platform_ == null) ? PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : this.platform_;
                }
                return this.platformBuilder_.getMessage();
            }
            
            public Builder setPlatform(final PlatformInfoOuterClass.PlatformInfo value) {
                if (this.platformBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.platform_ = value;
                    this.onChanged();
                }
                else {
                    this.platformBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPlatform(final PlatformInfoOuterClass.PlatformInfo.Builder builderForValue) {
                if (this.platformBuilder_ == null) {
                    this.platform_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.platformBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePlatform(final PlatformInfoOuterClass.PlatformInfo value) {
                if (this.platformBuilder_ == null) {
                    if (this.platform_ != null) {
                        this.platform_ = PlatformInfoOuterClass.PlatformInfo.newBuilder(this.platform_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.platform_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.platformBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPlatform() {
                if (this.platformBuilder_ == null) {
                    this.platform_ = null;
                    this.onChanged();
                }
                else {
                    this.platform_ = null;
                    this.platformBuilder_ = null;
                }
                return this;
            }
            
            public PlatformInfoOuterClass.PlatformInfo.Builder getPlatformBuilder() {
                this.onChanged();
                return this.getPlatformFieldBuilder().getBuilder();
            }
            
            @Override
            public PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder() {
                if (this.platformBuilder_ != null) {
                    return this.platformBuilder_.getMessageOrBuilder();
                }
                return (this.platform_ == null) ? PlatformInfoOuterClass.PlatformInfo.getDefaultInstance() : this.platform_;
            }
            
            private SingleFieldBuilderV3<PlatformInfoOuterClass.PlatformInfo, PlatformInfoOuterClass.PlatformInfo.Builder, PlatformInfoOuterClass.PlatformInfoOrBuilder> getPlatformFieldBuilder() {
                if (this.platformBuilder_ == null) {
                    this.platformBuilder_ = new SingleFieldBuilderV3<PlatformInfoOuterClass.PlatformInfo, PlatformInfoOuterClass.PlatformInfo.Builder, PlatformInfoOuterClass.PlatformInfoOrBuilder>(this.getPlatform(), this.getParentForChildren(), this.isClean());
                    this.platform_ = null;
                }
                return this.platformBuilder_;
            }
            
            private void ensureInteractUidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.interactUidList_ = GeneratedMessageV3.mutableCopy(this.interactUidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getInteractUidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.interactUidList_) : this.interactUidList_;
            }
            
            @Override
            public int getInteractUidListCount() {
                return this.interactUidList_.size();
            }
            
            @Override
            public int getInteractUidList(final int index) {
                return this.interactUidList_.getInt(index);
            }
            
            public Builder setInteractUidList(final int index, final int value) {
                this.ensureInteractUidListIsMutable();
                this.interactUidList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addInteractUidList(final int value) {
                this.ensureInteractUidListIsMutable();
                this.interactUidList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllInteractUidList(final Iterable<? extends Integer> values) {
                this.ensureInteractUidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.interactUidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearInteractUidList() {
                this.interactUidList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDraftId() {
                return this.draftId_;
            }
            
            public Builder setDraftId(final int value) {
                this.draftId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDraftId() {
                this.draftId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGadgetTalkState() {
                return this.gadgetTalkState_;
            }
            
            public Builder setGadgetTalkState(final int value) {
                this.gadgetTalkState_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGadgetTalkState() {
                this.gadgetTalkState_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasPlayInfo() {
                return this.playInfoBuilder_ != null || this.playInfo_ != null;
            }
            
            @Override
            public GadgetPlayInfoOuterClass.GadgetPlayInfo getPlayInfo() {
                if (this.playInfoBuilder_ == null) {
                    return (this.playInfo_ == null) ? GadgetPlayInfoOuterClass.GadgetPlayInfo.getDefaultInstance() : this.playInfo_;
                }
                return this.playInfoBuilder_.getMessage();
            }
            
            public Builder setPlayInfo(final GadgetPlayInfoOuterClass.GadgetPlayInfo value) {
                if (this.playInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.playInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.playInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPlayInfo(final GadgetPlayInfoOuterClass.GadgetPlayInfo.Builder builderForValue) {
                if (this.playInfoBuilder_ == null) {
                    this.playInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.playInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePlayInfo(final GadgetPlayInfoOuterClass.GadgetPlayInfo value) {
                if (this.playInfoBuilder_ == null) {
                    if (this.playInfo_ != null) {
                        this.playInfo_ = GadgetPlayInfoOuterClass.GadgetPlayInfo.newBuilder(this.playInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.playInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.playInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPlayInfo() {
                if (this.playInfoBuilder_ == null) {
                    this.playInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.playInfo_ = null;
                    this.playInfoBuilder_ = null;
                }
                return this;
            }
            
            public GadgetPlayInfoOuterClass.GadgetPlayInfo.Builder getPlayInfoBuilder() {
                this.onChanged();
                return this.getPlayInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public GadgetPlayInfoOuterClass.GadgetPlayInfoOrBuilder getPlayInfoOrBuilder() {
                if (this.playInfoBuilder_ != null) {
                    return this.playInfoBuilder_.getMessageOrBuilder();
                }
                return (this.playInfo_ == null) ? GadgetPlayInfoOuterClass.GadgetPlayInfo.getDefaultInstance() : this.playInfo_;
            }
            
            private SingleFieldBuilderV3<GadgetPlayInfoOuterClass.GadgetPlayInfo, GadgetPlayInfoOuterClass.GadgetPlayInfo.Builder, GadgetPlayInfoOuterClass.GadgetPlayInfoOrBuilder> getPlayInfoFieldBuilder() {
                if (this.playInfoBuilder_ == null) {
                    this.playInfoBuilder_ = new SingleFieldBuilderV3<GadgetPlayInfoOuterClass.GadgetPlayInfo, GadgetPlayInfoOuterClass.GadgetPlayInfo.Builder, GadgetPlayInfoOuterClass.GadgetPlayInfoOrBuilder>(this.getPlayInfo(), this.getParentForChildren(), this.isClean());
                    this.playInfo_ = null;
                }
                return this.playInfoBuilder_;
            }
            
            @Override
            public boolean hasTrifleItem() {
                return this.contentCase_ == 12;
            }
            
            @Override
            public ItemOuterClass.Item getTrifleItem() {
                if (this.trifleItemBuilder_ == null) {
                    if (this.contentCase_ == 12) {
                        return (ItemOuterClass.Item)this.content_;
                    }
                    return ItemOuterClass.Item.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 12) {
                        return this.trifleItemBuilder_.getMessage();
                    }
                    return ItemOuterClass.Item.getDefaultInstance();
                }
            }
            
            public Builder setTrifleItem(final ItemOuterClass.Item value) {
                if (this.trifleItemBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.trifleItemBuilder_.setMessage(value);
                }
                this.contentCase_ = 12;
                return this;
            }
            
            public Builder setTrifleItem(final ItemOuterClass.Item.Builder builderForValue) {
                if (this.trifleItemBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.trifleItemBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 12;
                return this;
            }
            
            public Builder mergeTrifleItem(final ItemOuterClass.Item value) {
                if (this.trifleItemBuilder_ == null) {
                    if (this.contentCase_ == 12 && this.content_ != ItemOuterClass.Item.getDefaultInstance()) {
                        this.content_ = ItemOuterClass.Item.newBuilder((ItemOuterClass.Item)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 12) {
                        this.trifleItemBuilder_.mergeFrom(value);
                    }
                    this.trifleItemBuilder_.setMessage(value);
                }
                this.contentCase_ = 12;
                return this;
            }
            
            public Builder clearTrifleItem() {
                if (this.trifleItemBuilder_ == null) {
                    if (this.contentCase_ == 12) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 12) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.trifleItemBuilder_.clear();
                }
                return this;
            }
            
            public ItemOuterClass.Item.Builder getTrifleItemBuilder() {
                return this.getTrifleItemFieldBuilder().getBuilder();
            }
            
            @Override
            public ItemOuterClass.ItemOrBuilder getTrifleItemOrBuilder() {
                if (this.contentCase_ == 12 && this.trifleItemBuilder_ != null) {
                    return this.trifleItemBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 12) {
                    return (ItemOuterClass.Item)this.content_;
                }
                return ItemOuterClass.Item.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder> getTrifleItemFieldBuilder() {
                if (this.trifleItemBuilder_ == null) {
                    if (this.contentCase_ != 12) {
                        this.content_ = ItemOuterClass.Item.getDefaultInstance();
                    }
                    this.trifleItemBuilder_ = new SingleFieldBuilderV3<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder>((ItemOuterClass.Item)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 12;
                this.onChanged();
                return this.trifleItemBuilder_;
            }
            
            @Override
            public boolean hasGatherGadget() {
                return this.contentCase_ == 13;
            }
            
            @Override
            public GatherGadgetInfoOuterClass.GatherGadgetInfo getGatherGadget() {
                if (this.gatherGadgetBuilder_ == null) {
                    if (this.contentCase_ == 13) {
                        return (GatherGadgetInfoOuterClass.GatherGadgetInfo)this.content_;
                    }
                    return GatherGadgetInfoOuterClass.GatherGadgetInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 13) {
                        return this.gatherGadgetBuilder_.getMessage();
                    }
                    return GatherGadgetInfoOuterClass.GatherGadgetInfo.getDefaultInstance();
                }
            }
            
            public Builder setGatherGadget(final GatherGadgetInfoOuterClass.GatherGadgetInfo value) {
                if (this.gatherGadgetBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.gatherGadgetBuilder_.setMessage(value);
                }
                this.contentCase_ = 13;
                return this;
            }
            
            public Builder setGatherGadget(final GatherGadgetInfoOuterClass.GatherGadgetInfo.Builder builderForValue) {
                if (this.gatherGadgetBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.gatherGadgetBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 13;
                return this;
            }
            
            public Builder mergeGatherGadget(final GatherGadgetInfoOuterClass.GatherGadgetInfo value) {
                if (this.gatherGadgetBuilder_ == null) {
                    if (this.contentCase_ == 13 && this.content_ != GatherGadgetInfoOuterClass.GatherGadgetInfo.getDefaultInstance()) {
                        this.content_ = GatherGadgetInfoOuterClass.GatherGadgetInfo.newBuilder((GatherGadgetInfoOuterClass.GatherGadgetInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 13) {
                        this.gatherGadgetBuilder_.mergeFrom(value);
                    }
                    this.gatherGadgetBuilder_.setMessage(value);
                }
                this.contentCase_ = 13;
                return this;
            }
            
            public Builder clearGatherGadget() {
                if (this.gatherGadgetBuilder_ == null) {
                    if (this.contentCase_ == 13) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 13) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.gatherGadgetBuilder_.clear();
                }
                return this;
            }
            
            public GatherGadgetInfoOuterClass.GatherGadgetInfo.Builder getGatherGadgetBuilder() {
                return this.getGatherGadgetFieldBuilder().getBuilder();
            }
            
            @Override
            public GatherGadgetInfoOuterClass.GatherGadgetInfoOrBuilder getGatherGadgetOrBuilder() {
                if (this.contentCase_ == 13 && this.gatherGadgetBuilder_ != null) {
                    return this.gatherGadgetBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 13) {
                    return (GatherGadgetInfoOuterClass.GatherGadgetInfo)this.content_;
                }
                return GatherGadgetInfoOuterClass.GatherGadgetInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<GatherGadgetInfoOuterClass.GatherGadgetInfo, GatherGadgetInfoOuterClass.GatherGadgetInfo.Builder, GatherGadgetInfoOuterClass.GatherGadgetInfoOrBuilder> getGatherGadgetFieldBuilder() {
                if (this.gatherGadgetBuilder_ == null) {
                    if (this.contentCase_ != 13) {
                        this.content_ = GatherGadgetInfoOuterClass.GatherGadgetInfo.getDefaultInstance();
                    }
                    this.gatherGadgetBuilder_ = new SingleFieldBuilderV3<GatherGadgetInfoOuterClass.GatherGadgetInfo, GatherGadgetInfoOuterClass.GatherGadgetInfo.Builder, GatherGadgetInfoOuterClass.GatherGadgetInfoOrBuilder>((GatherGadgetInfoOuterClass.GatherGadgetInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 13;
                this.onChanged();
                return this.gatherGadgetBuilder_;
            }
            
            @Override
            public boolean hasWorktop() {
                return this.contentCase_ == 14;
            }
            
            @Override
            public WorktopInfoOuterClass.WorktopInfo getWorktop() {
                if (this.worktopBuilder_ == null) {
                    if (this.contentCase_ == 14) {
                        return (WorktopInfoOuterClass.WorktopInfo)this.content_;
                    }
                    return WorktopInfoOuterClass.WorktopInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 14) {
                        return this.worktopBuilder_.getMessage();
                    }
                    return WorktopInfoOuterClass.WorktopInfo.getDefaultInstance();
                }
            }
            
            public Builder setWorktop(final WorktopInfoOuterClass.WorktopInfo value) {
                if (this.worktopBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.worktopBuilder_.setMessage(value);
                }
                this.contentCase_ = 14;
                return this;
            }
            
            public Builder setWorktop(final WorktopInfoOuterClass.WorktopInfo.Builder builderForValue) {
                if (this.worktopBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.worktopBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 14;
                return this;
            }
            
            public Builder mergeWorktop(final WorktopInfoOuterClass.WorktopInfo value) {
                if (this.worktopBuilder_ == null) {
                    if (this.contentCase_ == 14 && this.content_ != WorktopInfoOuterClass.WorktopInfo.getDefaultInstance()) {
                        this.content_ = WorktopInfoOuterClass.WorktopInfo.newBuilder((WorktopInfoOuterClass.WorktopInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 14) {
                        this.worktopBuilder_.mergeFrom(value);
                    }
                    this.worktopBuilder_.setMessage(value);
                }
                this.contentCase_ = 14;
                return this;
            }
            
            public Builder clearWorktop() {
                if (this.worktopBuilder_ == null) {
                    if (this.contentCase_ == 14) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 14) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.worktopBuilder_.clear();
                }
                return this;
            }
            
            public WorktopInfoOuterClass.WorktopInfo.Builder getWorktopBuilder() {
                return this.getWorktopFieldBuilder().getBuilder();
            }
            
            @Override
            public WorktopInfoOuterClass.WorktopInfoOrBuilder getWorktopOrBuilder() {
                if (this.contentCase_ == 14 && this.worktopBuilder_ != null) {
                    return this.worktopBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 14) {
                    return (WorktopInfoOuterClass.WorktopInfo)this.content_;
                }
                return WorktopInfoOuterClass.WorktopInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<WorktopInfoOuterClass.WorktopInfo, WorktopInfoOuterClass.WorktopInfo.Builder, WorktopInfoOuterClass.WorktopInfoOrBuilder> getWorktopFieldBuilder() {
                if (this.worktopBuilder_ == null) {
                    if (this.contentCase_ != 14) {
                        this.content_ = WorktopInfoOuterClass.WorktopInfo.getDefaultInstance();
                    }
                    this.worktopBuilder_ = new SingleFieldBuilderV3<WorktopInfoOuterClass.WorktopInfo, WorktopInfoOuterClass.WorktopInfo.Builder, WorktopInfoOuterClass.WorktopInfoOrBuilder>((WorktopInfoOuterClass.WorktopInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 14;
                this.onChanged();
                return this.worktopBuilder_;
            }
            
            @Override
            public boolean hasClientGadget() {
                return this.contentCase_ == 15;
            }
            
            @Override
            public ClientGadgetInfoOuterClass.ClientGadgetInfo getClientGadget() {
                if (this.clientGadgetBuilder_ == null) {
                    if (this.contentCase_ == 15) {
                        return (ClientGadgetInfoOuterClass.ClientGadgetInfo)this.content_;
                    }
                    return ClientGadgetInfoOuterClass.ClientGadgetInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 15) {
                        return this.clientGadgetBuilder_.getMessage();
                    }
                    return ClientGadgetInfoOuterClass.ClientGadgetInfo.getDefaultInstance();
                }
            }
            
            public Builder setClientGadget(final ClientGadgetInfoOuterClass.ClientGadgetInfo value) {
                if (this.clientGadgetBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.clientGadgetBuilder_.setMessage(value);
                }
                this.contentCase_ = 15;
                return this;
            }
            
            public Builder setClientGadget(final ClientGadgetInfoOuterClass.ClientGadgetInfo.Builder builderForValue) {
                if (this.clientGadgetBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.clientGadgetBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 15;
                return this;
            }
            
            public Builder mergeClientGadget(final ClientGadgetInfoOuterClass.ClientGadgetInfo value) {
                if (this.clientGadgetBuilder_ == null) {
                    if (this.contentCase_ == 15 && this.content_ != ClientGadgetInfoOuterClass.ClientGadgetInfo.getDefaultInstance()) {
                        this.content_ = ClientGadgetInfoOuterClass.ClientGadgetInfo.newBuilder((ClientGadgetInfoOuterClass.ClientGadgetInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 15) {
                        this.clientGadgetBuilder_.mergeFrom(value);
                    }
                    this.clientGadgetBuilder_.setMessage(value);
                }
                this.contentCase_ = 15;
                return this;
            }
            
            public Builder clearClientGadget() {
                if (this.clientGadgetBuilder_ == null) {
                    if (this.contentCase_ == 15) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 15) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.clientGadgetBuilder_.clear();
                }
                return this;
            }
            
            public ClientGadgetInfoOuterClass.ClientGadgetInfo.Builder getClientGadgetBuilder() {
                return this.getClientGadgetFieldBuilder().getBuilder();
            }
            
            @Override
            public ClientGadgetInfoOuterClass.ClientGadgetInfoOrBuilder getClientGadgetOrBuilder() {
                if (this.contentCase_ == 15 && this.clientGadgetBuilder_ != null) {
                    return this.clientGadgetBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 15) {
                    return (ClientGadgetInfoOuterClass.ClientGadgetInfo)this.content_;
                }
                return ClientGadgetInfoOuterClass.ClientGadgetInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<ClientGadgetInfoOuterClass.ClientGadgetInfo, ClientGadgetInfoOuterClass.ClientGadgetInfo.Builder, ClientGadgetInfoOuterClass.ClientGadgetInfoOrBuilder> getClientGadgetFieldBuilder() {
                if (this.clientGadgetBuilder_ == null) {
                    if (this.contentCase_ != 15) {
                        this.content_ = ClientGadgetInfoOuterClass.ClientGadgetInfo.getDefaultInstance();
                    }
                    this.clientGadgetBuilder_ = new SingleFieldBuilderV3<ClientGadgetInfoOuterClass.ClientGadgetInfo, ClientGadgetInfoOuterClass.ClientGadgetInfo.Builder, ClientGadgetInfoOuterClass.ClientGadgetInfoOrBuilder>((ClientGadgetInfoOuterClass.ClientGadgetInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 15;
                this.onChanged();
                return this.clientGadgetBuilder_;
            }
            
            @Override
            public boolean hasWeather() {
                return this.contentCase_ == 17;
            }
            
            @Override
            public WeatherInfoOuterClass.WeatherInfo getWeather() {
                if (this.weatherBuilder_ == null) {
                    if (this.contentCase_ == 17) {
                        return (WeatherInfoOuterClass.WeatherInfo)this.content_;
                    }
                    return WeatherInfoOuterClass.WeatherInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 17) {
                        return this.weatherBuilder_.getMessage();
                    }
                    return WeatherInfoOuterClass.WeatherInfo.getDefaultInstance();
                }
            }
            
            public Builder setWeather(final WeatherInfoOuterClass.WeatherInfo value) {
                if (this.weatherBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.weatherBuilder_.setMessage(value);
                }
                this.contentCase_ = 17;
                return this;
            }
            
            public Builder setWeather(final WeatherInfoOuterClass.WeatherInfo.Builder builderForValue) {
                if (this.weatherBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.weatherBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 17;
                return this;
            }
            
            public Builder mergeWeather(final WeatherInfoOuterClass.WeatherInfo value) {
                if (this.weatherBuilder_ == null) {
                    if (this.contentCase_ == 17 && this.content_ != WeatherInfoOuterClass.WeatherInfo.getDefaultInstance()) {
                        this.content_ = WeatherInfoOuterClass.WeatherInfo.newBuilder((WeatherInfoOuterClass.WeatherInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 17) {
                        this.weatherBuilder_.mergeFrom(value);
                    }
                    this.weatherBuilder_.setMessage(value);
                }
                this.contentCase_ = 17;
                return this;
            }
            
            public Builder clearWeather() {
                if (this.weatherBuilder_ == null) {
                    if (this.contentCase_ == 17) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 17) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.weatherBuilder_.clear();
                }
                return this;
            }
            
            public WeatherInfoOuterClass.WeatherInfo.Builder getWeatherBuilder() {
                return this.getWeatherFieldBuilder().getBuilder();
            }
            
            @Override
            public WeatherInfoOuterClass.WeatherInfoOrBuilder getWeatherOrBuilder() {
                if (this.contentCase_ == 17 && this.weatherBuilder_ != null) {
                    return this.weatherBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 17) {
                    return (WeatherInfoOuterClass.WeatherInfo)this.content_;
                }
                return WeatherInfoOuterClass.WeatherInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<WeatherInfoOuterClass.WeatherInfo, WeatherInfoOuterClass.WeatherInfo.Builder, WeatherInfoOuterClass.WeatherInfoOrBuilder> getWeatherFieldBuilder() {
                if (this.weatherBuilder_ == null) {
                    if (this.contentCase_ != 17) {
                        this.content_ = WeatherInfoOuterClass.WeatherInfo.getDefaultInstance();
                    }
                    this.weatherBuilder_ = new SingleFieldBuilderV3<WeatherInfoOuterClass.WeatherInfo, WeatherInfoOuterClass.WeatherInfo.Builder, WeatherInfoOuterClass.WeatherInfoOrBuilder>((WeatherInfoOuterClass.WeatherInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 17;
                this.onChanged();
                return this.weatherBuilder_;
            }
            
            @Override
            public boolean hasAbilityGadget() {
                return this.contentCase_ == 18;
            }
            
            @Override
            public AbilityGadgetInfoOuterClass.AbilityGadgetInfo getAbilityGadget() {
                if (this.abilityGadgetBuilder_ == null) {
                    if (this.contentCase_ == 18) {
                        return (AbilityGadgetInfoOuterClass.AbilityGadgetInfo)this.content_;
                    }
                    return AbilityGadgetInfoOuterClass.AbilityGadgetInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 18) {
                        return this.abilityGadgetBuilder_.getMessage();
                    }
                    return AbilityGadgetInfoOuterClass.AbilityGadgetInfo.getDefaultInstance();
                }
            }
            
            public Builder setAbilityGadget(final AbilityGadgetInfoOuterClass.AbilityGadgetInfo value) {
                if (this.abilityGadgetBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.abilityGadgetBuilder_.setMessage(value);
                }
                this.contentCase_ = 18;
                return this;
            }
            
            public Builder setAbilityGadget(final AbilityGadgetInfoOuterClass.AbilityGadgetInfo.Builder builderForValue) {
                if (this.abilityGadgetBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.abilityGadgetBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 18;
                return this;
            }
            
            public Builder mergeAbilityGadget(final AbilityGadgetInfoOuterClass.AbilityGadgetInfo value) {
                if (this.abilityGadgetBuilder_ == null) {
                    if (this.contentCase_ == 18 && this.content_ != AbilityGadgetInfoOuterClass.AbilityGadgetInfo.getDefaultInstance()) {
                        this.content_ = AbilityGadgetInfoOuterClass.AbilityGadgetInfo.newBuilder((AbilityGadgetInfoOuterClass.AbilityGadgetInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 18) {
                        this.abilityGadgetBuilder_.mergeFrom(value);
                    }
                    this.abilityGadgetBuilder_.setMessage(value);
                }
                this.contentCase_ = 18;
                return this;
            }
            
            public Builder clearAbilityGadget() {
                if (this.abilityGadgetBuilder_ == null) {
                    if (this.contentCase_ == 18) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 18) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.abilityGadgetBuilder_.clear();
                }
                return this;
            }
            
            public AbilityGadgetInfoOuterClass.AbilityGadgetInfo.Builder getAbilityGadgetBuilder() {
                return this.getAbilityGadgetFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilityGadgetInfoOuterClass.AbilityGadgetInfoOrBuilder getAbilityGadgetOrBuilder() {
                if (this.contentCase_ == 18 && this.abilityGadgetBuilder_ != null) {
                    return this.abilityGadgetBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 18) {
                    return (AbilityGadgetInfoOuterClass.AbilityGadgetInfo)this.content_;
                }
                return AbilityGadgetInfoOuterClass.AbilityGadgetInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<AbilityGadgetInfoOuterClass.AbilityGadgetInfo, AbilityGadgetInfoOuterClass.AbilityGadgetInfo.Builder, AbilityGadgetInfoOuterClass.AbilityGadgetInfoOrBuilder> getAbilityGadgetFieldBuilder() {
                if (this.abilityGadgetBuilder_ == null) {
                    if (this.contentCase_ != 18) {
                        this.content_ = AbilityGadgetInfoOuterClass.AbilityGadgetInfo.getDefaultInstance();
                    }
                    this.abilityGadgetBuilder_ = new SingleFieldBuilderV3<AbilityGadgetInfoOuterClass.AbilityGadgetInfo, AbilityGadgetInfoOuterClass.AbilityGadgetInfo.Builder, AbilityGadgetInfoOuterClass.AbilityGadgetInfoOrBuilder>((AbilityGadgetInfoOuterClass.AbilityGadgetInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 18;
                this.onChanged();
                return this.abilityGadgetBuilder_;
            }
            
            @Override
            public boolean hasStatueGadget() {
                return this.contentCase_ == 19;
            }
            
            @Override
            public StatueGadgetInfoOuterClass.StatueGadgetInfo getStatueGadget() {
                if (this.statueGadgetBuilder_ == null) {
                    if (this.contentCase_ == 19) {
                        return (StatueGadgetInfoOuterClass.StatueGadgetInfo)this.content_;
                    }
                    return StatueGadgetInfoOuterClass.StatueGadgetInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 19) {
                        return this.statueGadgetBuilder_.getMessage();
                    }
                    return StatueGadgetInfoOuterClass.StatueGadgetInfo.getDefaultInstance();
                }
            }
            
            public Builder setStatueGadget(final StatueGadgetInfoOuterClass.StatueGadgetInfo value) {
                if (this.statueGadgetBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.statueGadgetBuilder_.setMessage(value);
                }
                this.contentCase_ = 19;
                return this;
            }
            
            public Builder setStatueGadget(final StatueGadgetInfoOuterClass.StatueGadgetInfo.Builder builderForValue) {
                if (this.statueGadgetBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.statueGadgetBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 19;
                return this;
            }
            
            public Builder mergeStatueGadget(final StatueGadgetInfoOuterClass.StatueGadgetInfo value) {
                if (this.statueGadgetBuilder_ == null) {
                    if (this.contentCase_ == 19 && this.content_ != StatueGadgetInfoOuterClass.StatueGadgetInfo.getDefaultInstance()) {
                        this.content_ = StatueGadgetInfoOuterClass.StatueGadgetInfo.newBuilder((StatueGadgetInfoOuterClass.StatueGadgetInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 19) {
                        this.statueGadgetBuilder_.mergeFrom(value);
                    }
                    this.statueGadgetBuilder_.setMessage(value);
                }
                this.contentCase_ = 19;
                return this;
            }
            
            public Builder clearStatueGadget() {
                if (this.statueGadgetBuilder_ == null) {
                    if (this.contentCase_ == 19) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 19) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.statueGadgetBuilder_.clear();
                }
                return this;
            }
            
            public StatueGadgetInfoOuterClass.StatueGadgetInfo.Builder getStatueGadgetBuilder() {
                return this.getStatueGadgetFieldBuilder().getBuilder();
            }
            
            @Override
            public StatueGadgetInfoOuterClass.StatueGadgetInfoOrBuilder getStatueGadgetOrBuilder() {
                if (this.contentCase_ == 19 && this.statueGadgetBuilder_ != null) {
                    return this.statueGadgetBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 19) {
                    return (StatueGadgetInfoOuterClass.StatueGadgetInfo)this.content_;
                }
                return StatueGadgetInfoOuterClass.StatueGadgetInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<StatueGadgetInfoOuterClass.StatueGadgetInfo, StatueGadgetInfoOuterClass.StatueGadgetInfo.Builder, StatueGadgetInfoOuterClass.StatueGadgetInfoOrBuilder> getStatueGadgetFieldBuilder() {
                if (this.statueGadgetBuilder_ == null) {
                    if (this.contentCase_ != 19) {
                        this.content_ = StatueGadgetInfoOuterClass.StatueGadgetInfo.getDefaultInstance();
                    }
                    this.statueGadgetBuilder_ = new SingleFieldBuilderV3<StatueGadgetInfoOuterClass.StatueGadgetInfo, StatueGadgetInfoOuterClass.StatueGadgetInfo.Builder, StatueGadgetInfoOuterClass.StatueGadgetInfoOrBuilder>((StatueGadgetInfoOuterClass.StatueGadgetInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 19;
                this.onChanged();
                return this.statueGadgetBuilder_;
            }
            
            @Override
            public boolean hasBossChest() {
                return this.contentCase_ == 20;
            }
            
            @Override
            public BossChestInfoOuterClass.BossChestInfo getBossChest() {
                if (this.bossChestBuilder_ == null) {
                    if (this.contentCase_ == 20) {
                        return (BossChestInfoOuterClass.BossChestInfo)this.content_;
                    }
                    return BossChestInfoOuterClass.BossChestInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 20) {
                        return this.bossChestBuilder_.getMessage();
                    }
                    return BossChestInfoOuterClass.BossChestInfo.getDefaultInstance();
                }
            }
            
            public Builder setBossChest(final BossChestInfoOuterClass.BossChestInfo value) {
                if (this.bossChestBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.bossChestBuilder_.setMessage(value);
                }
                this.contentCase_ = 20;
                return this;
            }
            
            public Builder setBossChest(final BossChestInfoOuterClass.BossChestInfo.Builder builderForValue) {
                if (this.bossChestBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.bossChestBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 20;
                return this;
            }
            
            public Builder mergeBossChest(final BossChestInfoOuterClass.BossChestInfo value) {
                if (this.bossChestBuilder_ == null) {
                    if (this.contentCase_ == 20 && this.content_ != BossChestInfoOuterClass.BossChestInfo.getDefaultInstance()) {
                        this.content_ = BossChestInfoOuterClass.BossChestInfo.newBuilder((BossChestInfoOuterClass.BossChestInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 20) {
                        this.bossChestBuilder_.mergeFrom(value);
                    }
                    this.bossChestBuilder_.setMessage(value);
                }
                this.contentCase_ = 20;
                return this;
            }
            
            public Builder clearBossChest() {
                if (this.bossChestBuilder_ == null) {
                    if (this.contentCase_ == 20) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 20) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.bossChestBuilder_.clear();
                }
                return this;
            }
            
            public BossChestInfoOuterClass.BossChestInfo.Builder getBossChestBuilder() {
                return this.getBossChestFieldBuilder().getBuilder();
            }
            
            @Override
            public BossChestInfoOuterClass.BossChestInfoOrBuilder getBossChestOrBuilder() {
                if (this.contentCase_ == 20 && this.bossChestBuilder_ != null) {
                    return this.bossChestBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 20) {
                    return (BossChestInfoOuterClass.BossChestInfo)this.content_;
                }
                return BossChestInfoOuterClass.BossChestInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<BossChestInfoOuterClass.BossChestInfo, BossChestInfoOuterClass.BossChestInfo.Builder, BossChestInfoOuterClass.BossChestInfoOrBuilder> getBossChestFieldBuilder() {
                if (this.bossChestBuilder_ == null) {
                    if (this.contentCase_ != 20) {
                        this.content_ = BossChestInfoOuterClass.BossChestInfo.getDefaultInstance();
                    }
                    this.bossChestBuilder_ = new SingleFieldBuilderV3<BossChestInfoOuterClass.BossChestInfo, BossChestInfoOuterClass.BossChestInfo.Builder, BossChestInfoOuterClass.BossChestInfoOrBuilder>((BossChestInfoOuterClass.BossChestInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 20;
                this.onChanged();
                return this.bossChestBuilder_;
            }
            
            @Override
            public boolean hasBlossomChest() {
                return this.contentCase_ == 41;
            }
            
            @Override
            public BlossomChestInfoOuterClass.BlossomChestInfo getBlossomChest() {
                if (this.blossomChestBuilder_ == null) {
                    if (this.contentCase_ == 41) {
                        return (BlossomChestInfoOuterClass.BlossomChestInfo)this.content_;
                    }
                    return BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 41) {
                        return this.blossomChestBuilder_.getMessage();
                    }
                    return BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance();
                }
            }
            
            public Builder setBlossomChest(final BlossomChestInfoOuterClass.BlossomChestInfo value) {
                if (this.blossomChestBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.blossomChestBuilder_.setMessage(value);
                }
                this.contentCase_ = 41;
                return this;
            }
            
            public Builder setBlossomChest(final BlossomChestInfoOuterClass.BlossomChestInfo.Builder builderForValue) {
                if (this.blossomChestBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.blossomChestBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 41;
                return this;
            }
            
            public Builder mergeBlossomChest(final BlossomChestInfoOuterClass.BlossomChestInfo value) {
                if (this.blossomChestBuilder_ == null) {
                    if (this.contentCase_ == 41 && this.content_ != BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance()) {
                        this.content_ = BlossomChestInfoOuterClass.BlossomChestInfo.newBuilder((BlossomChestInfoOuterClass.BlossomChestInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 41) {
                        this.blossomChestBuilder_.mergeFrom(value);
                    }
                    this.blossomChestBuilder_.setMessage(value);
                }
                this.contentCase_ = 41;
                return this;
            }
            
            public Builder clearBlossomChest() {
                if (this.blossomChestBuilder_ == null) {
                    if (this.contentCase_ == 41) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 41) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.blossomChestBuilder_.clear();
                }
                return this;
            }
            
            public BlossomChestInfoOuterClass.BlossomChestInfo.Builder getBlossomChestBuilder() {
                return this.getBlossomChestFieldBuilder().getBuilder();
            }
            
            @Override
            public BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder getBlossomChestOrBuilder() {
                if (this.contentCase_ == 41 && this.blossomChestBuilder_ != null) {
                    return this.blossomChestBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 41) {
                    return (BlossomChestInfoOuterClass.BlossomChestInfo)this.content_;
                }
                return BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<BlossomChestInfoOuterClass.BlossomChestInfo, BlossomChestInfoOuterClass.BlossomChestInfo.Builder, BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder> getBlossomChestFieldBuilder() {
                if (this.blossomChestBuilder_ == null) {
                    if (this.contentCase_ != 41) {
                        this.content_ = BlossomChestInfoOuterClass.BlossomChestInfo.getDefaultInstance();
                    }
                    this.blossomChestBuilder_ = new SingleFieldBuilderV3<BlossomChestInfoOuterClass.BlossomChestInfo, BlossomChestInfoOuterClass.BlossomChestInfo.Builder, BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder>((BlossomChestInfoOuterClass.BlossomChestInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 41;
                this.onChanged();
                return this.blossomChestBuilder_;
            }
            
            @Override
            public boolean hasMpPlayReward() {
                return this.contentCase_ == 42;
            }
            
            @Override
            public MpPlayRewardInfoOuterClass.MpPlayRewardInfo getMpPlayReward() {
                if (this.mpPlayRewardBuilder_ == null) {
                    if (this.contentCase_ == 42) {
                        return (MpPlayRewardInfoOuterClass.MpPlayRewardInfo)this.content_;
                    }
                    return MpPlayRewardInfoOuterClass.MpPlayRewardInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 42) {
                        return this.mpPlayRewardBuilder_.getMessage();
                    }
                    return MpPlayRewardInfoOuterClass.MpPlayRewardInfo.getDefaultInstance();
                }
            }
            
            public Builder setMpPlayReward(final MpPlayRewardInfoOuterClass.MpPlayRewardInfo value) {
                if (this.mpPlayRewardBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.mpPlayRewardBuilder_.setMessage(value);
                }
                this.contentCase_ = 42;
                return this;
            }
            
            public Builder setMpPlayReward(final MpPlayRewardInfoOuterClass.MpPlayRewardInfo.Builder builderForValue) {
                if (this.mpPlayRewardBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.mpPlayRewardBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 42;
                return this;
            }
            
            public Builder mergeMpPlayReward(final MpPlayRewardInfoOuterClass.MpPlayRewardInfo value) {
                if (this.mpPlayRewardBuilder_ == null) {
                    if (this.contentCase_ == 42 && this.content_ != MpPlayRewardInfoOuterClass.MpPlayRewardInfo.getDefaultInstance()) {
                        this.content_ = MpPlayRewardInfoOuterClass.MpPlayRewardInfo.newBuilder((MpPlayRewardInfoOuterClass.MpPlayRewardInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 42) {
                        this.mpPlayRewardBuilder_.mergeFrom(value);
                    }
                    this.mpPlayRewardBuilder_.setMessage(value);
                }
                this.contentCase_ = 42;
                return this;
            }
            
            public Builder clearMpPlayReward() {
                if (this.mpPlayRewardBuilder_ == null) {
                    if (this.contentCase_ == 42) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 42) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.mpPlayRewardBuilder_.clear();
                }
                return this;
            }
            
            public MpPlayRewardInfoOuterClass.MpPlayRewardInfo.Builder getMpPlayRewardBuilder() {
                return this.getMpPlayRewardFieldBuilder().getBuilder();
            }
            
            @Override
            public MpPlayRewardInfoOuterClass.MpPlayRewardInfoOrBuilder getMpPlayRewardOrBuilder() {
                if (this.contentCase_ == 42 && this.mpPlayRewardBuilder_ != null) {
                    return this.mpPlayRewardBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 42) {
                    return (MpPlayRewardInfoOuterClass.MpPlayRewardInfo)this.content_;
                }
                return MpPlayRewardInfoOuterClass.MpPlayRewardInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<MpPlayRewardInfoOuterClass.MpPlayRewardInfo, MpPlayRewardInfoOuterClass.MpPlayRewardInfo.Builder, MpPlayRewardInfoOuterClass.MpPlayRewardInfoOrBuilder> getMpPlayRewardFieldBuilder() {
                if (this.mpPlayRewardBuilder_ == null) {
                    if (this.contentCase_ != 42) {
                        this.content_ = MpPlayRewardInfoOuterClass.MpPlayRewardInfo.getDefaultInstance();
                    }
                    this.mpPlayRewardBuilder_ = new SingleFieldBuilderV3<MpPlayRewardInfoOuterClass.MpPlayRewardInfo, MpPlayRewardInfoOuterClass.MpPlayRewardInfo.Builder, MpPlayRewardInfoOuterClass.MpPlayRewardInfoOrBuilder>((MpPlayRewardInfoOuterClass.MpPlayRewardInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 42;
                this.onChanged();
                return this.mpPlayRewardBuilder_;
            }
            
            @Override
            public boolean hasGeneralReward() {
                return this.contentCase_ == 43;
            }
            
            @Override
            public GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo getGeneralReward() {
                if (this.generalRewardBuilder_ == null) {
                    if (this.contentCase_ == 43) {
                        return (GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo)this.content_;
                    }
                    return GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 43) {
                        return this.generalRewardBuilder_.getMessage();
                    }
                    return GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.getDefaultInstance();
                }
            }
            
            public Builder setGeneralReward(final GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo value) {
                if (this.generalRewardBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.generalRewardBuilder_.setMessage(value);
                }
                this.contentCase_ = 43;
                return this;
            }
            
            public Builder setGeneralReward(final GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder builderForValue) {
                if (this.generalRewardBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.generalRewardBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 43;
                return this;
            }
            
            public Builder mergeGeneralReward(final GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo value) {
                if (this.generalRewardBuilder_ == null) {
                    if (this.contentCase_ == 43 && this.content_ != GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.getDefaultInstance()) {
                        this.content_ = GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.newBuilder((GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 43) {
                        this.generalRewardBuilder_.mergeFrom(value);
                    }
                    this.generalRewardBuilder_.setMessage(value);
                }
                this.contentCase_ = 43;
                return this;
            }
            
            public Builder clearGeneralReward() {
                if (this.generalRewardBuilder_ == null) {
                    if (this.contentCase_ == 43) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 43) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.generalRewardBuilder_.clear();
                }
                return this;
            }
            
            public GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder getGeneralRewardBuilder() {
                return this.getGeneralRewardFieldBuilder().getBuilder();
            }
            
            @Override
            public GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder getGeneralRewardOrBuilder() {
                if (this.contentCase_ == 43 && this.generalRewardBuilder_ != null) {
                    return this.generalRewardBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 43) {
                    return (GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo)this.content_;
                }
                return GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder> getGeneralRewardFieldBuilder() {
                if (this.generalRewardBuilder_ == null) {
                    if (this.contentCase_ != 43) {
                        this.content_ = GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.getDefaultInstance();
                    }
                    this.generalRewardBuilder_ = new SingleFieldBuilderV3<GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder>((GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 43;
                this.onChanged();
                return this.generalRewardBuilder_;
            }
            
            @Override
            public boolean hasOfferingInfo() {
                return this.contentCase_ == 44;
            }
            
            @Override
            public OfferingInfoOuterClass.OfferingInfo getOfferingInfo() {
                if (this.offeringInfoBuilder_ == null) {
                    if (this.contentCase_ == 44) {
                        return (OfferingInfoOuterClass.OfferingInfo)this.content_;
                    }
                    return OfferingInfoOuterClass.OfferingInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 44) {
                        return this.offeringInfoBuilder_.getMessage();
                    }
                    return OfferingInfoOuterClass.OfferingInfo.getDefaultInstance();
                }
            }
            
            public Builder setOfferingInfo(final OfferingInfoOuterClass.OfferingInfo value) {
                if (this.offeringInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.offeringInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 44;
                return this;
            }
            
            public Builder setOfferingInfo(final OfferingInfoOuterClass.OfferingInfo.Builder builderForValue) {
                if (this.offeringInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.offeringInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 44;
                return this;
            }
            
            public Builder mergeOfferingInfo(final OfferingInfoOuterClass.OfferingInfo value) {
                if (this.offeringInfoBuilder_ == null) {
                    if (this.contentCase_ == 44 && this.content_ != OfferingInfoOuterClass.OfferingInfo.getDefaultInstance()) {
                        this.content_ = OfferingInfoOuterClass.OfferingInfo.newBuilder((OfferingInfoOuterClass.OfferingInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 44) {
                        this.offeringInfoBuilder_.mergeFrom(value);
                    }
                    this.offeringInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 44;
                return this;
            }
            
            public Builder clearOfferingInfo() {
                if (this.offeringInfoBuilder_ == null) {
                    if (this.contentCase_ == 44) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 44) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.offeringInfoBuilder_.clear();
                }
                return this;
            }
            
            public OfferingInfoOuterClass.OfferingInfo.Builder getOfferingInfoBuilder() {
                return this.getOfferingInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public OfferingInfoOuterClass.OfferingInfoOrBuilder getOfferingInfoOrBuilder() {
                if (this.contentCase_ == 44 && this.offeringInfoBuilder_ != null) {
                    return this.offeringInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 44) {
                    return (OfferingInfoOuterClass.OfferingInfo)this.content_;
                }
                return OfferingInfoOuterClass.OfferingInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<OfferingInfoOuterClass.OfferingInfo, OfferingInfoOuterClass.OfferingInfo.Builder, OfferingInfoOuterClass.OfferingInfoOrBuilder> getOfferingInfoFieldBuilder() {
                if (this.offeringInfoBuilder_ == null) {
                    if (this.contentCase_ != 44) {
                        this.content_ = OfferingInfoOuterClass.OfferingInfo.getDefaultInstance();
                    }
                    this.offeringInfoBuilder_ = new SingleFieldBuilderV3<OfferingInfoOuterClass.OfferingInfo, OfferingInfoOuterClass.OfferingInfo.Builder, OfferingInfoOuterClass.OfferingInfoOrBuilder>((OfferingInfoOuterClass.OfferingInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 44;
                this.onChanged();
                return this.offeringInfoBuilder_;
            }
            
            @Override
            public boolean hasFoundationInfo() {
                return this.contentCase_ == 45;
            }
            
            @Override
            public FoundationInfoOuterClass.FoundationInfo getFoundationInfo() {
                if (this.foundationInfoBuilder_ == null) {
                    if (this.contentCase_ == 45) {
                        return (FoundationInfoOuterClass.FoundationInfo)this.content_;
                    }
                    return FoundationInfoOuterClass.FoundationInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 45) {
                        return this.foundationInfoBuilder_.getMessage();
                    }
                    return FoundationInfoOuterClass.FoundationInfo.getDefaultInstance();
                }
            }
            
            public Builder setFoundationInfo(final FoundationInfoOuterClass.FoundationInfo value) {
                if (this.foundationInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.foundationInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 45;
                return this;
            }
            
            public Builder setFoundationInfo(final FoundationInfoOuterClass.FoundationInfo.Builder builderForValue) {
                if (this.foundationInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.foundationInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 45;
                return this;
            }
            
            public Builder mergeFoundationInfo(final FoundationInfoOuterClass.FoundationInfo value) {
                if (this.foundationInfoBuilder_ == null) {
                    if (this.contentCase_ == 45 && this.content_ != FoundationInfoOuterClass.FoundationInfo.getDefaultInstance()) {
                        this.content_ = FoundationInfoOuterClass.FoundationInfo.newBuilder((FoundationInfoOuterClass.FoundationInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 45) {
                        this.foundationInfoBuilder_.mergeFrom(value);
                    }
                    this.foundationInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 45;
                return this;
            }
            
            public Builder clearFoundationInfo() {
                if (this.foundationInfoBuilder_ == null) {
                    if (this.contentCase_ == 45) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 45) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.foundationInfoBuilder_.clear();
                }
                return this;
            }
            
            public FoundationInfoOuterClass.FoundationInfo.Builder getFoundationInfoBuilder() {
                return this.getFoundationInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public FoundationInfoOuterClass.FoundationInfoOrBuilder getFoundationInfoOrBuilder() {
                if (this.contentCase_ == 45 && this.foundationInfoBuilder_ != null) {
                    return this.foundationInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 45) {
                    return (FoundationInfoOuterClass.FoundationInfo)this.content_;
                }
                return FoundationInfoOuterClass.FoundationInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<FoundationInfoOuterClass.FoundationInfo, FoundationInfoOuterClass.FoundationInfo.Builder, FoundationInfoOuterClass.FoundationInfoOrBuilder> getFoundationInfoFieldBuilder() {
                if (this.foundationInfoBuilder_ == null) {
                    if (this.contentCase_ != 45) {
                        this.content_ = FoundationInfoOuterClass.FoundationInfo.getDefaultInstance();
                    }
                    this.foundationInfoBuilder_ = new SingleFieldBuilderV3<FoundationInfoOuterClass.FoundationInfo, FoundationInfoOuterClass.FoundationInfo.Builder, FoundationInfoOuterClass.FoundationInfoOrBuilder>((FoundationInfoOuterClass.FoundationInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 45;
                this.onChanged();
                return this.foundationInfoBuilder_;
            }
            
            @Override
            public boolean hasVehicleInfo() {
                return this.contentCase_ == 46;
            }
            
            @Override
            public VehicleInfoOuterClass.VehicleInfo getVehicleInfo() {
                if (this.vehicleInfoBuilder_ == null) {
                    if (this.contentCase_ == 46) {
                        return (VehicleInfoOuterClass.VehicleInfo)this.content_;
                    }
                    return VehicleInfoOuterClass.VehicleInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 46) {
                        return this.vehicleInfoBuilder_.getMessage();
                    }
                    return VehicleInfoOuterClass.VehicleInfo.getDefaultInstance();
                }
            }
            
            public Builder setVehicleInfo(final VehicleInfoOuterClass.VehicleInfo value) {
                if (this.vehicleInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.vehicleInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 46;
                return this;
            }
            
            public Builder setVehicleInfo(final VehicleInfoOuterClass.VehicleInfo.Builder builderForValue) {
                if (this.vehicleInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.vehicleInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 46;
                return this;
            }
            
            public Builder mergeVehicleInfo(final VehicleInfoOuterClass.VehicleInfo value) {
                if (this.vehicleInfoBuilder_ == null) {
                    if (this.contentCase_ == 46 && this.content_ != VehicleInfoOuterClass.VehicleInfo.getDefaultInstance()) {
                        this.content_ = VehicleInfoOuterClass.VehicleInfo.newBuilder((VehicleInfoOuterClass.VehicleInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 46) {
                        this.vehicleInfoBuilder_.mergeFrom(value);
                    }
                    this.vehicleInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 46;
                return this;
            }
            
            public Builder clearVehicleInfo() {
                if (this.vehicleInfoBuilder_ == null) {
                    if (this.contentCase_ == 46) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 46) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.vehicleInfoBuilder_.clear();
                }
                return this;
            }
            
            public VehicleInfoOuterClass.VehicleInfo.Builder getVehicleInfoBuilder() {
                return this.getVehicleInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public VehicleInfoOuterClass.VehicleInfoOrBuilder getVehicleInfoOrBuilder() {
                if (this.contentCase_ == 46 && this.vehicleInfoBuilder_ != null) {
                    return this.vehicleInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 46) {
                    return (VehicleInfoOuterClass.VehicleInfo)this.content_;
                }
                return VehicleInfoOuterClass.VehicleInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<VehicleInfoOuterClass.VehicleInfo, VehicleInfoOuterClass.VehicleInfo.Builder, VehicleInfoOuterClass.VehicleInfoOrBuilder> getVehicleInfoFieldBuilder() {
                if (this.vehicleInfoBuilder_ == null) {
                    if (this.contentCase_ != 46) {
                        this.content_ = VehicleInfoOuterClass.VehicleInfo.getDefaultInstance();
                    }
                    this.vehicleInfoBuilder_ = new SingleFieldBuilderV3<VehicleInfoOuterClass.VehicleInfo, VehicleInfoOuterClass.VehicleInfo.Builder, VehicleInfoOuterClass.VehicleInfoOrBuilder>((VehicleInfoOuterClass.VehicleInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 46;
                this.onChanged();
                return this.vehicleInfoBuilder_;
            }
            
            @Override
            public boolean hasShellInfo() {
                return this.contentCase_ == 47;
            }
            
            @Override
            public EchoShellInfoOuterClass.EchoShellInfo getShellInfo() {
                if (this.shellInfoBuilder_ == null) {
                    if (this.contentCase_ == 47) {
                        return (EchoShellInfoOuterClass.EchoShellInfo)this.content_;
                    }
                    return EchoShellInfoOuterClass.EchoShellInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 47) {
                        return this.shellInfoBuilder_.getMessage();
                    }
                    return EchoShellInfoOuterClass.EchoShellInfo.getDefaultInstance();
                }
            }
            
            public Builder setShellInfo(final EchoShellInfoOuterClass.EchoShellInfo value) {
                if (this.shellInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.shellInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 47;
                return this;
            }
            
            public Builder setShellInfo(final EchoShellInfoOuterClass.EchoShellInfo.Builder builderForValue) {
                if (this.shellInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.shellInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 47;
                return this;
            }
            
            public Builder mergeShellInfo(final EchoShellInfoOuterClass.EchoShellInfo value) {
                if (this.shellInfoBuilder_ == null) {
                    if (this.contentCase_ == 47 && this.content_ != EchoShellInfoOuterClass.EchoShellInfo.getDefaultInstance()) {
                        this.content_ = EchoShellInfoOuterClass.EchoShellInfo.newBuilder((EchoShellInfoOuterClass.EchoShellInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 47) {
                        this.shellInfoBuilder_.mergeFrom(value);
                    }
                    this.shellInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 47;
                return this;
            }
            
            public Builder clearShellInfo() {
                if (this.shellInfoBuilder_ == null) {
                    if (this.contentCase_ == 47) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 47) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.shellInfoBuilder_.clear();
                }
                return this;
            }
            
            public EchoShellInfoOuterClass.EchoShellInfo.Builder getShellInfoBuilder() {
                return this.getShellInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public EchoShellInfoOuterClass.EchoShellInfoOrBuilder getShellInfoOrBuilder() {
                if (this.contentCase_ == 47 && this.shellInfoBuilder_ != null) {
                    return this.shellInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 47) {
                    return (EchoShellInfoOuterClass.EchoShellInfo)this.content_;
                }
                return EchoShellInfoOuterClass.EchoShellInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<EchoShellInfoOuterClass.EchoShellInfo, EchoShellInfoOuterClass.EchoShellInfo.Builder, EchoShellInfoOuterClass.EchoShellInfoOrBuilder> getShellInfoFieldBuilder() {
                if (this.shellInfoBuilder_ == null) {
                    if (this.contentCase_ != 47) {
                        this.content_ = EchoShellInfoOuterClass.EchoShellInfo.getDefaultInstance();
                    }
                    this.shellInfoBuilder_ = new SingleFieldBuilderV3<EchoShellInfoOuterClass.EchoShellInfo, EchoShellInfoOuterClass.EchoShellInfo.Builder, EchoShellInfoOuterClass.EchoShellInfoOrBuilder>((EchoShellInfoOuterClass.EchoShellInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 47;
                this.onChanged();
                return this.shellInfoBuilder_;
            }
            
            @Override
            public boolean hasScreenInfo() {
                return this.contentCase_ == 48;
            }
            
            @Override
            public ScreenInfoOuterClass.ScreenInfo getScreenInfo() {
                if (this.screenInfoBuilder_ == null) {
                    if (this.contentCase_ == 48) {
                        return (ScreenInfoOuterClass.ScreenInfo)this.content_;
                    }
                    return ScreenInfoOuterClass.ScreenInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 48) {
                        return this.screenInfoBuilder_.getMessage();
                    }
                    return ScreenInfoOuterClass.ScreenInfo.getDefaultInstance();
                }
            }
            
            public Builder setScreenInfo(final ScreenInfoOuterClass.ScreenInfo value) {
                if (this.screenInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.screenInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 48;
                return this;
            }
            
            public Builder setScreenInfo(final ScreenInfoOuterClass.ScreenInfo.Builder builderForValue) {
                if (this.screenInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.screenInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 48;
                return this;
            }
            
            public Builder mergeScreenInfo(final ScreenInfoOuterClass.ScreenInfo value) {
                if (this.screenInfoBuilder_ == null) {
                    if (this.contentCase_ == 48 && this.content_ != ScreenInfoOuterClass.ScreenInfo.getDefaultInstance()) {
                        this.content_ = ScreenInfoOuterClass.ScreenInfo.newBuilder((ScreenInfoOuterClass.ScreenInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 48) {
                        this.screenInfoBuilder_.mergeFrom(value);
                    }
                    this.screenInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 48;
                return this;
            }
            
            public Builder clearScreenInfo() {
                if (this.screenInfoBuilder_ == null) {
                    if (this.contentCase_ == 48) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 48) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.screenInfoBuilder_.clear();
                }
                return this;
            }
            
            public ScreenInfoOuterClass.ScreenInfo.Builder getScreenInfoBuilder() {
                return this.getScreenInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public ScreenInfoOuterClass.ScreenInfoOrBuilder getScreenInfoOrBuilder() {
                if (this.contentCase_ == 48 && this.screenInfoBuilder_ != null) {
                    return this.screenInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 48) {
                    return (ScreenInfoOuterClass.ScreenInfo)this.content_;
                }
                return ScreenInfoOuterClass.ScreenInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<ScreenInfoOuterClass.ScreenInfo, ScreenInfoOuterClass.ScreenInfo.Builder, ScreenInfoOuterClass.ScreenInfoOrBuilder> getScreenInfoFieldBuilder() {
                if (this.screenInfoBuilder_ == null) {
                    if (this.contentCase_ != 48) {
                        this.content_ = ScreenInfoOuterClass.ScreenInfo.getDefaultInstance();
                    }
                    this.screenInfoBuilder_ = new SingleFieldBuilderV3<ScreenInfoOuterClass.ScreenInfo, ScreenInfoOuterClass.ScreenInfo.Builder, ScreenInfoOuterClass.ScreenInfoOrBuilder>((ScreenInfoOuterClass.ScreenInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 48;
                this.onChanged();
                return this.screenInfoBuilder_;
            }
            
            @Override
            public boolean hasFishPoolInfo() {
                return this.contentCase_ == 59;
            }
            
            @Override
            public FishPoolInfoOuterClass.FishPoolInfo getFishPoolInfo() {
                if (this.fishPoolInfoBuilder_ == null) {
                    if (this.contentCase_ == 59) {
                        return (FishPoolInfoOuterClass.FishPoolInfo)this.content_;
                    }
                    return FishPoolInfoOuterClass.FishPoolInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 59) {
                        return this.fishPoolInfoBuilder_.getMessage();
                    }
                    return FishPoolInfoOuterClass.FishPoolInfo.getDefaultInstance();
                }
            }
            
            public Builder setFishPoolInfo(final FishPoolInfoOuterClass.FishPoolInfo value) {
                if (this.fishPoolInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.fishPoolInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 59;
                return this;
            }
            
            public Builder setFishPoolInfo(final FishPoolInfoOuterClass.FishPoolInfo.Builder builderForValue) {
                if (this.fishPoolInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.fishPoolInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 59;
                return this;
            }
            
            public Builder mergeFishPoolInfo(final FishPoolInfoOuterClass.FishPoolInfo value) {
                if (this.fishPoolInfoBuilder_ == null) {
                    if (this.contentCase_ == 59 && this.content_ != FishPoolInfoOuterClass.FishPoolInfo.getDefaultInstance()) {
                        this.content_ = FishPoolInfoOuterClass.FishPoolInfo.newBuilder((FishPoolInfoOuterClass.FishPoolInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 59) {
                        this.fishPoolInfoBuilder_.mergeFrom(value);
                    }
                    this.fishPoolInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 59;
                return this;
            }
            
            public Builder clearFishPoolInfo() {
                if (this.fishPoolInfoBuilder_ == null) {
                    if (this.contentCase_ == 59) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 59) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.fishPoolInfoBuilder_.clear();
                }
                return this;
            }
            
            public FishPoolInfoOuterClass.FishPoolInfo.Builder getFishPoolInfoBuilder() {
                return this.getFishPoolInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public FishPoolInfoOuterClass.FishPoolInfoOrBuilder getFishPoolInfoOrBuilder() {
                if (this.contentCase_ == 59 && this.fishPoolInfoBuilder_ != null) {
                    return this.fishPoolInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 59) {
                    return (FishPoolInfoOuterClass.FishPoolInfo)this.content_;
                }
                return FishPoolInfoOuterClass.FishPoolInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<FishPoolInfoOuterClass.FishPoolInfo, FishPoolInfoOuterClass.FishPoolInfo.Builder, FishPoolInfoOuterClass.FishPoolInfoOrBuilder> getFishPoolInfoFieldBuilder() {
                if (this.fishPoolInfoBuilder_ == null) {
                    if (this.contentCase_ != 59) {
                        this.content_ = FishPoolInfoOuterClass.FishPoolInfo.getDefaultInstance();
                    }
                    this.fishPoolInfoBuilder_ = new SingleFieldBuilderV3<FishPoolInfoOuterClass.FishPoolInfo, FishPoolInfoOuterClass.FishPoolInfo.Builder, FishPoolInfoOuterClass.FishPoolInfoOrBuilder>((FishPoolInfoOuterClass.FishPoolInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 59;
                this.onChanged();
                return this.fishPoolInfoBuilder_;
            }
            
            @Override
            public boolean hasCustomGadgetTreeInfo() {
                return this.contentCase_ == 60;
            }
            
            @Override
            public CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCustomGadgetTreeInfo() {
                if (this.customGadgetTreeInfoBuilder_ == null) {
                    if (this.contentCase_ == 60) {
                        return (CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo)this.content_;
                    }
                    return CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 60) {
                        return this.customGadgetTreeInfoBuilder_.getMessage();
                    }
                    return CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance();
                }
            }
            
            public Builder setCustomGadgetTreeInfo(final CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
                if (this.customGadgetTreeInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.customGadgetTreeInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 60;
                return this;
            }
            
            public Builder setCustomGadgetTreeInfo(final CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder builderForValue) {
                if (this.customGadgetTreeInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.customGadgetTreeInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 60;
                return this;
            }
            
            public Builder mergeCustomGadgetTreeInfo(final CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo value) {
                if (this.customGadgetTreeInfoBuilder_ == null) {
                    if (this.contentCase_ == 60 && this.content_ != CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance()) {
                        this.content_ = CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.newBuilder((CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 60) {
                        this.customGadgetTreeInfoBuilder_.mergeFrom(value);
                    }
                    this.customGadgetTreeInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 60;
                return this;
            }
            
            public Builder clearCustomGadgetTreeInfo() {
                if (this.customGadgetTreeInfoBuilder_ == null) {
                    if (this.contentCase_ == 60) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 60) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.customGadgetTreeInfoBuilder_.clear();
                }
                return this;
            }
            
            public CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder getCustomGadgetTreeInfoBuilder() {
                return this.getCustomGadgetTreeInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCustomGadgetTreeInfoOrBuilder() {
                if (this.contentCase_ == 60 && this.customGadgetTreeInfoBuilder_ != null) {
                    return this.customGadgetTreeInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 60) {
                    return (CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo)this.content_;
                }
                return CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder> getCustomGadgetTreeInfoFieldBuilder() {
                if (this.customGadgetTreeInfoBuilder_ == null) {
                    if (this.contentCase_ != 60) {
                        this.content_ = CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.getDefaultInstance();
                    }
                    this.customGadgetTreeInfoBuilder_ = new SingleFieldBuilderV3<CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo, CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.Builder, CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder>((CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 60;
                this.onChanged();
                return this.customGadgetTreeInfoBuilder_;
            }
            
            @Override
            public boolean hasRoguelikeGadgetInfo() {
                return this.contentCase_ == 61;
            }
            
            @Override
            public RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo getRoguelikeGadgetInfo() {
                if (this.roguelikeGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ == 61) {
                        return (RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo)this.content_;
                    }
                    return RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 61) {
                        return this.roguelikeGadgetInfoBuilder_.getMessage();
                    }
                    return RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.getDefaultInstance();
                }
            }
            
            public Builder setRoguelikeGadgetInfo(final RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo value) {
                if (this.roguelikeGadgetInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.roguelikeGadgetInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 61;
                return this;
            }
            
            public Builder setRoguelikeGadgetInfo(final RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.Builder builderForValue) {
                if (this.roguelikeGadgetInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.roguelikeGadgetInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 61;
                return this;
            }
            
            public Builder mergeRoguelikeGadgetInfo(final RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo value) {
                if (this.roguelikeGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ == 61 && this.content_ != RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.getDefaultInstance()) {
                        this.content_ = RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.newBuilder((RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 61) {
                        this.roguelikeGadgetInfoBuilder_.mergeFrom(value);
                    }
                    this.roguelikeGadgetInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 61;
                return this;
            }
            
            public Builder clearRoguelikeGadgetInfo() {
                if (this.roguelikeGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ == 61) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 61) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.roguelikeGadgetInfoBuilder_.clear();
                }
                return this;
            }
            
            public RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.Builder getRoguelikeGadgetInfoBuilder() {
                return this.getRoguelikeGadgetInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfoOrBuilder getRoguelikeGadgetInfoOrBuilder() {
                if (this.contentCase_ == 61 && this.roguelikeGadgetInfoBuilder_ != null) {
                    return this.roguelikeGadgetInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 61) {
                    return (RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo)this.content_;
                }
                return RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo, RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.Builder, RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfoOrBuilder> getRoguelikeGadgetInfoFieldBuilder() {
                if (this.roguelikeGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ != 61) {
                        this.content_ = RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.getDefaultInstance();
                    }
                    this.roguelikeGadgetInfoBuilder_ = new SingleFieldBuilderV3<RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo, RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo.Builder, RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfoOrBuilder>((RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 61;
                this.onChanged();
                return this.roguelikeGadgetInfoBuilder_;
            }
            
            @Override
            public boolean hasNightCrowGadgetInfo() {
                return this.contentCase_ == 62;
            }
            
            @Override
            public NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo getNightCrowGadgetInfo() {
                if (this.nightCrowGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ == 62) {
                        return (NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo)this.content_;
                    }
                    return NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 62) {
                        return this.nightCrowGadgetInfoBuilder_.getMessage();
                    }
                    return NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.getDefaultInstance();
                }
            }
            
            public Builder setNightCrowGadgetInfo(final NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo value) {
                if (this.nightCrowGadgetInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.nightCrowGadgetInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 62;
                return this;
            }
            
            public Builder setNightCrowGadgetInfo(final NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.Builder builderForValue) {
                if (this.nightCrowGadgetInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.nightCrowGadgetInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 62;
                return this;
            }
            
            public Builder mergeNightCrowGadgetInfo(final NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo value) {
                if (this.nightCrowGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ == 62 && this.content_ != NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.getDefaultInstance()) {
                        this.content_ = NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.newBuilder((NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 62) {
                        this.nightCrowGadgetInfoBuilder_.mergeFrom(value);
                    }
                    this.nightCrowGadgetInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 62;
                return this;
            }
            
            public Builder clearNightCrowGadgetInfo() {
                if (this.nightCrowGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ == 62) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 62) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.nightCrowGadgetInfoBuilder_.clear();
                }
                return this;
            }
            
            public NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.Builder getNightCrowGadgetInfoBuilder() {
                return this.getNightCrowGadgetInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public NightCrowGadgetInfoOuterClass.NightCrowGadgetInfoOrBuilder getNightCrowGadgetInfoOrBuilder() {
                if (this.contentCase_ == 62 && this.nightCrowGadgetInfoBuilder_ != null) {
                    return this.nightCrowGadgetInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 62) {
                    return (NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo)this.content_;
                }
                return NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo, NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.Builder, NightCrowGadgetInfoOuterClass.NightCrowGadgetInfoOrBuilder> getNightCrowGadgetInfoFieldBuilder() {
                if (this.nightCrowGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ != 62) {
                        this.content_ = NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.getDefaultInstance();
                    }
                    this.nightCrowGadgetInfoBuilder_ = new SingleFieldBuilderV3<NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo, NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo.Builder, NightCrowGadgetInfoOuterClass.NightCrowGadgetInfoOrBuilder>((NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 62;
                this.onChanged();
                return this.nightCrowGadgetInfoBuilder_;
            }
            
            @Override
            public boolean hasDeshretObeliskGadgetInfo() {
                return this.contentCase_ == 63;
            }
            
            @Override
            public DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo getDeshretObeliskGadgetInfo() {
                if (this.deshretObeliskGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ == 63) {
                        return (DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo)this.content_;
                    }
                    return DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.getDefaultInstance();
                }
                else {
                    if (this.contentCase_ == 63) {
                        return this.deshretObeliskGadgetInfoBuilder_.getMessage();
                    }
                    return DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.getDefaultInstance();
                }
            }
            
            public Builder setDeshretObeliskGadgetInfo(final DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo value) {
                if (this.deshretObeliskGadgetInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.content_ = value;
                    this.onChanged();
                }
                else {
                    this.deshretObeliskGadgetInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 63;
                return this;
            }
            
            public Builder setDeshretObeliskGadgetInfo(final DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.Builder builderForValue) {
                if (this.deshretObeliskGadgetInfoBuilder_ == null) {
                    this.content_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.deshretObeliskGadgetInfoBuilder_.setMessage(builderForValue.build());
                }
                this.contentCase_ = 63;
                return this;
            }
            
            public Builder mergeDeshretObeliskGadgetInfo(final DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo value) {
                if (this.deshretObeliskGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ == 63 && this.content_ != DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.getDefaultInstance()) {
                        this.content_ = DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.newBuilder((DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo)this.content_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.content_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.contentCase_ == 63) {
                        this.deshretObeliskGadgetInfoBuilder_.mergeFrom(value);
                    }
                    this.deshretObeliskGadgetInfoBuilder_.setMessage(value);
                }
                this.contentCase_ = 63;
                return this;
            }
            
            public Builder clearDeshretObeliskGadgetInfo() {
                if (this.deshretObeliskGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ == 63) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.contentCase_ == 63) {
                        this.contentCase_ = 0;
                        this.content_ = null;
                    }
                    this.deshretObeliskGadgetInfoBuilder_.clear();
                }
                return this;
            }
            
            public DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.Builder getDeshretObeliskGadgetInfoBuilder() {
                return this.getDeshretObeliskGadgetInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfoOrBuilder getDeshretObeliskGadgetInfoOrBuilder() {
                if (this.contentCase_ == 63 && this.deshretObeliskGadgetInfoBuilder_ != null) {
                    return this.deshretObeliskGadgetInfoBuilder_.getMessageOrBuilder();
                }
                if (this.contentCase_ == 63) {
                    return (DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo)this.content_;
                }
                return DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo, DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.Builder, DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfoOrBuilder> getDeshretObeliskGadgetInfoFieldBuilder() {
                if (this.deshretObeliskGadgetInfoBuilder_ == null) {
                    if (this.contentCase_ != 63) {
                        this.content_ = DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.getDefaultInstance();
                    }
                    this.deshretObeliskGadgetInfoBuilder_ = new SingleFieldBuilderV3<DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo, DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.Builder, DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfoOrBuilder>((DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo)this.content_, this.getParentForChildren(), this.isClean());
                    this.content_ = null;
                }
                this.contentCase_ = 63;
                this.onChanged();
                return this.deshretObeliskGadgetInfoBuilder_;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SceneGadgetInfoOrBuilder extends MessageOrBuilder
    {
        int getGadgetId();
        
        int getGroupId();
        
        int getConfigId();
        
        int getOwnerEntityId();
        
        int getBornTypeValue();
        
        GadgetBornTypeOuterClass.GadgetBornType getBornType();
        
        int getGadgetState();
        
        int getGadgetType();
        
        boolean getIsShowCutscene();
        
        int getAuthorityPeerId();
        
        boolean getIsEnableInteract();
        
        int getInteractId();
        
        int getMarkFlag();
        
        int getPropOwnerEntityId();
        
        boolean hasPlatform();
        
        PlatformInfoOuterClass.PlatformInfo getPlatform();
        
        PlatformInfoOuterClass.PlatformInfoOrBuilder getPlatformOrBuilder();
        
        List<Integer> getInteractUidListList();
        
        int getInteractUidListCount();
        
        int getInteractUidList(final int p0);
        
        int getDraftId();
        
        int getGadgetTalkState();
        
        boolean hasPlayInfo();
        
        GadgetPlayInfoOuterClass.GadgetPlayInfo getPlayInfo();
        
        GadgetPlayInfoOuterClass.GadgetPlayInfoOrBuilder getPlayInfoOrBuilder();
        
        boolean hasTrifleItem();
        
        ItemOuterClass.Item getTrifleItem();
        
        ItemOuterClass.ItemOrBuilder getTrifleItemOrBuilder();
        
        boolean hasGatherGadget();
        
        GatherGadgetInfoOuterClass.GatherGadgetInfo getGatherGadget();
        
        GatherGadgetInfoOuterClass.GatherGadgetInfoOrBuilder getGatherGadgetOrBuilder();
        
        boolean hasWorktop();
        
        WorktopInfoOuterClass.WorktopInfo getWorktop();
        
        WorktopInfoOuterClass.WorktopInfoOrBuilder getWorktopOrBuilder();
        
        boolean hasClientGadget();
        
        ClientGadgetInfoOuterClass.ClientGadgetInfo getClientGadget();
        
        ClientGadgetInfoOuterClass.ClientGadgetInfoOrBuilder getClientGadgetOrBuilder();
        
        boolean hasWeather();
        
        WeatherInfoOuterClass.WeatherInfo getWeather();
        
        WeatherInfoOuterClass.WeatherInfoOrBuilder getWeatherOrBuilder();
        
        boolean hasAbilityGadget();
        
        AbilityGadgetInfoOuterClass.AbilityGadgetInfo getAbilityGadget();
        
        AbilityGadgetInfoOuterClass.AbilityGadgetInfoOrBuilder getAbilityGadgetOrBuilder();
        
        boolean hasStatueGadget();
        
        StatueGadgetInfoOuterClass.StatueGadgetInfo getStatueGadget();
        
        StatueGadgetInfoOuterClass.StatueGadgetInfoOrBuilder getStatueGadgetOrBuilder();
        
        boolean hasBossChest();
        
        BossChestInfoOuterClass.BossChestInfo getBossChest();
        
        BossChestInfoOuterClass.BossChestInfoOrBuilder getBossChestOrBuilder();
        
        boolean hasBlossomChest();
        
        BlossomChestInfoOuterClass.BlossomChestInfo getBlossomChest();
        
        BlossomChestInfoOuterClass.BlossomChestInfoOrBuilder getBlossomChestOrBuilder();
        
        boolean hasMpPlayReward();
        
        MpPlayRewardInfoOuterClass.MpPlayRewardInfo getMpPlayReward();
        
        MpPlayRewardInfoOuterClass.MpPlayRewardInfoOrBuilder getMpPlayRewardOrBuilder();
        
        boolean hasGeneralReward();
        
        GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo getGeneralReward();
        
        GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder getGeneralRewardOrBuilder();
        
        boolean hasOfferingInfo();
        
        OfferingInfoOuterClass.OfferingInfo getOfferingInfo();
        
        OfferingInfoOuterClass.OfferingInfoOrBuilder getOfferingInfoOrBuilder();
        
        boolean hasFoundationInfo();
        
        FoundationInfoOuterClass.FoundationInfo getFoundationInfo();
        
        FoundationInfoOuterClass.FoundationInfoOrBuilder getFoundationInfoOrBuilder();
        
        boolean hasVehicleInfo();
        
        VehicleInfoOuterClass.VehicleInfo getVehicleInfo();
        
        VehicleInfoOuterClass.VehicleInfoOrBuilder getVehicleInfoOrBuilder();
        
        boolean hasShellInfo();
        
        EchoShellInfoOuterClass.EchoShellInfo getShellInfo();
        
        EchoShellInfoOuterClass.EchoShellInfoOrBuilder getShellInfoOrBuilder();
        
        boolean hasScreenInfo();
        
        ScreenInfoOuterClass.ScreenInfo getScreenInfo();
        
        ScreenInfoOuterClass.ScreenInfoOrBuilder getScreenInfoOrBuilder();
        
        boolean hasFishPoolInfo();
        
        FishPoolInfoOuterClass.FishPoolInfo getFishPoolInfo();
        
        FishPoolInfoOuterClass.FishPoolInfoOrBuilder getFishPoolInfoOrBuilder();
        
        boolean hasCustomGadgetTreeInfo();
        
        CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo getCustomGadgetTreeInfo();
        
        CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfoOrBuilder getCustomGadgetTreeInfoOrBuilder();
        
        boolean hasRoguelikeGadgetInfo();
        
        RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfo getRoguelikeGadgetInfo();
        
        RoguelikeGadgetInfoOuterClass.RoguelikeGadgetInfoOrBuilder getRoguelikeGadgetInfoOrBuilder();
        
        boolean hasNightCrowGadgetInfo();
        
        NightCrowGadgetInfoOuterClass.NightCrowGadgetInfo getNightCrowGadgetInfo();
        
        NightCrowGadgetInfoOuterClass.NightCrowGadgetInfoOrBuilder getNightCrowGadgetInfoOrBuilder();
        
        boolean hasDeshretObeliskGadgetInfo();
        
        DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo getDeshretObeliskGadgetInfo();
        
        DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfoOrBuilder getDeshretObeliskGadgetInfoOrBuilder();
        
        SceneGadgetInfo.ContentCase getContentCase();
    }
}
