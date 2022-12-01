// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class DungeonSettleNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_DungeonSettleNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DungeonSettleNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_DungeonSettleNotify_StrengthenPointDataMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DungeonSettleNotify_StrengthenPointDataMapEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_DungeonSettleNotify_SettleShowEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DungeonSettleNotify_SettleShowEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DungeonSettleNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DungeonSettleNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019DungeonSettleNotify.proto\u001a(ChannelerSlabLoopDungeonResultInfo.proto\u001a\u001bCrystalLinkSettleInfo.proto\u001a!DungeonSettleExhibitionInfo.proto\u001a&EffigyChallengeDungeonResultInfo.proto\u001a\u000fParamList.proto\u001a RoguelikeDungeonSettleInfo.proto\u001a\u0019StrengthenPointData.proto\u001a#SummerTimeV2DungeonSettleInfo.proto\u001a\u0019TowerLevelEndNotify.proto\u001a'TrialAvatarFirstPassDungeonNotify.proto\u001a\u0019Unk3000_CCCOFNABDMB.proto\"\u00cd\b\n\u0013DungeonSettleNotify\u0012S\n\u0019strengthen_point_data_map\u0018\u000e \u0003(\u000b20.DungeonSettleNotify.StrengthenPointDataMapEntry\u0012\u0012\n\nis_success\u0018\u0007 \u0001(\b\u0012\u0012\n\nclose_time\u0018\u0004 \u0001(\r\u0012\u001b\n\u0013Unk2700_OMCCFBBDJMI\u0018\u0001 \u0001(\r\u00129\n\u000bsettle_show\u0018\u0005 \u0003(\u000b2$.DungeonSettleNotify.SettleShowEntry\u0012:\n\u0014exhibition_info_list\u0018\b \u0003(\u000b2\u001c.DungeonSettleExhibitionInfo\u0012\u0016\n\u000efail_cond_list\u0018\u000b \u0003(\r\u0012\u0012\n\ndungeon_id\u0018\r \u0001(\r\u0012\u000e\n\u0006result\u0018\n \u0001(\r\u00127\n\u0016tower_level_end_notify\u0018\u00df\u0002 \u0001(\u000b2\u0014.TowerLevelEndNotifyH\u0000\u0012U\n&trial_avatar_first_pass_dungeon_notify\u0018\u00fb\u0004 \u0001(\u000b2\".TrialAvatarFirstPassDungeonNotifyH\u0000\u0012X\n(channeller_slab_loop_dungeon_result_info\u0018®\u0005 \u0001(\u000b2#.ChannelerSlabLoopDungeonResultInfoH\u0000\u0012R\n$effigy_challenge_dungeon_result_info\u0018\u00c8\u0002 \u0001(\u000b2!.EffigyChallengeDungeonResultInfoH\u0000\u0012E\n\u001droguelike_dungeon_settle_info\u0018\u00ca\u000b \u0001(\u000b2\u001b.RoguelikeDungeonSettleInfoH\u0000\u0012:\n\u0018crystal_link_settle_info\u0018p \u0001(\u000b2\u0016.CrystalLinkSettleInfoH\u0000\u0012M\n\"summer_time_v2_dungeon_settle_info\u0018\u00da\u000e \u0001(\u000b2\u001e.SummerTimeV2DungeonSettleInfoH\u0000\u0012;\n\u001ainstable_spray_settle_info\u0018\u00c1\u0001 \u0001(\u000b2\u0014.Unk3000_CCCOFNABDMBH\u0000\u001aS\n\u001bStrengthenPointDataMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012#\n\u0005value\u0018\u0002 \u0001(\u000b2\u0014.StrengthenPointData:\u00028\u0001\u001a=\n\u000fSettleShowEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u0019\n\u0005value\u0018\u0002 \u0001(\u000b2\n.ParamList:\u00028\u0001B\b\n\u0006detailB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DungeonSettleNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ChannelerSlabLoopDungeonResultInfoOuterClass.getDescriptor(), CrystalLinkSettleInfoOuterClass.getDescriptor(), DungeonSettleExhibitionInfoOuterClass.getDescriptor(), EffigyChallengeDungeonResultInfoOuterClass.getDescriptor(), ParamListOuterClass.getDescriptor(), RoguelikeDungeonSettleInfoOuterClass.getDescriptor(), StrengthenPointDataOuterClass.getDescriptor(), SummerTimeV2DungeonSettleInfoOuterClass.getDescriptor(), TowerLevelEndNotifyOuterClass.getDescriptor(), TrialAvatarFirstPassDungeonNotifyOuterClass.getDescriptor(), Unk3000CCCOFNABDMB.getDescriptor() });
        internal_static_DungeonSettleNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DungeonSettleNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_descriptor, new String[] { "StrengthenPointDataMap", "IsSuccess", "CloseTime", "Unk2700OMCCFBBDJMI", "SettleShow", "ExhibitionInfoList", "FailCondList", "DungeonId", "Result", "TowerLevelEndNotify", "TrialAvatarFirstPassDungeonNotify", "ChannellerSlabLoopDungeonResultInfo", "EffigyChallengeDungeonResultInfo", "RoguelikeDungeonSettleInfo", "CrystalLinkSettleInfo", "SummerTimeV2DungeonSettleInfo", "InstableSpraySettleInfo", "Detail" });
        internal_static_DungeonSettleNotify_StrengthenPointDataMapEntry_descriptor = DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_descriptor.getNestedTypes().get(0);
        internal_static_DungeonSettleNotify_StrengthenPointDataMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_StrengthenPointDataMapEntry_descriptor, new String[] { "Key", "Value" });
        internal_static_DungeonSettleNotify_SettleShowEntry_descriptor = DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_descriptor.getNestedTypes().get(1);
        internal_static_DungeonSettleNotify_SettleShowEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_SettleShowEntry_descriptor, new String[] { "Key", "Value" });
        ChannelerSlabLoopDungeonResultInfoOuterClass.getDescriptor();
        CrystalLinkSettleInfoOuterClass.getDescriptor();
        DungeonSettleExhibitionInfoOuterClass.getDescriptor();
        EffigyChallengeDungeonResultInfoOuterClass.getDescriptor();
        ParamListOuterClass.getDescriptor();
        RoguelikeDungeonSettleInfoOuterClass.getDescriptor();
        StrengthenPointDataOuterClass.getDescriptor();
        SummerTimeV2DungeonSettleInfoOuterClass.getDescriptor();
        TowerLevelEndNotifyOuterClass.getDescriptor();
        TrialAvatarFirstPassDungeonNotifyOuterClass.getDescriptor();
        Unk3000CCCOFNABDMB.getDescriptor();
    }
    
    public static final class DungeonSettleNotify extends GeneratedMessageV3 implements DungeonSettleNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int detailCase_;
        private Object detail_;
        public static final int STRENGTHEN_POINT_DATA_MAP_FIELD_NUMBER = 14;
        private MapField<Integer, StrengthenPointDataOuterClass.StrengthenPointData> strengthenPointDataMap_;
        public static final int IS_SUCCESS_FIELD_NUMBER = 7;
        private boolean isSuccess_;
        public static final int CLOSE_TIME_FIELD_NUMBER = 4;
        private int closeTime_;
        public static final int UNK2700_OMCCFBBDJMI_FIELD_NUMBER = 1;
        private int unk2700OMCCFBBDJMI_;
        public static final int SETTLE_SHOW_FIELD_NUMBER = 5;
        private MapField<Integer, ParamListOuterClass.ParamList> settleShow_;
        public static final int EXHIBITION_INFO_LIST_FIELD_NUMBER = 8;
        private List<DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo> exhibitionInfoList_;
        public static final int FAIL_COND_LIST_FIELD_NUMBER = 11;
        private Internal.IntList failCondList_;
        private int failCondListMemoizedSerializedSize;
        public static final int DUNGEON_ID_FIELD_NUMBER = 13;
        private int dungeonId_;
        public static final int RESULT_FIELD_NUMBER = 10;
        private int result_;
        public static final int TOWER_LEVEL_END_NOTIFY_FIELD_NUMBER = 351;
        public static final int TRIAL_AVATAR_FIRST_PASS_DUNGEON_NOTIFY_FIELD_NUMBER = 635;
        public static final int CHANNELLER_SLAB_LOOP_DUNGEON_RESULT_INFO_FIELD_NUMBER = 686;
        public static final int EFFIGY_CHALLENGE_DUNGEON_RESULT_INFO_FIELD_NUMBER = 328;
        public static final int ROGUELIKE_DUNGEON_SETTLE_INFO_FIELD_NUMBER = 1482;
        public static final int CRYSTAL_LINK_SETTLE_INFO_FIELD_NUMBER = 112;
        public static final int SUMMER_TIME_V2_DUNGEON_SETTLE_INFO_FIELD_NUMBER = 1882;
        public static final int INSTABLE_SPRAY_SETTLE_INFO_FIELD_NUMBER = 193;
        private byte memoizedIsInitialized;
        private static final DungeonSettleNotify DEFAULT_INSTANCE;
        private static final Parser<DungeonSettleNotify> PARSER;
        
        private DungeonSettleNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.detailCase_ = 0;
            this.failCondListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private DungeonSettleNotify() {
            this.detailCase_ = 0;
            this.failCondListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.exhibitionInfoList_ = Collections.emptyList();
            this.failCondList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DungeonSettleNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DungeonSettleNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.unk2700OMCCFBBDJMI_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.closeTime_ = input.readUInt32();
                            continue;
                        }
                        case 42: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.settleShow_ = MapField.newMapField(SettleShowDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x2;
                            }
                            final MapEntry<Integer, ParamListOuterClass.ParamList> settleShow__ = input.readMessage(SettleShowDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.settleShow_.getMutableMap().put(settleShow__.getKey(), settleShow__.getValue());
                            continue;
                        }
                        case 56: {
                            this.isSuccess_ = input.readBool();
                            continue;
                        }
                        case 66: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.exhibitionInfoList_ = new ArrayList<DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.exhibitionInfoList_.add(input.readMessage(DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 80: {
                            this.result_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.failCondList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.failCondList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 90: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x8) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.failCondList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x8;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.failCondList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 104: {
                            this.dungeonId_ = input.readUInt32();
                            continue;
                        }
                        case 114: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.strengthenPointDataMap_ = MapField.newMapField(StrengthenPointDataMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, StrengthenPointDataOuterClass.StrengthenPointData> strengthenPointDataMap__ = input.readMessage(StrengthenPointDataMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.strengthenPointDataMap_.getMutableMap().put(strengthenPointDataMap__.getKey(), strengthenPointDataMap__.getValue());
                            continue;
                        }
                        case 898: {
                            CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.Builder subBuilder = null;
                            if (this.detailCase_ == 112) {
                                subBuilder = ((CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo)this.detail_);
                                this.detail_ = subBuilder.buildPartial();
                            }
                            this.detailCase_ = 112;
                            continue;
                        }
                        case 1546: {
                            Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.Builder subBuilder2 = null;
                            if (this.detailCase_ == 193) {
                                subBuilder2 = ((Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB)this.detail_);
                                this.detail_ = subBuilder2.buildPartial();
                            }
                            this.detailCase_ = 193;
                            continue;
                        }
                        case 2626: {
                            EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder subBuilder3 = null;
                            if (this.detailCase_ == 328) {
                                subBuilder3 = ((EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom((EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_);
                                this.detail_ = subBuilder3.buildPartial();
                            }
                            this.detailCase_ = 328;
                            continue;
                        }
                        case 2810: {
                            TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.Builder subBuilder4 = null;
                            if (this.detailCase_ == 351) {
                                subBuilder4 = ((TowerLevelEndNotifyOuterClass.TowerLevelEndNotify)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.parser(), extensionRegistry);
                            if (subBuilder4 != null) {
                                subBuilder4.mergeFrom((TowerLevelEndNotifyOuterClass.TowerLevelEndNotify)this.detail_);
                                this.detail_ = subBuilder4.buildPartial();
                            }
                            this.detailCase_ = 351;
                            continue;
                        }
                        case 5082: {
                            TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.Builder subBuilder5 = null;
                            if (this.detailCase_ == 635) {
                                subBuilder5 = ((TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.parser(), extensionRegistry);
                            if (subBuilder5 != null) {
                                subBuilder5.mergeFrom((TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify)this.detail_);
                                this.detail_ = subBuilder5.buildPartial();
                            }
                            this.detailCase_ = 635;
                            continue;
                        }
                        case 5490: {
                            ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder subBuilder6 = null;
                            if (this.detailCase_ == 686) {
                                subBuilder6 = ((ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.parser(), extensionRegistry);
                            if (subBuilder6 != null) {
                                subBuilder6.mergeFrom((ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_);
                                this.detail_ = subBuilder6.buildPartial();
                            }
                            this.detailCase_ = 686;
                            continue;
                        }
                        case 11858: {
                            RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder subBuilder7 = null;
                            if (this.detailCase_ == 1482) {
                                subBuilder7 = ((RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.parser(), extensionRegistry);
                            if (subBuilder7 != null) {
                                subBuilder7.mergeFrom((RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo)this.detail_);
                                this.detail_ = subBuilder7.buildPartial();
                            }
                            this.detailCase_ = 1482;
                            continue;
                        }
                        case 15058: {
                            SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.Builder subBuilder8 = null;
                            if (this.detailCase_ == 1882) {
                                subBuilder8 = ((SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo)this.detail_).toBuilder();
                            }
                            this.detail_ = input.readMessage(SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.parser(), extensionRegistry);
                            if (subBuilder8 != null) {
                                subBuilder8.mergeFrom((SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo)this.detail_);
                                this.detail_ = subBuilder8.buildPartial();
                            }
                            this.detailCase_ = 1882;
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
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.exhibitionInfoList_ = Collections.unmodifiableList((List<? extends DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo>)this.exhibitionInfoList_);
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.failCondList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 14: {
                    return this.internalGetStrengthenPointDataMap();
                }
                case 5: {
                    return this.internalGetSettleShow();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonSettleNotify.class, Builder.class);
        }
        
        @Override
        public DetailCase getDetailCase() {
            return DetailCase.forNumber(this.detailCase_);
        }
        
        private MapField<Integer, StrengthenPointDataOuterClass.StrengthenPointData> internalGetStrengthenPointDataMap() {
            if (this.strengthenPointDataMap_ == null) {
                return MapField.emptyMapField(StrengthenPointDataMapDefaultEntryHolder.defaultEntry);
            }
            return this.strengthenPointDataMap_;
        }
        
        @Override
        public int getStrengthenPointDataMapCount() {
            return this.internalGetStrengthenPointDataMap().getMap().size();
        }
        
        @Override
        public boolean containsStrengthenPointDataMap(final int key) {
            return this.internalGetStrengthenPointDataMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMap() {
            return this.getStrengthenPointDataMapMap();
        }
        
        @Override
        public Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMapMap() {
            return this.internalGetStrengthenPointDataMap().getMap();
        }
        
        @Override
        public StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrDefault(final int key, final StrengthenPointDataOuterClass.StrengthenPointData defaultValue) {
            final Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> map = this.internalGetStrengthenPointDataMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrThrow(final int key) {
            final Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> map = this.internalGetStrengthenPointDataMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public boolean getIsSuccess() {
            return this.isSuccess_;
        }
        
        @Override
        public int getCloseTime() {
            return this.closeTime_;
        }
        
        @Override
        public int getUnk2700OMCCFBBDJMI() {
            return this.unk2700OMCCFBBDJMI_;
        }
        
        private MapField<Integer, ParamListOuterClass.ParamList> internalGetSettleShow() {
            if (this.settleShow_ == null) {
                return MapField.emptyMapField(SettleShowDefaultEntryHolder.defaultEntry);
            }
            return this.settleShow_;
        }
        
        @Override
        public int getSettleShowCount() {
            return this.internalGetSettleShow().getMap().size();
        }
        
        @Override
        public boolean containsSettleShow(final int key) {
            return this.internalGetSettleShow().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, ParamListOuterClass.ParamList> getSettleShow() {
            return this.getSettleShowMap();
        }
        
        @Override
        public Map<Integer, ParamListOuterClass.ParamList> getSettleShowMap() {
            return this.internalGetSettleShow().getMap();
        }
        
        @Override
        public ParamListOuterClass.ParamList getSettleShowOrDefault(final int key, final ParamListOuterClass.ParamList defaultValue) {
            final Map<Integer, ParamListOuterClass.ParamList> map = this.internalGetSettleShow().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public ParamListOuterClass.ParamList getSettleShowOrThrow(final int key) {
            final Map<Integer, ParamListOuterClass.ParamList> map = this.internalGetSettleShow().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public List<DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo> getExhibitionInfoListList() {
            return this.exhibitionInfoList_;
        }
        
        @Override
        public List<? extends DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfoOrBuilder> getExhibitionInfoListOrBuilderList() {
            return this.exhibitionInfoList_;
        }
        
        @Override
        public int getExhibitionInfoListCount() {
            return this.exhibitionInfoList_.size();
        }
        
        @Override
        public DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo getExhibitionInfoList(final int index) {
            return this.exhibitionInfoList_.get(index);
        }
        
        @Override
        public DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfoOrBuilder getExhibitionInfoListOrBuilder(final int index) {
            return this.exhibitionInfoList_.get(index);
        }
        
        @Override
        public List<Integer> getFailCondListList() {
            return this.failCondList_;
        }
        
        @Override
        public int getFailCondListCount() {
            return this.failCondList_.size();
        }
        
        @Override
        public int getFailCondList(final int index) {
            return this.failCondList_.getInt(index);
        }
        
        @Override
        public int getDungeonId() {
            return this.dungeonId_;
        }
        
        @Override
        public int getResult() {
            return this.result_;
        }
        
        @Override
        public boolean hasTowerLevelEndNotify() {
            return this.detailCase_ == 351;
        }
        
        @Override
        public TowerLevelEndNotifyOuterClass.TowerLevelEndNotify getTowerLevelEndNotify() {
            if (this.detailCase_ == 351) {
                return (TowerLevelEndNotifyOuterClass.TowerLevelEndNotify)this.detail_;
            }
            return TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.getDefaultInstance();
        }
        
        @Override
        public TowerLevelEndNotifyOuterClass.TowerLevelEndNotifyOrBuilder getTowerLevelEndNotifyOrBuilder() {
            if (this.detailCase_ == 351) {
                return (TowerLevelEndNotifyOuterClass.TowerLevelEndNotify)this.detail_;
            }
            return TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.getDefaultInstance();
        }
        
        @Override
        public boolean hasTrialAvatarFirstPassDungeonNotify() {
            return this.detailCase_ == 635;
        }
        
        @Override
        public TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify getTrialAvatarFirstPassDungeonNotify() {
            if (this.detailCase_ == 635) {
                return (TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify)this.detail_;
            }
            return TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.getDefaultInstance();
        }
        
        @Override
        public TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotifyOrBuilder getTrialAvatarFirstPassDungeonNotifyOrBuilder() {
            if (this.detailCase_ == 635) {
                return (TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify)this.detail_;
            }
            return TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.getDefaultInstance();
        }
        
        @Override
        public boolean hasChannellerSlabLoopDungeonResultInfo() {
            return this.detailCase_ == 686;
        }
        
        @Override
        public ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo getChannellerSlabLoopDungeonResultInfo() {
            if (this.detailCase_ == 686) {
                return (ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_;
            }
            return ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
        }
        
        @Override
        public ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder getChannellerSlabLoopDungeonResultInfoOrBuilder() {
            if (this.detailCase_ == 686) {
                return (ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_;
            }
            return ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasEffigyChallengeDungeonResultInfo() {
            return this.detailCase_ == 328;
        }
        
        @Override
        public EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getEffigyChallengeDungeonResultInfo() {
            if (this.detailCase_ == 328) {
                return (EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_;
            }
            return EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
        }
        
        @Override
        public EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder getEffigyChallengeDungeonResultInfoOrBuilder() {
            if (this.detailCase_ == 328) {
                return (EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_;
            }
            return EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasRoguelikeDungeonSettleInfo() {
            return this.detailCase_ == 1482;
        }
        
        @Override
        public RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo getRoguelikeDungeonSettleInfo() {
            if (this.detailCase_ == 1482) {
                return (RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo)this.detail_;
            }
            return RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
        }
        
        @Override
        public RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder getRoguelikeDungeonSettleInfoOrBuilder() {
            if (this.detailCase_ == 1482) {
                return (RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo)this.detail_;
            }
            return RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasCrystalLinkSettleInfo() {
            return this.detailCase_ == 112;
        }
        
        @Override
        public CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo getCrystalLinkSettleInfo() {
            if (this.detailCase_ == 112) {
                return (CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo)this.detail_;
            }
            return CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.getDefaultInstance();
        }
        
        @Override
        public CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfoOrBuilder getCrystalLinkSettleInfoOrBuilder() {
            if (this.detailCase_ == 112) {
                return (CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo)this.detail_;
            }
            return CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasSummerTimeV2DungeonSettleInfo() {
            return this.detailCase_ == 1882;
        }
        
        @Override
        public SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo getSummerTimeV2DungeonSettleInfo() {
            if (this.detailCase_ == 1882) {
                return (SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo)this.detail_;
            }
            return SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.getDefaultInstance();
        }
        
        @Override
        public SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfoOrBuilder getSummerTimeV2DungeonSettleInfoOrBuilder() {
            if (this.detailCase_ == 1882) {
                return (SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo)this.detail_;
            }
            return SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasInstableSpraySettleInfo() {
            return this.detailCase_ == 193;
        }
        
        @Override
        public Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB getInstableSpraySettleInfo() {
            if (this.detailCase_ == 193) {
                return (Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB)this.detail_;
            }
            return Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.getDefaultInstance();
        }
        
        @Override
        public Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMBOrBuilder getInstableSpraySettleInfoOrBuilder() {
            if (this.detailCase_ == 193) {
                return (Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB)this.detail_;
            }
            return Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.getDefaultInstance();
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
            if (this.unk2700OMCCFBBDJMI_ != 0) {
                output.writeUInt32(1, this.unk2700OMCCFBBDJMI_);
            }
            if (this.closeTime_ != 0) {
                output.writeUInt32(4, this.closeTime_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetSettleShow(), SettleShowDefaultEntryHolder.defaultEntry, 5);
            if (this.isSuccess_) {
                output.writeBool(7, this.isSuccess_);
            }
            for (int i = 0; i < this.exhibitionInfoList_.size(); ++i) {
                output.writeMessage(8, this.exhibitionInfoList_.get(i));
            }
            if (this.result_ != 0) {
                output.writeUInt32(10, this.result_);
            }
            if (this.getFailCondListList().size() > 0) {
                output.writeUInt32NoTag(90);
                output.writeUInt32NoTag(this.failCondListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.failCondList_.size(); ++i) {
                output.writeUInt32NoTag(this.failCondList_.getInt(i));
            }
            if (this.dungeonId_ != 0) {
                output.writeUInt32(13, this.dungeonId_);
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetStrengthenPointDataMap(), StrengthenPointDataMapDefaultEntryHolder.defaultEntry, 14);
            if (this.detailCase_ == 112) {
                output.writeMessage(112, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 193) {
                output.writeMessage(193, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 328) {
                output.writeMessage(328, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 351) {
                output.writeMessage(351, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 635) {
                output.writeMessage(635, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 686) {
                output.writeMessage(686, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 1482) {
                output.writeMessage(1482, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 1882) {
                output.writeMessage(1882, (MessageLite)this.detail_);
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
            if (this.unk2700OMCCFBBDJMI_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.unk2700OMCCFBBDJMI_);
            }
            if (this.closeTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.closeTime_);
            }
            for (final Map.Entry<Integer, ParamListOuterClass.ParamList> entry : this.internalGetSettleShow().getMap().entrySet()) {
                final MapEntry<Integer, ParamListOuterClass.ParamList> settleShow__ = SettleShowDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(5, settleShow__);
            }
            if (this.isSuccess_) {
                size += CodedOutputStream.computeBoolSize(7, this.isSuccess_);
            }
            for (int i = 0; i < this.exhibitionInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(8, this.exhibitionInfoList_.get(i));
            }
            if (this.result_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.result_);
            }
            int dataSize = 0;
            for (int j = 0; j < this.failCondList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.failCondList_.getInt(j));
            }
            size += dataSize;
            if (!this.getFailCondListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.failCondListMemoizedSerializedSize = dataSize;
            if (this.dungeonId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.dungeonId_);
            }
            for (final Map.Entry<Integer, StrengthenPointDataOuterClass.StrengthenPointData> entry2 : this.internalGetStrengthenPointDataMap().getMap().entrySet()) {
                final MapEntry<Integer, StrengthenPointDataOuterClass.StrengthenPointData> strengthenPointDataMap__ = StrengthenPointDataMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry2.getKey()).setValue(entry2.getValue()).build();
                size += CodedOutputStream.computeMessageSize(14, strengthenPointDataMap__);
            }
            if (this.detailCase_ == 112) {
                size += CodedOutputStream.computeMessageSize(112, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 193) {
                size += CodedOutputStream.computeMessageSize(193, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 328) {
                size += CodedOutputStream.computeMessageSize(328, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 351) {
                size += CodedOutputStream.computeMessageSize(351, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 635) {
                size += CodedOutputStream.computeMessageSize(635, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 686) {
                size += CodedOutputStream.computeMessageSize(686, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 1482) {
                size += CodedOutputStream.computeMessageSize(1482, (MessageLite)this.detail_);
            }
            if (this.detailCase_ == 1882) {
                size += CodedOutputStream.computeMessageSize(1882, (MessageLite)this.detail_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DungeonSettleNotify)) {
                return super.equals(obj);
            }
            final DungeonSettleNotify other = (DungeonSettleNotify)obj;
            if (!this.internalGetStrengthenPointDataMap().equals(other.internalGetStrengthenPointDataMap())) {
                return false;
            }
            if (this.getIsSuccess() != other.getIsSuccess()) {
                return false;
            }
            if (this.getCloseTime() != other.getCloseTime()) {
                return false;
            }
            if (this.getUnk2700OMCCFBBDJMI() != other.getUnk2700OMCCFBBDJMI()) {
                return false;
            }
            if (!this.internalGetSettleShow().equals(other.internalGetSettleShow())) {
                return false;
            }
            if (!this.getExhibitionInfoListList().equals(other.getExhibitionInfoListList())) {
                return false;
            }
            if (!this.getFailCondListList().equals(other.getFailCondListList())) {
                return false;
            }
            if (this.getDungeonId() != other.getDungeonId()) {
                return false;
            }
            if (this.getResult() != other.getResult()) {
                return false;
            }
            if (!this.getDetailCase().equals(other.getDetailCase())) {
                return false;
            }
            switch (this.detailCase_) {
                case 351: {
                    if (!this.getTowerLevelEndNotify().equals(other.getTowerLevelEndNotify())) {
                        return false;
                    }
                    break;
                }
                case 635: {
                    if (!this.getTrialAvatarFirstPassDungeonNotify().equals(other.getTrialAvatarFirstPassDungeonNotify())) {
                        return false;
                    }
                    break;
                }
                case 686: {
                    if (!this.getChannellerSlabLoopDungeonResultInfo().equals(other.getChannellerSlabLoopDungeonResultInfo())) {
                        return false;
                    }
                    break;
                }
                case 328: {
                    if (!this.getEffigyChallengeDungeonResultInfo().equals(other.getEffigyChallengeDungeonResultInfo())) {
                        return false;
                    }
                    break;
                }
                case 1482: {
                    if (!this.getRoguelikeDungeonSettleInfo().equals(other.getRoguelikeDungeonSettleInfo())) {
                        return false;
                    }
                    break;
                }
                case 112: {
                    if (!this.getCrystalLinkSettleInfo().equals(other.getCrystalLinkSettleInfo())) {
                        return false;
                    }
                    break;
                }
                case 1882: {
                    if (!this.getSummerTimeV2DungeonSettleInfo().equals(other.getSummerTimeV2DungeonSettleInfo())) {
                        return false;
                    }
                    break;
                }
                case 193: {
                    if (!this.getInstableSpraySettleInfo().equals(other.getInstableSpraySettleInfo())) {
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
            if (!this.internalGetStrengthenPointDataMap().getMap().isEmpty()) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.internalGetStrengthenPointDataMap().hashCode();
            }
            hash = 37 * hash + 7;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSuccess());
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getCloseTime();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getUnk2700OMCCFBBDJMI();
            if (!this.internalGetSettleShow().getMap().isEmpty()) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.internalGetSettleShow().hashCode();
            }
            if (this.getExhibitionInfoListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getExhibitionInfoListList().hashCode();
            }
            if (this.getFailCondListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getFailCondListList().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getDungeonId();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getResult();
            switch (this.detailCase_) {
                case 351: {
                    hash = 37 * hash + 351;
                    hash = 53 * hash + this.getTowerLevelEndNotify().hashCode();
                    break;
                }
                case 635: {
                    hash = 37 * hash + 635;
                    hash = 53 * hash + this.getTrialAvatarFirstPassDungeonNotify().hashCode();
                    break;
                }
                case 686: {
                    hash = 37 * hash + 686;
                    hash = 53 * hash + this.getChannellerSlabLoopDungeonResultInfo().hashCode();
                    break;
                }
                case 328: {
                    hash = 37 * hash + 328;
                    hash = 53 * hash + this.getEffigyChallengeDungeonResultInfo().hashCode();
                    break;
                }
                case 1482: {
                    hash = 37 * hash + 1482;
                    hash = 53 * hash + this.getRoguelikeDungeonSettleInfo().hashCode();
                    break;
                }
                case 112: {
                    hash = 37 * hash + 112;
                    hash = 53 * hash + this.getCrystalLinkSettleInfo().hashCode();
                    break;
                }
                case 1882: {
                    hash = 37 * hash + 1882;
                    hash = 53 * hash + this.getSummerTimeV2DungeonSettleInfo().hashCode();
                    break;
                }
                case 193: {
                    hash = 37 * hash + 193;
                    hash = 53 * hash + this.getInstableSpraySettleInfo().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DungeonSettleNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DungeonSettleNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonSettleNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonSettleNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonSettleNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DungeonSettleNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonSettleNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonSettleNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonSettleNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DungeonSettleNotify.PARSER.parseFrom(data);
        }
        
        public static DungeonSettleNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DungeonSettleNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DungeonSettleNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonSettleNotify.PARSER, input);
        }
        
        public static DungeonSettleNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonSettleNotify.PARSER, input, extensionRegistry);
        }
        
        public static DungeonSettleNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonSettleNotify.PARSER, input);
        }
        
        public static DungeonSettleNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DungeonSettleNotify.PARSER, input, extensionRegistry);
        }
        
        public static DungeonSettleNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonSettleNotify.PARSER, input);
        }
        
        public static DungeonSettleNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DungeonSettleNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DungeonSettleNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DungeonSettleNotify prototype) {
            return DungeonSettleNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DungeonSettleNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DungeonSettleNotify getDefaultInstance() {
            return DungeonSettleNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<DungeonSettleNotify> parser() {
            return DungeonSettleNotify.PARSER;
        }
        
        @Override
        public Parser<DungeonSettleNotify> getParserForType() {
            return DungeonSettleNotify.PARSER;
        }
        
        @Override
        public DungeonSettleNotify getDefaultInstanceForType() {
            return DungeonSettleNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DungeonSettleNotify();
            PARSER = new AbstractParser<DungeonSettleNotify>() {
                @Override
                public DungeonSettleNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DungeonSettleNotify(input, extensionRegistry);
                }
            };
        }
        
        public enum DetailCase implements Internal.EnumLite, InternalOneOfEnum
        {
            TOWER_LEVEL_END_NOTIFY(351), 
            TRIAL_AVATAR_FIRST_PASS_DUNGEON_NOTIFY(635), 
            CHANNELLER_SLAB_LOOP_DUNGEON_RESULT_INFO(686), 
            EFFIGY_CHALLENGE_DUNGEON_RESULT_INFO(328), 
            ROGUELIKE_DUNGEON_SETTLE_INFO(1482), 
            CRYSTAL_LINK_SETTLE_INFO(112), 
            SUMMER_TIME_V2_DUNGEON_SETTLE_INFO(1882), 
            INSTABLE_SPRAY_SETTLE_INFO(193), 
            DETAIL_NOT_SET(0);
            
            private final int value;
            
            private DetailCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static DetailCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static DetailCase forNumber(final int value) {
                switch (value) {
                    case 351: {
                        return DetailCase.TOWER_LEVEL_END_NOTIFY;
                    }
                    case 635: {
                        return DetailCase.TRIAL_AVATAR_FIRST_PASS_DUNGEON_NOTIFY;
                    }
                    case 686: {
                        return DetailCase.CHANNELLER_SLAB_LOOP_DUNGEON_RESULT_INFO;
                    }
                    case 328: {
                        return DetailCase.EFFIGY_CHALLENGE_DUNGEON_RESULT_INFO;
                    }
                    case 1482: {
                        return DetailCase.ROGUELIKE_DUNGEON_SETTLE_INFO;
                    }
                    case 112: {
                        return DetailCase.CRYSTAL_LINK_SETTLE_INFO;
                    }
                    case 1882: {
                        return DetailCase.SUMMER_TIME_V2_DUNGEON_SETTLE_INFO;
                    }
                    case 193: {
                        return DetailCase.INSTABLE_SPRAY_SETTLE_INFO;
                    }
                    case 0: {
                        return DetailCase.DETAIL_NOT_SET;
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
            
            private static /* synthetic */ DetailCase[] value() {
                return new DetailCase[] { DetailCase.TOWER_LEVEL_END_NOTIFY, DetailCase.TRIAL_AVATAR_FIRST_PASS_DUNGEON_NOTIFY, DetailCase.CHANNELLER_SLAB_LOOP_DUNGEON_RESULT_INFO, DetailCase.EFFIGY_CHALLENGE_DUNGEON_RESULT_INFO, DetailCase.ROGUELIKE_DUNGEON_SETTLE_INFO, DetailCase.CRYSTAL_LINK_SETTLE_INFO, DetailCase.SUMMER_TIME_V2_DUNGEON_SETTLE_INFO, DetailCase.INSTABLE_SPRAY_SETTLE_INFO, DetailCase.DETAIL_NOT_SET };
            }
            
            
        }
        
        private static final class StrengthenPointDataMapDefaultEntryHolder
        {
            static final MapEntry<Integer, StrengthenPointDataOuterClass.StrengthenPointData> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_StrengthenPointDataMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, StrengthenPointDataOuterClass.StrengthenPointData.getDefaultInstance());
            }
        }
        
        private static final class SettleShowDefaultEntryHolder
        {
            static final MapEntry<Integer, ParamListOuterClass.ParamList> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_SettleShowEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, ParamListOuterClass.ParamList.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DungeonSettleNotifyOrBuilder
        {
            private int detailCase_;
            private Object detail_;
            private int bitField0_;
            private MapField<Integer, StrengthenPointDataOuterClass.StrengthenPointData> strengthenPointDataMap_;
            private boolean isSuccess_;
            private int closeTime_;
            private int unk2700OMCCFBBDJMI_;
            private MapField<Integer, ParamListOuterClass.ParamList> settleShow_;
            private List<DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo> exhibitionInfoList_;
            private RepeatedFieldBuilderV3<DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo, DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.Builder, DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfoOrBuilder> exhibitionInfoListBuilder_;
            private Internal.IntList failCondList_;
            private int dungeonId_;
            private int result_;
            private SingleFieldBuilderV3<TowerLevelEndNotifyOuterClass.TowerLevelEndNotify, TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.Builder, TowerLevelEndNotifyOuterClass.TowerLevelEndNotifyOrBuilder> towerLevelEndNotifyBuilder_;
            private SingleFieldBuilderV3<TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify, TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.Builder, TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotifyOrBuilder> trialAvatarFirstPassDungeonNotifyBuilder_;
            private SingleFieldBuilderV3<ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder> channellerSlabLoopDungeonResultInfoBuilder_;
            private SingleFieldBuilderV3<EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder> effigyChallengeDungeonResultInfoBuilder_;
            private SingleFieldBuilderV3<RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder> roguelikeDungeonSettleInfoBuilder_;
            private SingleFieldBuilderV3<CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo, CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.Builder, CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfoOrBuilder> crystalLinkSettleInfoBuilder_;
            private SingleFieldBuilderV3<SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo, SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.Builder, SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfoOrBuilder> summerTimeV2DungeonSettleInfoBuilder_;
            private SingleFieldBuilderV3<Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB, Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.Builder, Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMBOrBuilder> instableSpraySettleInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 14: {
                        return this.internalGetStrengthenPointDataMap();
                    }
                    case 5: {
                        return this.internalGetSettleShow();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 14: {
                        return this.internalGetMutableStrengthenPointDataMap();
                    }
                    case 5: {
                        return this.internalGetMutableSettleShow();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(DungeonSettleNotify.class, Builder.class);
            }
            
            private Builder() {
                this.detailCase_ = 0;
                this.exhibitionInfoList_ = Collections.emptyList();
                this.failCondList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.detailCase_ = 0;
                this.exhibitionInfoList_ = Collections.emptyList();
                this.failCondList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DungeonSettleNotify.alwaysUseFieldBuilders) {
                    this.getExhibitionInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableStrengthenPointDataMap().clear();
                this.isSuccess_ = false;
                this.closeTime_ = 0;
                this.unk2700OMCCFBBDJMI_ = 0;
                this.internalGetMutableSettleShow().clear();
                if (this.exhibitionInfoListBuilder_ == null) {
                    this.exhibitionInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.exhibitionInfoListBuilder_.clear();
                }
                this.failCondList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.dungeonId_ = 0;
                this.result_ = 0;
                this.detailCase_ = 0;
                this.detail_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DungeonSettleNotifyOuterClass.internal_static_DungeonSettleNotify_descriptor;
            }
            
            @Override
            public DungeonSettleNotify getDefaultInstanceForType() {
                return DungeonSettleNotify.getDefaultInstance();
            }
            
            @Override
            public DungeonSettleNotify build() {
                final DungeonSettleNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DungeonSettleNotify buildPartial() {
                final DungeonSettleNotify result = new DungeonSettleNotify(this);
                final int from_bitField0_ = this.bitField0_;
                (result.strengthenPointDataMap_ = this.internalGetStrengthenPointDataMap()).makeImmutable();
                result.isSuccess_ = this.isSuccess_;
                result.closeTime_ = this.closeTime_;
                result.unk2700OMCCFBBDJMI_ = this.unk2700OMCCFBBDJMI_;
                (result.settleShow_ = this.internalGetSettleShow()).makeImmutable();
                if (this.exhibitionInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.exhibitionInfoList_ = Collections.unmodifiableList((List<? extends DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo>)this.exhibitionInfoList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.exhibitionInfoList_ = this.exhibitionInfoList_;
                }
                else {
                    result.exhibitionInfoList_ = this.exhibitionInfoListBuilder_.build();
                }
                if ((this.bitField0_ & 0x8) != 0x0) {
                    this.failCondList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                result.failCondList_ = this.failCondList_;
                result.dungeonId_ = this.dungeonId_;
                result.result_ = this.result_;
                if (this.detailCase_ == 351) {
                    if (this.towerLevelEndNotifyBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.towerLevelEndNotifyBuilder_.build();
                    }
                }
                if (this.detailCase_ == 635) {
                    if (this.trialAvatarFirstPassDungeonNotifyBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.trialAvatarFirstPassDungeonNotifyBuilder_.build();
                    }
                }
                if (this.detailCase_ == 686) {
                    if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.channellerSlabLoopDungeonResultInfoBuilder_.build();
                    }
                }
                if (this.detailCase_ == 328) {
                    if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.effigyChallengeDungeonResultInfoBuilder_.build();
                    }
                }
                if (this.detailCase_ == 1482) {
                    if (this.roguelikeDungeonSettleInfoBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.roguelikeDungeonSettleInfoBuilder_.build();
                    }
                }
                if (this.detailCase_ == 112) {
                    if (this.crystalLinkSettleInfoBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.crystalLinkSettleInfoBuilder_.build();
                    }
                }
                if (this.detailCase_ == 1882) {
                    if (this.summerTimeV2DungeonSettleInfoBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.summerTimeV2DungeonSettleInfoBuilder_.build();
                    }
                }
                if (this.detailCase_ == 193) {
                    if (this.instableSpraySettleInfoBuilder_ == null) {
                        result.detail_ = this.detail_;
                    }
                    else {
                        result.detail_ = this.instableSpraySettleInfoBuilder_.build();
                    }
                }
                result.detailCase_ = this.detailCase_;
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
                if (other instanceof DungeonSettleNotify) {
                    return this.mergeFrom((DungeonSettleNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DungeonSettleNotify other) {
                if (other == DungeonSettleNotify.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableStrengthenPointDataMap().mergeFrom(other.internalGetStrengthenPointDataMap());
                if (other.getIsSuccess()) {
                    this.setIsSuccess(other.getIsSuccess());
                }
                if (other.getCloseTime() != 0) {
                    this.setCloseTime(other.getCloseTime());
                }
                if (other.getUnk2700OMCCFBBDJMI() != 0) {
                    this.setUnk2700OMCCFBBDJMI(other.getUnk2700OMCCFBBDJMI());
                }
                this.internalGetMutableSettleShow().mergeFrom(other.internalGetSettleShow());
                if (this.exhibitionInfoListBuilder_ == null) {
                    if (!other.exhibitionInfoList_.isEmpty()) {
                        if (this.exhibitionInfoList_.isEmpty()) {
                            this.exhibitionInfoList_ = other.exhibitionInfoList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureExhibitionInfoListIsMutable();
                            this.exhibitionInfoList_.addAll(other.exhibitionInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.exhibitionInfoList_.isEmpty()) {
                    if (this.exhibitionInfoListBuilder_.isEmpty()) {
                        this.exhibitionInfoListBuilder_.dispose();
                        this.exhibitionInfoListBuilder_ = null;
                        this.exhibitionInfoList_ = other.exhibitionInfoList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.exhibitionInfoListBuilder_ = (DungeonSettleNotify.alwaysUseFieldBuilders ? this.getExhibitionInfoListFieldBuilder() : null);
                    }
                    else {
                        this.exhibitionInfoListBuilder_.addAllMessages(other.exhibitionInfoList_);
                    }
                }
                if (!other.failCondList_.isEmpty()) {
                    if (this.failCondList_.isEmpty()) {
                        this.failCondList_ = other.failCondList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    else {
                        this.ensureFailCondListIsMutable();
                        this.failCondList_.addAll(other.failCondList_);
                    }
                    this.onChanged();
                }
                if (other.getDungeonId() != 0) {
                    this.setDungeonId(other.getDungeonId());
                }
                if (other.getResult() != 0) {
                    this.setResult(other.getResult());
                }
                switch (other.getDetailCase()) {
                    case TOWER_LEVEL_END_NOTIFY: {
                        this.mergeTowerLevelEndNotify(other.getTowerLevelEndNotify());
                        break;
                    }
                    case TRIAL_AVATAR_FIRST_PASS_DUNGEON_NOTIFY: {
                        this.mergeTrialAvatarFirstPassDungeonNotify(other.getTrialAvatarFirstPassDungeonNotify());
                        break;
                    }
                    case CHANNELLER_SLAB_LOOP_DUNGEON_RESULT_INFO: {
                        this.mergeChannellerSlabLoopDungeonResultInfo(other.getChannellerSlabLoopDungeonResultInfo());
                        break;
                    }
                    case EFFIGY_CHALLENGE_DUNGEON_RESULT_INFO: {
                        this.mergeEffigyChallengeDungeonResultInfo(other.getEffigyChallengeDungeonResultInfo());
                        break;
                    }
                    case ROGUELIKE_DUNGEON_SETTLE_INFO: {
                        this.mergeRoguelikeDungeonSettleInfo(other.getRoguelikeDungeonSettleInfo());
                        break;
                    }
                    case CRYSTAL_LINK_SETTLE_INFO: {
                        this.mergeCrystalLinkSettleInfo(other.getCrystalLinkSettleInfo());
                        break;
                    }
                    case SUMMER_TIME_V2_DUNGEON_SETTLE_INFO: {
                        this.mergeSummerTimeV2DungeonSettleInfo(other.getSummerTimeV2DungeonSettleInfo());
                        break;
                    }
                    case INSTABLE_SPRAY_SETTLE_INFO: {
                        this.mergeInstableSpraySettleInfo(other.getInstableSpraySettleInfo());
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
                DungeonSettleNotify parsedMessage = null;
                try {
                    parsedMessage = DungeonSettleNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DungeonSettleNotify)e.getUnfinishedMessage();
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
            public DetailCase getDetailCase() {
                return DetailCase.forNumber(this.detailCase_);
            }
            
            public Builder clearDetail() {
                this.detailCase_ = 0;
                this.detail_ = null;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, StrengthenPointDataOuterClass.StrengthenPointData> internalGetStrengthenPointDataMap() {
                if (this.strengthenPointDataMap_ == null) {
                    return MapField.emptyMapField(StrengthenPointDataMapDefaultEntryHolder.defaultEntry);
                }
                return this.strengthenPointDataMap_;
            }
            
            private MapField<Integer, StrengthenPointDataOuterClass.StrengthenPointData> internalGetMutableStrengthenPointDataMap() {
                this.onChanged();
                if (this.strengthenPointDataMap_ == null) {
                    this.strengthenPointDataMap_ = MapField.newMapField(StrengthenPointDataMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.strengthenPointDataMap_.isMutable()) {
                    this.strengthenPointDataMap_ = this.strengthenPointDataMap_.copy();
                }
                return this.strengthenPointDataMap_;
            }
            
            @Override
            public int getStrengthenPointDataMapCount() {
                return this.internalGetStrengthenPointDataMap().getMap().size();
            }
            
            @Override
            public boolean containsStrengthenPointDataMap(final int key) {
                return this.internalGetStrengthenPointDataMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMap() {
                return this.getStrengthenPointDataMapMap();
            }
            
            @Override
            public Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMapMap() {
                return this.internalGetStrengthenPointDataMap().getMap();
            }
            
            @Override
            public StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrDefault(final int key, final StrengthenPointDataOuterClass.StrengthenPointData defaultValue) {
                final Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> map = this.internalGetStrengthenPointDataMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrThrow(final int key) {
                final Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> map = this.internalGetStrengthenPointDataMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearStrengthenPointDataMap() {
                this.internalGetMutableStrengthenPointDataMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeStrengthenPointDataMap(final int key) {
                this.internalGetMutableStrengthenPointDataMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getMutableStrengthenPointDataMap() {
                return this.internalGetMutableStrengthenPointDataMap().getMutableMap();
            }
            
            public Builder putStrengthenPointDataMap(final int key, final StrengthenPointDataOuterClass.StrengthenPointData value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableStrengthenPointDataMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllStrengthenPointDataMap(final Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> values) {
                this.internalGetMutableStrengthenPointDataMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public boolean getIsSuccess() {
                return this.isSuccess_;
            }
            
            public Builder setIsSuccess(final boolean value) {
                this.isSuccess_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsSuccess() {
                this.isSuccess_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCloseTime() {
                return this.closeTime_;
            }
            
            public Builder setCloseTime(final int value) {
                this.closeTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCloseTime() {
                this.closeTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700OMCCFBBDJMI() {
                return this.unk2700OMCCFBBDJMI_;
            }
            
            public Builder setUnk2700OMCCFBBDJMI(final int value) {
                this.unk2700OMCCFBBDJMI_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700OMCCFBBDJMI() {
                this.unk2700OMCCFBBDJMI_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Integer, ParamListOuterClass.ParamList> internalGetSettleShow() {
                if (this.settleShow_ == null) {
                    return MapField.emptyMapField(SettleShowDefaultEntryHolder.defaultEntry);
                }
                return this.settleShow_;
            }
            
            private MapField<Integer, ParamListOuterClass.ParamList> internalGetMutableSettleShow() {
                this.onChanged();
                if (this.settleShow_ == null) {
                    this.settleShow_ = MapField.newMapField(SettleShowDefaultEntryHolder.defaultEntry);
                }
                if (!this.settleShow_.isMutable()) {
                    this.settleShow_ = this.settleShow_.copy();
                }
                return this.settleShow_;
            }
            
            @Override
            public int getSettleShowCount() {
                return this.internalGetSettleShow().getMap().size();
            }
            
            @Override
            public boolean containsSettleShow(final int key) {
                return this.internalGetSettleShow().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, ParamListOuterClass.ParamList> getSettleShow() {
                return this.getSettleShowMap();
            }
            
            @Override
            public Map<Integer, ParamListOuterClass.ParamList> getSettleShowMap() {
                return this.internalGetSettleShow().getMap();
            }
            
            @Override
            public ParamListOuterClass.ParamList getSettleShowOrDefault(final int key, final ParamListOuterClass.ParamList defaultValue) {
                final Map<Integer, ParamListOuterClass.ParamList> map = this.internalGetSettleShow().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public ParamListOuterClass.ParamList getSettleShowOrThrow(final int key) {
                final Map<Integer, ParamListOuterClass.ParamList> map = this.internalGetSettleShow().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearSettleShow() {
                this.internalGetMutableSettleShow().getMutableMap().clear();
                return this;
            }
            
            public Builder removeSettleShow(final int key) {
                this.internalGetMutableSettleShow().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, ParamListOuterClass.ParamList> getMutableSettleShow() {
                return this.internalGetMutableSettleShow().getMutableMap();
            }
            
            public Builder putSettleShow(final int key, final ParamListOuterClass.ParamList value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableSettleShow().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllSettleShow(final Map<Integer, ParamListOuterClass.ParamList> values) {
                this.internalGetMutableSettleShow().getMutableMap().putAll(values);
                return this;
            }
            
            private void ensureExhibitionInfoListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.exhibitionInfoList_ = new ArrayList<DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo>(this.exhibitionInfoList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo> getExhibitionInfoListList() {
                if (this.exhibitionInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo>)this.exhibitionInfoList_);
                }
                return this.exhibitionInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getExhibitionInfoListCount() {
                if (this.exhibitionInfoListBuilder_ == null) {
                    return this.exhibitionInfoList_.size();
                }
                return this.exhibitionInfoListBuilder_.getCount();
            }
            
            @Override
            public DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo getExhibitionInfoList(final int index) {
                if (this.exhibitionInfoListBuilder_ == null) {
                    return this.exhibitionInfoList_.get(index);
                }
                return this.exhibitionInfoListBuilder_.getMessage(index);
            }
            
            public Builder setExhibitionInfoList(final int index, final DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo value) {
                if (this.exhibitionInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureExhibitionInfoListIsMutable();
                    this.exhibitionInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.exhibitionInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setExhibitionInfoList(final int index, final DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.Builder builderForValue) {
                if (this.exhibitionInfoListBuilder_ == null) {
                    this.ensureExhibitionInfoListIsMutable();
                    this.exhibitionInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.exhibitionInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addExhibitionInfoList(final DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo value) {
                if (this.exhibitionInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureExhibitionInfoListIsMutable();
                    this.exhibitionInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.exhibitionInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addExhibitionInfoList(final int index, final DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo value) {
                if (this.exhibitionInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureExhibitionInfoListIsMutable();
                    this.exhibitionInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.exhibitionInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addExhibitionInfoList(final DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.Builder builderForValue) {
                if (this.exhibitionInfoListBuilder_ == null) {
                    this.ensureExhibitionInfoListIsMutable();
                    this.exhibitionInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.exhibitionInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addExhibitionInfoList(final int index, final DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.Builder builderForValue) {
                if (this.exhibitionInfoListBuilder_ == null) {
                    this.ensureExhibitionInfoListIsMutable();
                    this.exhibitionInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.exhibitionInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllExhibitionInfoList(final Iterable<? extends DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo> values) {
                if (this.exhibitionInfoListBuilder_ == null) {
                    this.ensureExhibitionInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.exhibitionInfoList_);
                    this.onChanged();
                }
                else {
                    this.exhibitionInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearExhibitionInfoList() {
                if (this.exhibitionInfoListBuilder_ == null) {
                    this.exhibitionInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.exhibitionInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeExhibitionInfoList(final int index) {
                if (this.exhibitionInfoListBuilder_ == null) {
                    this.ensureExhibitionInfoListIsMutable();
                    this.exhibitionInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.exhibitionInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.Builder getExhibitionInfoListBuilder(final int index) {
                return this.getExhibitionInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfoOrBuilder getExhibitionInfoListOrBuilder(final int index) {
                if (this.exhibitionInfoListBuilder_ == null) {
                    return this.exhibitionInfoList_.get(index);
                }
                return this.exhibitionInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfoOrBuilder> getExhibitionInfoListOrBuilderList() {
                if (this.exhibitionInfoListBuilder_ != null) {
                    return this.exhibitionInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfoOrBuilder>)this.exhibitionInfoList_);
            }
            
            public DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.Builder addExhibitionInfoListBuilder() {
                return this.getExhibitionInfoListFieldBuilder().addBuilder(DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.getDefaultInstance());
            }
            
            public DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.Builder addExhibitionInfoListBuilder(final int index) {
                return this.getExhibitionInfoListFieldBuilder().addBuilder(index, DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.getDefaultInstance());
            }
            
            public List<DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.Builder> getExhibitionInfoListBuilderList() {
                return this.getExhibitionInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo, DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.Builder, DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfoOrBuilder> getExhibitionInfoListFieldBuilder() {
                if (this.exhibitionInfoListBuilder_ == null) {
                    this.exhibitionInfoListBuilder_ = new RepeatedFieldBuilderV3<DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo, DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo.Builder, DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfoOrBuilder>(this.exhibitionInfoList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.exhibitionInfoList_ = null;
                }
                return this.exhibitionInfoListBuilder_;
            }
            
            private void ensureFailCondListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.failCondList_ = GeneratedMessageV3.mutableCopy(this.failCondList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<Integer> getFailCondListList() {
                return ((this.bitField0_ & 0x8) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.failCondList_) : this.failCondList_;
            }
            
            @Override
            public int getFailCondListCount() {
                return this.failCondList_.size();
            }
            
            @Override
            public int getFailCondList(final int index) {
                return this.failCondList_.getInt(index);
            }
            
            public Builder setFailCondList(final int index, final int value) {
                this.ensureFailCondListIsMutable();
                this.failCondList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFailCondList(final int value) {
                this.ensureFailCondListIsMutable();
                this.failCondList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFailCondList(final Iterable<? extends Integer> values) {
                this.ensureFailCondListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.failCondList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFailCondList() {
                this.failCondList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFF7;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDungeonId() {
                return this.dungeonId_;
            }
            
            public Builder setDungeonId(final int value) {
                this.dungeonId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDungeonId() {
                this.dungeonId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getResult() {
                return this.result_;
            }
            
            public Builder setResult(final int value) {
                this.result_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearResult() {
                this.result_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasTowerLevelEndNotify() {
                return this.detailCase_ == 351;
            }
            
            @Override
            public TowerLevelEndNotifyOuterClass.TowerLevelEndNotify getTowerLevelEndNotify() {
                if (this.towerLevelEndNotifyBuilder_ == null) {
                    if (this.detailCase_ == 351) {
                        return (TowerLevelEndNotifyOuterClass.TowerLevelEndNotify)this.detail_;
                    }
                    return TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 351) {
                        return this.towerLevelEndNotifyBuilder_.getMessage();
                    }
                    return TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.getDefaultInstance();
                }
            }
            
            public Builder setTowerLevelEndNotify(final TowerLevelEndNotifyOuterClass.TowerLevelEndNotify value) {
                if (this.towerLevelEndNotifyBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.towerLevelEndNotifyBuilder_.setMessage(value);
                }
                this.detailCase_ = 351;
                return this;
            }
            
            public Builder setTowerLevelEndNotify(final TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.Builder builderForValue) {
                if (this.towerLevelEndNotifyBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.towerLevelEndNotifyBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 351;
                return this;
            }
            
            public Builder mergeTowerLevelEndNotify(final TowerLevelEndNotifyOuterClass.TowerLevelEndNotify value) {
                if (this.towerLevelEndNotifyBuilder_ == null) {
                    if (this.detailCase_ == 351 && this.detail_ != TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.getDefaultInstance()) {
                        this.detail_ = TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.newBuilder((TowerLevelEndNotifyOuterClass.TowerLevelEndNotify)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 351) {
                        this.towerLevelEndNotifyBuilder_.mergeFrom(value);
                    }
                    this.towerLevelEndNotifyBuilder_.setMessage(value);
                }
                this.detailCase_ = 351;
                return this;
            }
            
            public Builder clearTowerLevelEndNotify() {
                if (this.towerLevelEndNotifyBuilder_ == null) {
                    if (this.detailCase_ == 351) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 351) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.towerLevelEndNotifyBuilder_.clear();
                }
                return this;
            }
            
            public TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.Builder getTowerLevelEndNotifyBuilder() {
                return this.getTowerLevelEndNotifyFieldBuilder().getBuilder();
            }
            
            @Override
            public TowerLevelEndNotifyOuterClass.TowerLevelEndNotifyOrBuilder getTowerLevelEndNotifyOrBuilder() {
                if (this.detailCase_ == 351 && this.towerLevelEndNotifyBuilder_ != null) {
                    return this.towerLevelEndNotifyBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 351) {
                    return (TowerLevelEndNotifyOuterClass.TowerLevelEndNotify)this.detail_;
                }
                return TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<TowerLevelEndNotifyOuterClass.TowerLevelEndNotify, TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.Builder, TowerLevelEndNotifyOuterClass.TowerLevelEndNotifyOrBuilder> getTowerLevelEndNotifyFieldBuilder() {
                if (this.towerLevelEndNotifyBuilder_ == null) {
                    if (this.detailCase_ != 351) {
                        this.detail_ = TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.getDefaultInstance();
                    }
                    this.towerLevelEndNotifyBuilder_ = new SingleFieldBuilderV3<TowerLevelEndNotifyOuterClass.TowerLevelEndNotify, TowerLevelEndNotifyOuterClass.TowerLevelEndNotify.Builder, TowerLevelEndNotifyOuterClass.TowerLevelEndNotifyOrBuilder>((TowerLevelEndNotifyOuterClass.TowerLevelEndNotify)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 351;
                this.onChanged();
                return this.towerLevelEndNotifyBuilder_;
            }
            
            @Override
            public boolean hasTrialAvatarFirstPassDungeonNotify() {
                return this.detailCase_ == 635;
            }
            
            @Override
            public TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify getTrialAvatarFirstPassDungeonNotify() {
                if (this.trialAvatarFirstPassDungeonNotifyBuilder_ == null) {
                    if (this.detailCase_ == 635) {
                        return (TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify)this.detail_;
                    }
                    return TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 635) {
                        return this.trialAvatarFirstPassDungeonNotifyBuilder_.getMessage();
                    }
                    return TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.getDefaultInstance();
                }
            }
            
            public Builder setTrialAvatarFirstPassDungeonNotify(final TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify value) {
                if (this.trialAvatarFirstPassDungeonNotifyBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.trialAvatarFirstPassDungeonNotifyBuilder_.setMessage(value);
                }
                this.detailCase_ = 635;
                return this;
            }
            
            public Builder setTrialAvatarFirstPassDungeonNotify(final TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.Builder builderForValue) {
                if (this.trialAvatarFirstPassDungeonNotifyBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.trialAvatarFirstPassDungeonNotifyBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 635;
                return this;
            }
            
            public Builder mergeTrialAvatarFirstPassDungeonNotify(final TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify value) {
                if (this.trialAvatarFirstPassDungeonNotifyBuilder_ == null) {
                    if (this.detailCase_ == 635 && this.detail_ != TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.getDefaultInstance()) {
                        this.detail_ = TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.newBuilder((TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 635) {
                        this.trialAvatarFirstPassDungeonNotifyBuilder_.mergeFrom(value);
                    }
                    this.trialAvatarFirstPassDungeonNotifyBuilder_.setMessage(value);
                }
                this.detailCase_ = 635;
                return this;
            }
            
            public Builder clearTrialAvatarFirstPassDungeonNotify() {
                if (this.trialAvatarFirstPassDungeonNotifyBuilder_ == null) {
                    if (this.detailCase_ == 635) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 635) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.trialAvatarFirstPassDungeonNotifyBuilder_.clear();
                }
                return this;
            }
            
            public TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.Builder getTrialAvatarFirstPassDungeonNotifyBuilder() {
                return this.getTrialAvatarFirstPassDungeonNotifyFieldBuilder().getBuilder();
            }
            
            @Override
            public TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotifyOrBuilder getTrialAvatarFirstPassDungeonNotifyOrBuilder() {
                if (this.detailCase_ == 635 && this.trialAvatarFirstPassDungeonNotifyBuilder_ != null) {
                    return this.trialAvatarFirstPassDungeonNotifyBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 635) {
                    return (TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify)this.detail_;
                }
                return TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify, TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.Builder, TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotifyOrBuilder> getTrialAvatarFirstPassDungeonNotifyFieldBuilder() {
                if (this.trialAvatarFirstPassDungeonNotifyBuilder_ == null) {
                    if (this.detailCase_ != 635) {
                        this.detail_ = TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.getDefaultInstance();
                    }
                    this.trialAvatarFirstPassDungeonNotifyBuilder_ = new SingleFieldBuilderV3<TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify, TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify.Builder, TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotifyOrBuilder>((TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 635;
                this.onChanged();
                return this.trialAvatarFirstPassDungeonNotifyBuilder_;
            }
            
            @Override
            public boolean hasChannellerSlabLoopDungeonResultInfo() {
                return this.detailCase_ == 686;
            }
            
            @Override
            public ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo getChannellerSlabLoopDungeonResultInfo() {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 686) {
                        return (ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_;
                    }
                    return ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 686) {
                        return this.channellerSlabLoopDungeonResultInfoBuilder_.getMessage();
                    }
                    return ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
                }
            }
            
            public Builder setChannellerSlabLoopDungeonResultInfo(final ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo value) {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.channellerSlabLoopDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 686;
                return this;
            }
            
            public Builder setChannellerSlabLoopDungeonResultInfo(final ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder builderForValue) {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.channellerSlabLoopDungeonResultInfoBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 686;
                return this;
            }
            
            public Builder mergeChannellerSlabLoopDungeonResultInfo(final ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo value) {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 686 && this.detail_ != ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance()) {
                        this.detail_ = ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.newBuilder((ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 686) {
                        this.channellerSlabLoopDungeonResultInfoBuilder_.mergeFrom(value);
                    }
                    this.channellerSlabLoopDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 686;
                return this;
            }
            
            public Builder clearChannellerSlabLoopDungeonResultInfo() {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 686) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 686) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.channellerSlabLoopDungeonResultInfoBuilder_.clear();
                }
                return this;
            }
            
            public ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder getChannellerSlabLoopDungeonResultInfoBuilder() {
                return this.getChannellerSlabLoopDungeonResultInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder getChannellerSlabLoopDungeonResultInfoOrBuilder() {
                if (this.detailCase_ == 686 && this.channellerSlabLoopDungeonResultInfoBuilder_ != null) {
                    return this.channellerSlabLoopDungeonResultInfoBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 686) {
                    return (ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_;
                }
                return ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder> getChannellerSlabLoopDungeonResultInfoFieldBuilder() {
                if (this.channellerSlabLoopDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ != 686) {
                        this.detail_ = ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.getDefaultInstance();
                    }
                    this.channellerSlabLoopDungeonResultInfoBuilder_ = new SingleFieldBuilderV3<ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo.Builder, ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder>((ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 686;
                this.onChanged();
                return this.channellerSlabLoopDungeonResultInfoBuilder_;
            }
            
            @Override
            public boolean hasEffigyChallengeDungeonResultInfo() {
                return this.detailCase_ == 328;
            }
            
            @Override
            public EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getEffigyChallengeDungeonResultInfo() {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 328) {
                        return (EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_;
                    }
                    return EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 328) {
                        return this.effigyChallengeDungeonResultInfoBuilder_.getMessage();
                    }
                    return EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
                }
            }
            
            public Builder setEffigyChallengeDungeonResultInfo(final EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo value) {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.effigyChallengeDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 328;
                return this;
            }
            
            public Builder setEffigyChallengeDungeonResultInfo(final EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder builderForValue) {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.effigyChallengeDungeonResultInfoBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 328;
                return this;
            }
            
            public Builder mergeEffigyChallengeDungeonResultInfo(final EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo value) {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 328 && this.detail_ != EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance()) {
                        this.detail_ = EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.newBuilder((EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 328) {
                        this.effigyChallengeDungeonResultInfoBuilder_.mergeFrom(value);
                    }
                    this.effigyChallengeDungeonResultInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 328;
                return this;
            }
            
            public Builder clearEffigyChallengeDungeonResultInfo() {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ == 328) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 328) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.effigyChallengeDungeonResultInfoBuilder_.clear();
                }
                return this;
            }
            
            public EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder getEffigyChallengeDungeonResultInfoBuilder() {
                return this.getEffigyChallengeDungeonResultInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder getEffigyChallengeDungeonResultInfoOrBuilder() {
                if (this.detailCase_ == 328 && this.effigyChallengeDungeonResultInfoBuilder_ != null) {
                    return this.effigyChallengeDungeonResultInfoBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 328) {
                    return (EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_;
                }
                return EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder> getEffigyChallengeDungeonResultInfoFieldBuilder() {
                if (this.effigyChallengeDungeonResultInfoBuilder_ == null) {
                    if (this.detailCase_ != 328) {
                        this.detail_ = EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.getDefaultInstance();
                    }
                    this.effigyChallengeDungeonResultInfoBuilder_ = new SingleFieldBuilderV3<EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo.Builder, EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder>((EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 328;
                this.onChanged();
                return this.effigyChallengeDungeonResultInfoBuilder_;
            }
            
            @Override
            public boolean hasRoguelikeDungeonSettleInfo() {
                return this.detailCase_ == 1482;
            }
            
            @Override
            public RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo getRoguelikeDungeonSettleInfo() {
                if (this.roguelikeDungeonSettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 1482) {
                        return (RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo)this.detail_;
                    }
                    return RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 1482) {
                        return this.roguelikeDungeonSettleInfoBuilder_.getMessage();
                    }
                    return RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
                }
            }
            
            public Builder setRoguelikeDungeonSettleInfo(final RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo value) {
                if (this.roguelikeDungeonSettleInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.roguelikeDungeonSettleInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1482;
                return this;
            }
            
            public Builder setRoguelikeDungeonSettleInfo(final RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder builderForValue) {
                if (this.roguelikeDungeonSettleInfoBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.roguelikeDungeonSettleInfoBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 1482;
                return this;
            }
            
            public Builder mergeRoguelikeDungeonSettleInfo(final RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo value) {
                if (this.roguelikeDungeonSettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 1482 && this.detail_ != RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance()) {
                        this.detail_ = RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.newBuilder((RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 1482) {
                        this.roguelikeDungeonSettleInfoBuilder_.mergeFrom(value);
                    }
                    this.roguelikeDungeonSettleInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1482;
                return this;
            }
            
            public Builder clearRoguelikeDungeonSettleInfo() {
                if (this.roguelikeDungeonSettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 1482) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 1482) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.roguelikeDungeonSettleInfoBuilder_.clear();
                }
                return this;
            }
            
            public RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder getRoguelikeDungeonSettleInfoBuilder() {
                return this.getRoguelikeDungeonSettleInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder getRoguelikeDungeonSettleInfoOrBuilder() {
                if (this.detailCase_ == 1482 && this.roguelikeDungeonSettleInfoBuilder_ != null) {
                    return this.roguelikeDungeonSettleInfoBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 1482) {
                    return (RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo)this.detail_;
                }
                return RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder> getRoguelikeDungeonSettleInfoFieldBuilder() {
                if (this.roguelikeDungeonSettleInfoBuilder_ == null) {
                    if (this.detailCase_ != 1482) {
                        this.detail_ = RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.getDefaultInstance();
                    }
                    this.roguelikeDungeonSettleInfoBuilder_ = new SingleFieldBuilderV3<RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo.Builder, RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder>((RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 1482;
                this.onChanged();
                return this.roguelikeDungeonSettleInfoBuilder_;
            }
            
            @Override
            public boolean hasCrystalLinkSettleInfo() {
                return this.detailCase_ == 112;
            }
            
            @Override
            public CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo getCrystalLinkSettleInfo() {
                if (this.crystalLinkSettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 112) {
                        return (CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo)this.detail_;
                    }
                    return CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 112) {
                        return this.crystalLinkSettleInfoBuilder_.getMessage();
                    }
                    return CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.getDefaultInstance();
                }
            }
            
            public Builder setCrystalLinkSettleInfo(final CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo value) {
                if (this.crystalLinkSettleInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.crystalLinkSettleInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 112;
                return this;
            }
            
            public Builder setCrystalLinkSettleInfo(final CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.Builder builderForValue) {
                if (this.crystalLinkSettleInfoBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.crystalLinkSettleInfoBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 112;
                return this;
            }
            
            public Builder mergeCrystalLinkSettleInfo(final CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo value) {
                if (this.crystalLinkSettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 112 && this.detail_ != CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.getDefaultInstance()) {
                        this.detail_ = CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.newBuilder((CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 112) {
                        this.crystalLinkSettleInfoBuilder_.mergeFrom(value);
                    }
                    this.crystalLinkSettleInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 112;
                return this;
            }
            
            public Builder clearCrystalLinkSettleInfo() {
                if (this.crystalLinkSettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 112) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 112) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.crystalLinkSettleInfoBuilder_.clear();
                }
                return this;
            }
            
            public CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.Builder getCrystalLinkSettleInfoBuilder() {
                return this.getCrystalLinkSettleInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfoOrBuilder getCrystalLinkSettleInfoOrBuilder() {
                if (this.detailCase_ == 112 && this.crystalLinkSettleInfoBuilder_ != null) {
                    return this.crystalLinkSettleInfoBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 112) {
                    return (CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo)this.detail_;
                }
                return CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo, CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.Builder, CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfoOrBuilder> getCrystalLinkSettleInfoFieldBuilder() {
                if (this.crystalLinkSettleInfoBuilder_ == null) {
                    if (this.detailCase_ != 112) {
                        this.detail_ = CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.getDefaultInstance();
                    }
                    this.crystalLinkSettleInfoBuilder_ = new SingleFieldBuilderV3<CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo, CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo.Builder, CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfoOrBuilder>((CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 112;
                this.onChanged();
                return this.crystalLinkSettleInfoBuilder_;
            }
            
            @Override
            public boolean hasSummerTimeV2DungeonSettleInfo() {
                return this.detailCase_ == 1882;
            }
            
            @Override
            public SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo getSummerTimeV2DungeonSettleInfo() {
                if (this.summerTimeV2DungeonSettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 1882) {
                        return (SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo)this.detail_;
                    }
                    return SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 1882) {
                        return this.summerTimeV2DungeonSettleInfoBuilder_.getMessage();
                    }
                    return SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.getDefaultInstance();
                }
            }
            
            public Builder setSummerTimeV2DungeonSettleInfo(final SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo value) {
                if (this.summerTimeV2DungeonSettleInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.summerTimeV2DungeonSettleInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1882;
                return this;
            }
            
            public Builder setSummerTimeV2DungeonSettleInfo(final SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.Builder builderForValue) {
                if (this.summerTimeV2DungeonSettleInfoBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.summerTimeV2DungeonSettleInfoBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 1882;
                return this;
            }
            
            public Builder mergeSummerTimeV2DungeonSettleInfo(final SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo value) {
                if (this.summerTimeV2DungeonSettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 1882 && this.detail_ != SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.getDefaultInstance()) {
                        this.detail_ = SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.newBuilder((SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 1882) {
                        this.summerTimeV2DungeonSettleInfoBuilder_.mergeFrom(value);
                    }
                    this.summerTimeV2DungeonSettleInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 1882;
                return this;
            }
            
            public Builder clearSummerTimeV2DungeonSettleInfo() {
                if (this.summerTimeV2DungeonSettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 1882) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 1882) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.summerTimeV2DungeonSettleInfoBuilder_.clear();
                }
                return this;
            }
            
            public SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.Builder getSummerTimeV2DungeonSettleInfoBuilder() {
                return this.getSummerTimeV2DungeonSettleInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfoOrBuilder getSummerTimeV2DungeonSettleInfoOrBuilder() {
                if (this.detailCase_ == 1882 && this.summerTimeV2DungeonSettleInfoBuilder_ != null) {
                    return this.summerTimeV2DungeonSettleInfoBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 1882) {
                    return (SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo)this.detail_;
                }
                return SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo, SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.Builder, SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfoOrBuilder> getSummerTimeV2DungeonSettleInfoFieldBuilder() {
                if (this.summerTimeV2DungeonSettleInfoBuilder_ == null) {
                    if (this.detailCase_ != 1882) {
                        this.detail_ = SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.getDefaultInstance();
                    }
                    this.summerTimeV2DungeonSettleInfoBuilder_ = new SingleFieldBuilderV3<SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo, SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.Builder, SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfoOrBuilder>((SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 1882;
                this.onChanged();
                return this.summerTimeV2DungeonSettleInfoBuilder_;
            }
            
            @Override
            public boolean hasInstableSpraySettleInfo() {
                return this.detailCase_ == 193;
            }
            
            @Override
            public Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB getInstableSpraySettleInfo() {
                if (this.instableSpraySettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 193) {
                        return (Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB)this.detail_;
                    }
                    return Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.getDefaultInstance();
                }
                else {
                    if (this.detailCase_ == 193) {
                        return this.instableSpraySettleInfoBuilder_.getMessage();
                    }
                    return Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.getDefaultInstance();
                }
            }
            
            public Builder setInstableSpraySettleInfo(final Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB value) {
                if (this.instableSpraySettleInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.detail_ = value;
                    this.onChanged();
                }
                else {
                    this.instableSpraySettleInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 193;
                return this;
            }
            
            public Builder setInstableSpraySettleInfo(final Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.Builder builderForValue) {
                if (this.instableSpraySettleInfoBuilder_ == null) {
                    this.detail_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.instableSpraySettleInfoBuilder_.setMessage(builderForValue.build());
                }
                this.detailCase_ = 193;
                return this;
            }
            
            public Builder mergeInstableSpraySettleInfo(final Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB value) {
                if (this.instableSpraySettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 193 && this.detail_ != Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.getDefaultInstance()) {
                        this.detail_ = Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.newBuilder((Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB)this.detail_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.detail_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.detailCase_ == 193) {
                        this.instableSpraySettleInfoBuilder_.mergeFrom(value);
                    }
                    this.instableSpraySettleInfoBuilder_.setMessage(value);
                }
                this.detailCase_ = 193;
                return this;
            }
            
            public Builder clearInstableSpraySettleInfo() {
                if (this.instableSpraySettleInfoBuilder_ == null) {
                    if (this.detailCase_ == 193) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.detailCase_ == 193) {
                        this.detailCase_ = 0;
                        this.detail_ = null;
                    }
                    this.instableSpraySettleInfoBuilder_.clear();
                }
                return this;
            }
            
            public Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.Builder getInstableSpraySettleInfoBuilder() {
                return this.getInstableSpraySettleInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMBOrBuilder getInstableSpraySettleInfoOrBuilder() {
                if (this.detailCase_ == 193 && this.instableSpraySettleInfoBuilder_ != null) {
                    return this.instableSpraySettleInfoBuilder_.getMessageOrBuilder();
                }
                if (this.detailCase_ == 193) {
                    return (Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB)this.detail_;
                }
                return Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB, Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.Builder, Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMBOrBuilder> getInstableSpraySettleInfoFieldBuilder() {
                if (this.instableSpraySettleInfoBuilder_ == null) {
                    if (this.detailCase_ != 193) {
                        this.detail_ = Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.getDefaultInstance();
                    }
                    this.instableSpraySettleInfoBuilder_ = new SingleFieldBuilderV3<Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB, Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB.Builder, Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMBOrBuilder>((Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB)this.detail_, this.getParentForChildren(), this.isClean());
                    this.detail_ = null;
                }
                this.detailCase_ = 193;
                this.onChanged();
                return this.instableSpraySettleInfoBuilder_;
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
    
    public interface DungeonSettleNotifyOrBuilder extends MessageOrBuilder
    {
        int getStrengthenPointDataMapCount();
        
        boolean containsStrengthenPointDataMap(final int p0);
        
        @Deprecated
        Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMap();
        
        Map<Integer, StrengthenPointDataOuterClass.StrengthenPointData> getStrengthenPointDataMapMap();
        
        StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrDefault(final int p0, final StrengthenPointDataOuterClass.StrengthenPointData p1);
        
        StrengthenPointDataOuterClass.StrengthenPointData getStrengthenPointDataMapOrThrow(final int p0);
        
        boolean getIsSuccess();
        
        int getCloseTime();
        
        int getUnk2700OMCCFBBDJMI();
        
        int getSettleShowCount();
        
        boolean containsSettleShow(final int p0);
        
        @Deprecated
        Map<Integer, ParamListOuterClass.ParamList> getSettleShow();
        
        Map<Integer, ParamListOuterClass.ParamList> getSettleShowMap();
        
        ParamListOuterClass.ParamList getSettleShowOrDefault(final int p0, final ParamListOuterClass.ParamList p1);
        
        ParamListOuterClass.ParamList getSettleShowOrThrow(final int p0);
        
        List<DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo> getExhibitionInfoListList();
        
        DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfo getExhibitionInfoList(final int p0);
        
        int getExhibitionInfoListCount();
        
        List<? extends DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfoOrBuilder> getExhibitionInfoListOrBuilderList();
        
        DungeonSettleExhibitionInfoOuterClass.DungeonSettleExhibitionInfoOrBuilder getExhibitionInfoListOrBuilder(final int p0);
        
        List<Integer> getFailCondListList();
        
        int getFailCondListCount();
        
        int getFailCondList(final int p0);
        
        int getDungeonId();
        
        int getResult();
        
        boolean hasTowerLevelEndNotify();
        
        TowerLevelEndNotifyOuterClass.TowerLevelEndNotify getTowerLevelEndNotify();
        
        TowerLevelEndNotifyOuterClass.TowerLevelEndNotifyOrBuilder getTowerLevelEndNotifyOrBuilder();
        
        boolean hasTrialAvatarFirstPassDungeonNotify();
        
        TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotify getTrialAvatarFirstPassDungeonNotify();
        
        TrialAvatarFirstPassDungeonNotifyOuterClass.TrialAvatarFirstPassDungeonNotifyOrBuilder getTrialAvatarFirstPassDungeonNotifyOrBuilder();
        
        boolean hasChannellerSlabLoopDungeonResultInfo();
        
        ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfo getChannellerSlabLoopDungeonResultInfo();
        
        ChannelerSlabLoopDungeonResultInfoOuterClass.ChannelerSlabLoopDungeonResultInfoOrBuilder getChannellerSlabLoopDungeonResultInfoOrBuilder();
        
        boolean hasEffigyChallengeDungeonResultInfo();
        
        EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfo getEffigyChallengeDungeonResultInfo();
        
        EffigyChallengeDungeonResultInfoOuterClass.EffigyChallengeDungeonResultInfoOrBuilder getEffigyChallengeDungeonResultInfoOrBuilder();
        
        boolean hasRoguelikeDungeonSettleInfo();
        
        RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfo getRoguelikeDungeonSettleInfo();
        
        RoguelikeDungeonSettleInfoOuterClass.RoguelikeDungeonSettleInfoOrBuilder getRoguelikeDungeonSettleInfoOrBuilder();
        
        boolean hasCrystalLinkSettleInfo();
        
        CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfo getCrystalLinkSettleInfo();
        
        CrystalLinkSettleInfoOuterClass.CrystalLinkSettleInfoOrBuilder getCrystalLinkSettleInfoOrBuilder();
        
        boolean hasSummerTimeV2DungeonSettleInfo();
        
        SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo getSummerTimeV2DungeonSettleInfo();
        
        SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfoOrBuilder getSummerTimeV2DungeonSettleInfoOrBuilder();
        
        boolean hasInstableSpraySettleInfo();
        
        Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMB getInstableSpraySettleInfo();
        
        Unk3000CCCOFNABDMB.Unk3000_CCCOFNABDMBOrBuilder getInstableSpraySettleInfoOrBuilder();
        
        DungeonSettleNotify.DetailCase getDetailCase();
    }
}
