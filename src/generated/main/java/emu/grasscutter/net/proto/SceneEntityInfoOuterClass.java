// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Internal;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.LazyStringArrayList;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.LazyStringList;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SceneEntityInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneEntityInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneEntityInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneEntityInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneEntityInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015SceneEntityInfo.proto\u001a$AnimatorParameterValueInfoPair.proto\u001a\u0019EntityAuthorityInfo.proto\u001a\u0016EntityClientData.proto\u001a\u001bEntityEnvironmentInfo.proto\u001a\u0013FightPropPair.proto\u001a\u0010MotionInfo.proto\u001a\u000ePropPair.proto\u001a\u0014ProtEntityType.proto\u001a\u0015SceneAvatarInfo.proto\u001a\u0015SceneGadgetInfo.proto\u001a\u0016SceneMonsterInfo.proto\u001a\u0012SceneNpcInfo.proto\u001a\u0010ServerBuff.proto\"\u00c4\u0005\n\u000fSceneEntityInfo\u0012$\n\u000bentity_type\u0018\u0001 \u0001(\u000e2\u000f.ProtEntityType\u0012\u0011\n\tentity_id\u0018\u0002 \u0001(\r\u0012\f\n\u0004name\u0018\u0003 \u0001(\t\u0012 \n\u000bmotion_info\u0018\u0004 \u0001(\u000b2\u000b.MotionInfo\u0012\u001c\n\tprop_list\u0018\u0005 \u0003(\u000b2\t.PropPair\u0012'\n\u000ffight_prop_list\u0018\u0006 \u0003(\u000b2\u000e.FightPropPair\u0012\u0012\n\nlife_state\u0018\u0007 \u0001(\r\u0012;\n\u0012animator_para_list\u0018\t \u0003(\u000b2\u001f.AnimatorParameterValueInfoPair\u0012\u001f\n\u0017last_move_scene_time_ms\u0018\u0011 \u0001(\r\u0012\u001e\n\u0016last_move_reliable_seq\u0018\u0012 \u0001(\r\u0012-\n\u0012entity_client_data\u0018\u0013 \u0001(\u000b2\u0011.EntityClientData\u0012<\n\u001centity_environment_info_list\u0018\u0014 \u0003(\u000b2\u0016.EntityEnvironmentInfo\u00123\n\u0015entity_authority_info\u0018\u0015 \u0001(\u000b2\u0014.EntityAuthorityInfo\u0012\u0010\n\btag_list\u0018\u0016 \u0003(\t\u0012%\n\u0010server_buff_list\u0018\u0017 \u0003(\u000b2\u000b.ServerBuff\u0012\"\n\u0006avatar\u0018\n \u0001(\u000b2\u0010.SceneAvatarInfoH\u0000\u0012$\n\u0007monster\u0018\u000b \u0001(\u000b2\u0011.SceneMonsterInfoH\u0000\u0012\u001c\n\u0003npc\u0018\f \u0001(\u000b2\r.SceneNpcInfoH\u0000\u0012\"\n\u0006gadget\u0018\r \u0001(\u000b2\u0010.SceneGadgetInfoH\u0000B\b\n\u0006entityB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneEntityInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AnimatorParameterValueInfoPairOuterClass.getDescriptor(), EntityAuthorityInfoOuterClass.getDescriptor(), EntityClientDataOuterClass.getDescriptor(), EntityEnvironmentInfoOuterClass.getDescriptor(), FightPropPairOuterClass.getDescriptor(), MotionInfoOuterClass.getDescriptor(), PropPairOuterClass.getDescriptor(), ProtEntityTypeOuterClass.getDescriptor(), SceneAvatarInfoOuterClass.getDescriptor(), SceneGadgetInfoOuterClass.getDescriptor(), SceneMonsterInfoOuterClass.getDescriptor(), SceneNpcInfoOuterClass.getDescriptor(), ServerBuffOuterClass.getDescriptor() });
        internal_static_SceneEntityInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneEntityInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneEntityInfoOuterClass.internal_static_SceneEntityInfo_descriptor, new String[] { "EntityType", "EntityId", "Name", "MotionInfo", "PropList", "FightPropList", "LifeState", "AnimatorParaList", "LastMoveSceneTimeMs", "LastMoveReliableSeq", "EntityClientData", "EntityEnvironmentInfoList", "EntityAuthorityInfo", "TagList", "ServerBuffList", "Avatar", "Monster", "Npc", "Gadget", "Entity" });
        AnimatorParameterValueInfoPairOuterClass.getDescriptor();
        EntityAuthorityInfoOuterClass.getDescriptor();
        EntityClientDataOuterClass.getDescriptor();
        EntityEnvironmentInfoOuterClass.getDescriptor();
        FightPropPairOuterClass.getDescriptor();
        MotionInfoOuterClass.getDescriptor();
        PropPairOuterClass.getDescriptor();
        ProtEntityTypeOuterClass.getDescriptor();
        SceneAvatarInfoOuterClass.getDescriptor();
        SceneGadgetInfoOuterClass.getDescriptor();
        SceneMonsterInfoOuterClass.getDescriptor();
        SceneNpcInfoOuterClass.getDescriptor();
        ServerBuffOuterClass.getDescriptor();
    }
    
    public static final class SceneEntityInfo extends GeneratedMessageV3 implements SceneEntityInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int entityCase_;
        private Object entity_;
        public static final int ENTITY_TYPE_FIELD_NUMBER = 1;
        private int entityType_;
        public static final int ENTITY_ID_FIELD_NUMBER = 2;
        private int entityId_;
        public static final int NAME_FIELD_NUMBER = 3;
        private volatile Object name_;
        public static final int MOTION_INFO_FIELD_NUMBER = 4;
        private MotionInfoOuterClass.MotionInfo motionInfo_;
        public static final int PROP_LIST_FIELD_NUMBER = 5;
        private List<PropPairOuterClass.PropPair> propList_;
        public static final int FIGHT_PROP_LIST_FIELD_NUMBER = 6;
        private List<FightPropPairOuterClass.FightPropPair> fightPropList_;
        public static final int LIFE_STATE_FIELD_NUMBER = 7;
        private int lifeState_;
        public static final int ANIMATOR_PARA_LIST_FIELD_NUMBER = 9;
        private List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> animatorParaList_;
        public static final int LAST_MOVE_SCENE_TIME_MS_FIELD_NUMBER = 17;
        private int lastMoveSceneTimeMs_;
        public static final int LAST_MOVE_RELIABLE_SEQ_FIELD_NUMBER = 18;
        private int lastMoveReliableSeq_;
        public static final int ENTITY_CLIENT_DATA_FIELD_NUMBER = 19;
        private EntityClientDataOuterClass.EntityClientData entityClientData_;
        public static final int ENTITY_ENVIRONMENT_INFO_LIST_FIELD_NUMBER = 20;
        private List<EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo> entityEnvironmentInfoList_;
        public static final int ENTITY_AUTHORITY_INFO_FIELD_NUMBER = 21;
        private EntityAuthorityInfoOuterClass.EntityAuthorityInfo entityAuthorityInfo_;
        public static final int TAG_LIST_FIELD_NUMBER = 22;
        private LazyStringList tagList_;
        public static final int SERVER_BUFF_LIST_FIELD_NUMBER = 23;
        private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
        public static final int AVATAR_FIELD_NUMBER = 10;
        public static final int MONSTER_FIELD_NUMBER = 11;
        public static final int NPC_FIELD_NUMBER = 12;
        public static final int GADGET_FIELD_NUMBER = 13;
        private byte memoizedIsInitialized;
        private static final SceneEntityInfo DEFAULT_INSTANCE;
        private static final Parser<SceneEntityInfo> PARSER;
        
        private SceneEntityInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.entityCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private SceneEntityInfo() {
            this.entityCase_ = 0;
            this.memoizedIsInitialized = -1;
            this.entityType_ = 0;
            this.name_ = "";
            this.propList_ = Collections.emptyList();
            this.fightPropList_ = Collections.emptyList();
            this.animatorParaList_ = Collections.emptyList();
            this.entityEnvironmentInfoList_ = Collections.emptyList();
            this.tagList_ = LazyStringArrayList.EMPTY;
            this.serverBuffList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneEntityInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneEntityInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            final int rawValue = input.readEnum();
                            this.entityType_ = rawValue;
                            continue;
                        }
                        case 16: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 26: {
                            final String s = input.readStringRequireUtf8();
                            this.name_ = s;
                            continue;
                        }
                        case 34: {
                            MotionInfoOuterClass.MotionInfo.Builder subBuilder = null;
                            if (this.motionInfo_ != null) {
                                subBuilder = this.motionInfo_.toBuilder();
                            }
                            this.motionInfo_ = input.readMessage(MotionInfoOuterClass.MotionInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.motionInfo_);
                                this.motionInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 42: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.propList_ = new ArrayList<PropPairOuterClass.PropPair>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.propList_.add(input.readMessage(PropPairOuterClass.PropPair.parser(), extensionRegistry));
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.fightPropList_ = new ArrayList<FightPropPairOuterClass.FightPropPair>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.fightPropList_.add(input.readMessage(FightPropPairOuterClass.FightPropPair.parser(), extensionRegistry));
                            continue;
                        }
                        case 56: {
                            this.lifeState_ = input.readUInt32();
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x4) == 0x0) {
                                this.animatorParaList_ = new ArrayList<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.animatorParaList_.add(input.readMessage(AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.parser(), extensionRegistry));
                            continue;
                        }
                        case 82: {
                            SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder subBuilder2 = null;
                            if (this.entityCase_ == 10) {
                                subBuilder2 = ((SceneAvatarInfoOuterClass.SceneAvatarInfo)this.entity_).toBuilder();
                            }
                            this.entity_ = input.readMessage(SceneAvatarInfoOuterClass.SceneAvatarInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((SceneAvatarInfoOuterClass.SceneAvatarInfo)this.entity_);
                                this.entity_ = subBuilder2.buildPartial();
                            }
                            this.entityCase_ = 10;
                            continue;
                        }
                        case 90: {
                            SceneMonsterInfoOuterClass.SceneMonsterInfo.Builder subBuilder3 = null;
                            if (this.entityCase_ == 11) {
                                subBuilder3 = ((SceneMonsterInfoOuterClass.SceneMonsterInfo)this.entity_).toBuilder();
                            }
                            this.entity_ = input.readMessage(SceneMonsterInfoOuterClass.SceneMonsterInfo.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom((SceneMonsterInfoOuterClass.SceneMonsterInfo)this.entity_);
                                this.entity_ = subBuilder3.buildPartial();
                            }
                            this.entityCase_ = 11;
                            continue;
                        }
                        case 98: {
                            SceneNpcInfoOuterClass.SceneNpcInfo.Builder subBuilder4 = null;
                            if (this.entityCase_ == 12) {
                                subBuilder4 = ((SceneNpcInfoOuterClass.SceneNpcInfo)this.entity_).toBuilder();
                            }
                            this.entity_ = input.readMessage(SceneNpcInfoOuterClass.SceneNpcInfo.parser(), extensionRegistry);
                            if (subBuilder4 != null) {
                                subBuilder4.mergeFrom((SceneNpcInfoOuterClass.SceneNpcInfo)this.entity_);
                                this.entity_ = subBuilder4.buildPartial();
                            }
                            this.entityCase_ = 12;
                            continue;
                        }
                        case 106: {
                            SceneGadgetInfoOuterClass.SceneGadgetInfo.Builder subBuilder5 = null;
                            if (this.entityCase_ == 13) {
                                subBuilder5 = ((SceneGadgetInfoOuterClass.SceneGadgetInfo)this.entity_).toBuilder();
                            }
                            this.entity_ = input.readMessage(SceneGadgetInfoOuterClass.SceneGadgetInfo.parser(), extensionRegistry);
                            if (subBuilder5 != null) {
                                subBuilder5.mergeFrom((SceneGadgetInfoOuterClass.SceneGadgetInfo)this.entity_);
                                this.entity_ = subBuilder5.buildPartial();
                            }
                            this.entityCase_ = 13;
                            continue;
                        }
                        case 136: {
                            this.lastMoveSceneTimeMs_ = input.readUInt32();
                            continue;
                        }
                        case 144: {
                            this.lastMoveReliableSeq_ = input.readUInt32();
                            continue;
                        }
                        case 154: {
                            EntityClientDataOuterClass.EntityClientData.Builder subBuilder6 = null;
                            if (this.entityClientData_ != null) {
                                subBuilder6 = this.entityClientData_.toBuilder();
                            }
                            this.entityClientData_ = input.readMessage(EntityClientDataOuterClass.EntityClientData.parser(), extensionRegistry);
                            if (subBuilder6 != null) {
                                subBuilder6.mergeFrom(this.entityClientData_);
                                this.entityClientData_ = subBuilder6.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 162: {
                            if ((mutable_bitField0_ & 0x8) == 0x0) {
                                this.entityEnvironmentInfoList_ = new ArrayList<EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.entityEnvironmentInfoList_.add(input.readMessage(EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.parser(), extensionRegistry));
                            continue;
                        }
                        case 170: {
                            EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder subBuilder7 = null;
                            if (this.entityAuthorityInfo_ != null) {
                                subBuilder7 = this.entityAuthorityInfo_.toBuilder();
                            }
                            this.entityAuthorityInfo_ = input.readMessage(EntityAuthorityInfoOuterClass.EntityAuthorityInfo.parser(), extensionRegistry);
                            if (subBuilder7 != null) {
                                subBuilder7.mergeFrom(this.entityAuthorityInfo_);
                                this.entityAuthorityInfo_ = subBuilder7.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 178: {
                            final String s = input.readStringRequireUtf8();
                            if ((mutable_bitField0_ & 0x10) == 0x0) {
                                this.tagList_ = new LazyStringArrayList();
                                mutable_bitField0_ |= 0x10;
                            }
                            this.tagList_.add(s);
                            continue;
                        }
                        case 186: {
                            if ((mutable_bitField0_ & 0x20) == 0x0) {
                                this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>();
                                mutable_bitField0_ |= 0x20;
                            }
                            this.serverBuffList_.add(input.readMessage(ServerBuffOuterClass.ServerBuff.parser(), extensionRegistry));
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
                    this.propList_ = Collections.unmodifiableList((List<? extends PropPairOuterClass.PropPair>)this.propList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.fightPropList_ = Collections.unmodifiableList((List<? extends FightPropPairOuterClass.FightPropPair>)this.fightPropList_);
                }
                if ((mutable_bitField0_ & 0x4) != 0x0) {
                    this.animatorParaList_ = Collections.unmodifiableList((List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair>)this.animatorParaList_);
                }
                if ((mutable_bitField0_ & 0x8) != 0x0) {
                    this.entityEnvironmentInfoList_ = Collections.unmodifiableList((List<? extends EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo>)this.entityEnvironmentInfoList_);
                }
                if ((mutable_bitField0_ & 0x10) != 0x0) {
                    this.tagList_ = this.tagList_.getUnmodifiableView();
                }
                if ((mutable_bitField0_ & 0x20) != 0x0) {
                    this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneEntityInfoOuterClass.internal_static_SceneEntityInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneEntityInfoOuterClass.internal_static_SceneEntityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneEntityInfo.class, Builder.class);
        }
        
        @Override
        public EntityCase getEntityCase() {
            return EntityCase.forNumber(this.entityCase_);
        }
        
        @Override
        public int getEntityTypeValue() {
            return this.entityType_;
        }
        
        @Override
        public ProtEntityTypeOuterClass.ProtEntityType getEntityType() {
            final ProtEntityTypeOuterClass.ProtEntityType result = ProtEntityTypeOuterClass.ProtEntityType.valueOf(this.entityType_);
            return (result == null) ? ProtEntityTypeOuterClass.ProtEntityType.UNRECOGNIZED : result;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public String getName() {
            final Object ref = this.name_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.name_ = s);
        }
        
        @Override
        public ByteString getNameBytes() {
            final Object ref = this.name_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.name_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public boolean hasMotionInfo() {
            return this.motionInfo_ != null;
        }
        
        @Override
        public MotionInfoOuterClass.MotionInfo getMotionInfo() {
            return (this.motionInfo_ == null) ? MotionInfoOuterClass.MotionInfo.getDefaultInstance() : this.motionInfo_;
        }
        
        @Override
        public MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
            return this.getMotionInfo();
        }
        
        @Override
        public List<PropPairOuterClass.PropPair> getPropListList() {
            return this.propList_;
        }
        
        @Override
        public List<? extends PropPairOuterClass.PropPairOrBuilder> getPropListOrBuilderList() {
            return this.propList_;
        }
        
        @Override
        public int getPropListCount() {
            return this.propList_.size();
        }
        
        @Override
        public PropPairOuterClass.PropPair getPropList(final int index) {
            return this.propList_.get(index);
        }
        
        @Override
        public PropPairOuterClass.PropPairOrBuilder getPropListOrBuilder(final int index) {
            return this.propList_.get(index);
        }
        
        @Override
        public List<FightPropPairOuterClass.FightPropPair> getFightPropListList() {
            return this.fightPropList_;
        }
        
        @Override
        public List<? extends FightPropPairOuterClass.FightPropPairOrBuilder> getFightPropListOrBuilderList() {
            return this.fightPropList_;
        }
        
        @Override
        public int getFightPropListCount() {
            return this.fightPropList_.size();
        }
        
        @Override
        public FightPropPairOuterClass.FightPropPair getFightPropList(final int index) {
            return this.fightPropList_.get(index);
        }
        
        @Override
        public FightPropPairOuterClass.FightPropPairOrBuilder getFightPropListOrBuilder(final int index) {
            return this.fightPropList_.get(index);
        }
        
        @Override
        public int getLifeState() {
            return this.lifeState_;
        }
        
        @Override
        public List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> getAnimatorParaListList() {
            return this.animatorParaList_;
        }
        
        @Override
        public List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> getAnimatorParaListOrBuilderList() {
            return this.animatorParaList_;
        }
        
        @Override
        public int getAnimatorParaListCount() {
            return this.animatorParaList_.size();
        }
        
        @Override
        public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getAnimatorParaList(final int index) {
            return this.animatorParaList_.get(index);
        }
        
        @Override
        public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder getAnimatorParaListOrBuilder(final int index) {
            return this.animatorParaList_.get(index);
        }
        
        @Override
        public int getLastMoveSceneTimeMs() {
            return this.lastMoveSceneTimeMs_;
        }
        
        @Override
        public int getLastMoveReliableSeq() {
            return this.lastMoveReliableSeq_;
        }
        
        @Override
        public boolean hasEntityClientData() {
            return this.entityClientData_ != null;
        }
        
        @Override
        public EntityClientDataOuterClass.EntityClientData getEntityClientData() {
            return (this.entityClientData_ == null) ? EntityClientDataOuterClass.EntityClientData.getDefaultInstance() : this.entityClientData_;
        }
        
        @Override
        public EntityClientDataOuterClass.EntityClientDataOrBuilder getEntityClientDataOrBuilder() {
            return this.getEntityClientData();
        }
        
        @Override
        public List<EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo> getEntityEnvironmentInfoListList() {
            return this.entityEnvironmentInfoList_;
        }
        
        @Override
        public List<? extends EntityEnvironmentInfoOuterClass.EntityEnvironmentInfoOrBuilder> getEntityEnvironmentInfoListOrBuilderList() {
            return this.entityEnvironmentInfoList_;
        }
        
        @Override
        public int getEntityEnvironmentInfoListCount() {
            return this.entityEnvironmentInfoList_.size();
        }
        
        @Override
        public EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo getEntityEnvironmentInfoList(final int index) {
            return this.entityEnvironmentInfoList_.get(index);
        }
        
        @Override
        public EntityEnvironmentInfoOuterClass.EntityEnvironmentInfoOrBuilder getEntityEnvironmentInfoListOrBuilder(final int index) {
            return this.entityEnvironmentInfoList_.get(index);
        }
        
        @Override
        public boolean hasEntityAuthorityInfo() {
            return this.entityAuthorityInfo_ != null;
        }
        
        @Override
        public EntityAuthorityInfoOuterClass.EntityAuthorityInfo getEntityAuthorityInfo() {
            return (this.entityAuthorityInfo_ == null) ? EntityAuthorityInfoOuterClass.EntityAuthorityInfo.getDefaultInstance() : this.entityAuthorityInfo_;
        }
        
        @Override
        public EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder getEntityAuthorityInfoOrBuilder() {
            return this.getEntityAuthorityInfo();
        }
        
        @Override
        public ProtocolStringList getTagListList() {
            return this.tagList_;
        }
        
        @Override
        public int getTagListCount() {
            return this.tagList_.size();
        }
        
        @Override
        public String getTagList(final int index) {
            return this.tagList_.get(index);
        }
        
        @Override
        public ByteString getTagListBytes(final int index) {
            return this.tagList_.getByteString(index);
        }
        
        @Override
        public List<ServerBuffOuterClass.ServerBuff> getServerBuffListList() {
            return this.serverBuffList_;
        }
        
        @Override
        public List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList() {
            return this.serverBuffList_;
        }
        
        @Override
        public int getServerBuffListCount() {
            return this.serverBuffList_.size();
        }
        
        @Override
        public ServerBuffOuterClass.ServerBuff getServerBuffList(final int index) {
            return this.serverBuffList_.get(index);
        }
        
        @Override
        public ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int index) {
            return this.serverBuffList_.get(index);
        }
        
        @Override
        public boolean hasAvatar() {
            return this.entityCase_ == 10;
        }
        
        @Override
        public SceneAvatarInfoOuterClass.SceneAvatarInfo getAvatar() {
            if (this.entityCase_ == 10) {
                return (SceneAvatarInfoOuterClass.SceneAvatarInfo)this.entity_;
            }
            return SceneAvatarInfoOuterClass.SceneAvatarInfo.getDefaultInstance();
        }
        
        @Override
        public SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder getAvatarOrBuilder() {
            if (this.entityCase_ == 10) {
                return (SceneAvatarInfoOuterClass.SceneAvatarInfo)this.entity_;
            }
            return SceneAvatarInfoOuterClass.SceneAvatarInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasMonster() {
            return this.entityCase_ == 11;
        }
        
        @Override
        public SceneMonsterInfoOuterClass.SceneMonsterInfo getMonster() {
            if (this.entityCase_ == 11) {
                return (SceneMonsterInfoOuterClass.SceneMonsterInfo)this.entity_;
            }
            return SceneMonsterInfoOuterClass.SceneMonsterInfo.getDefaultInstance();
        }
        
        @Override
        public SceneMonsterInfoOuterClass.SceneMonsterInfoOrBuilder getMonsterOrBuilder() {
            if (this.entityCase_ == 11) {
                return (SceneMonsterInfoOuterClass.SceneMonsterInfo)this.entity_;
            }
            return SceneMonsterInfoOuterClass.SceneMonsterInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasNpc() {
            return this.entityCase_ == 12;
        }
        
        @Override
        public SceneNpcInfoOuterClass.SceneNpcInfo getNpc() {
            if (this.entityCase_ == 12) {
                return (SceneNpcInfoOuterClass.SceneNpcInfo)this.entity_;
            }
            return SceneNpcInfoOuterClass.SceneNpcInfo.getDefaultInstance();
        }
        
        @Override
        public SceneNpcInfoOuterClass.SceneNpcInfoOrBuilder getNpcOrBuilder() {
            if (this.entityCase_ == 12) {
                return (SceneNpcInfoOuterClass.SceneNpcInfo)this.entity_;
            }
            return SceneNpcInfoOuterClass.SceneNpcInfo.getDefaultInstance();
        }
        
        @Override
        public boolean hasGadget() {
            return this.entityCase_ == 13;
        }
        
        @Override
        public SceneGadgetInfoOuterClass.SceneGadgetInfo getGadget() {
            if (this.entityCase_ == 13) {
                return (SceneGadgetInfoOuterClass.SceneGadgetInfo)this.entity_;
            }
            return SceneGadgetInfoOuterClass.SceneGadgetInfo.getDefaultInstance();
        }
        
        @Override
        public SceneGadgetInfoOuterClass.SceneGadgetInfoOrBuilder getGadgetOrBuilder() {
            if (this.entityCase_ == 13) {
                return (SceneGadgetInfoOuterClass.SceneGadgetInfo)this.entity_;
            }
            return SceneGadgetInfoOuterClass.SceneGadgetInfo.getDefaultInstance();
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
            if (this.entityType_ != ProtEntityTypeOuterClass.ProtEntityType.PROT_ENTITY_TYPE_NONE.getNumber()) {
                output.writeEnum(1, this.entityType_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(2, this.entityId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                GeneratedMessageV3.writeString(output, 3, this.name_);
            }
            if (this.motionInfo_ != null) {
                output.writeMessage(4, this.getMotionInfo());
            }
            for (int i = 0; i < this.propList_.size(); ++i) {
                output.writeMessage(5, this.propList_.get(i));
            }
            for (int i = 0; i < this.fightPropList_.size(); ++i) {
                output.writeMessage(6, this.fightPropList_.get(i));
            }
            if (this.lifeState_ != 0) {
                output.writeUInt32(7, this.lifeState_);
            }
            for (int i = 0; i < this.animatorParaList_.size(); ++i) {
                output.writeMessage(9, this.animatorParaList_.get(i));
            }
            if (this.entityCase_ == 10) {
                output.writeMessage(10, (MessageLite)this.entity_);
            }
            if (this.entityCase_ == 11) {
                output.writeMessage(11, (MessageLite)this.entity_);
            }
            if (this.entityCase_ == 12) {
                output.writeMessage(12, (MessageLite)this.entity_);
            }
            if (this.entityCase_ == 13) {
                output.writeMessage(13, (MessageLite)this.entity_);
            }
            if (this.lastMoveSceneTimeMs_ != 0) {
                output.writeUInt32(17, this.lastMoveSceneTimeMs_);
            }
            if (this.lastMoveReliableSeq_ != 0) {
                output.writeUInt32(18, this.lastMoveReliableSeq_);
            }
            if (this.entityClientData_ != null) {
                output.writeMessage(19, this.getEntityClientData());
            }
            for (int i = 0; i < this.entityEnvironmentInfoList_.size(); ++i) {
                output.writeMessage(20, this.entityEnvironmentInfoList_.get(i));
            }
            if (this.entityAuthorityInfo_ != null) {
                output.writeMessage(21, this.getEntityAuthorityInfo());
            }
            for (int i = 0; i < this.tagList_.size(); ++i) {
                GeneratedMessageV3.writeString(output, 22, this.tagList_.getRaw(i));
            }
            for (int i = 0; i < this.serverBuffList_.size(); ++i) {
                output.writeMessage(23, this.serverBuffList_.get(i));
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
            if (this.entityType_ != ProtEntityTypeOuterClass.ProtEntityType.PROT_ENTITY_TYPE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(1, this.entityType_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.entityId_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
                size += GeneratedMessageV3.computeStringSize(3, this.name_);
            }
            if (this.motionInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getMotionInfo());
            }
            for (int i = 0; i < this.propList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.propList_.get(i));
            }
            for (int i = 0; i < this.fightPropList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(6, this.fightPropList_.get(i));
            }
            if (this.lifeState_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.lifeState_);
            }
            for (int i = 0; i < this.animatorParaList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.animatorParaList_.get(i));
            }
            if (this.entityCase_ == 10) {
                size += CodedOutputStream.computeMessageSize(10, (MessageLite)this.entity_);
            }
            if (this.entityCase_ == 11) {
                size += CodedOutputStream.computeMessageSize(11, (MessageLite)this.entity_);
            }
            if (this.entityCase_ == 12) {
                size += CodedOutputStream.computeMessageSize(12, (MessageLite)this.entity_);
            }
            if (this.entityCase_ == 13) {
                size += CodedOutputStream.computeMessageSize(13, (MessageLite)this.entity_);
            }
            if (this.lastMoveSceneTimeMs_ != 0) {
                size += CodedOutputStream.computeUInt32Size(17, this.lastMoveSceneTimeMs_);
            }
            if (this.lastMoveReliableSeq_ != 0) {
                size += CodedOutputStream.computeUInt32Size(18, this.lastMoveReliableSeq_);
            }
            if (this.entityClientData_ != null) {
                size += CodedOutputStream.computeMessageSize(19, this.getEntityClientData());
            }
            for (int i = 0; i < this.entityEnvironmentInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(20, this.entityEnvironmentInfoList_.get(i));
            }
            if (this.entityAuthorityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(21, this.getEntityAuthorityInfo());
            }
            int dataSize = 0;
            for (int j = 0; j < this.tagList_.size(); ++j) {
                dataSize += GeneratedMessageV3.computeStringSizeNoTag(this.tagList_.getRaw(j));
            }
            size += dataSize;
            size += 2 * this.getTagListList().size();
            for (int i = 0; i < this.serverBuffList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(23, this.serverBuffList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneEntityInfo)) {
                return super.equals(obj);
            }
            final SceneEntityInfo other = (SceneEntityInfo)obj;
            if (this.entityType_ != other.entityType_) {
                return false;
            }
            if (this.getEntityId() != other.getEntityId()) {
                return false;
            }
            if (!this.getName().equals(other.getName())) {
                return false;
            }
            if (this.hasMotionInfo() != other.hasMotionInfo()) {
                return false;
            }
            if (this.hasMotionInfo() && !this.getMotionInfo().equals(other.getMotionInfo())) {
                return false;
            }
            if (!this.getPropListList().equals(other.getPropListList())) {
                return false;
            }
            if (!this.getFightPropListList().equals(other.getFightPropListList())) {
                return false;
            }
            if (this.getLifeState() != other.getLifeState()) {
                return false;
            }
            if (!this.getAnimatorParaListList().equals(other.getAnimatorParaListList())) {
                return false;
            }
            if (this.getLastMoveSceneTimeMs() != other.getLastMoveSceneTimeMs()) {
                return false;
            }
            if (this.getLastMoveReliableSeq() != other.getLastMoveReliableSeq()) {
                return false;
            }
            if (this.hasEntityClientData() != other.hasEntityClientData()) {
                return false;
            }
            if (this.hasEntityClientData() && !this.getEntityClientData().equals(other.getEntityClientData())) {
                return false;
            }
            if (!this.getEntityEnvironmentInfoListList().equals(other.getEntityEnvironmentInfoListList())) {
                return false;
            }
            if (this.hasEntityAuthorityInfo() != other.hasEntityAuthorityInfo()) {
                return false;
            }
            if (this.hasEntityAuthorityInfo() && !this.getEntityAuthorityInfo().equals(other.getEntityAuthorityInfo())) {
                return false;
            }
            if (!this.getTagListList().equals(other.getTagListList())) {
                return false;
            }
            if (!this.getServerBuffListList().equals(other.getServerBuffListList())) {
                return false;
            }
            if (!this.getEntityCase().equals(other.getEntityCase())) {
                return false;
            }
            switch (this.entityCase_) {
                case 10: {
                    if (!this.getAvatar().equals(other.getAvatar())) {
                        return false;
                    }
                    break;
                }
                case 11: {
                    if (!this.getMonster().equals(other.getMonster())) {
                        return false;
                    }
                    break;
                }
                case 12: {
                    if (!this.getNpc().equals(other.getNpc())) {
                        return false;
                    }
                    break;
                }
                case 13: {
                    if (!this.getGadget().equals(other.getGadget())) {
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
            hash = 53 * hash + this.entityType_;
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getName().hashCode();
            if (this.hasMotionInfo()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getMotionInfo().hashCode();
            }
            if (this.getPropListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getPropListList().hashCode();
            }
            if (this.getFightPropListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getFightPropListList().hashCode();
            }
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getLifeState();
            if (this.getAnimatorParaListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getAnimatorParaListList().hashCode();
            }
            hash = 37 * hash + 17;
            hash = 53 * hash + this.getLastMoveSceneTimeMs();
            hash = 37 * hash + 18;
            hash = 53 * hash + this.getLastMoveReliableSeq();
            if (this.hasEntityClientData()) {
                hash = 37 * hash + 19;
                hash = 53 * hash + this.getEntityClientData().hashCode();
            }
            if (this.getEntityEnvironmentInfoListCount() > 0) {
                hash = 37 * hash + 20;
                hash = 53 * hash + this.getEntityEnvironmentInfoListList().hashCode();
            }
            if (this.hasEntityAuthorityInfo()) {
                hash = 37 * hash + 21;
                hash = 53 * hash + this.getEntityAuthorityInfo().hashCode();
            }
            if (this.getTagListCount() > 0) {
                hash = 37 * hash + 22;
                hash = 53 * hash + this.getTagListList().hashCode();
            }
            if (this.getServerBuffListCount() > 0) {
                hash = 37 * hash + 23;
                hash = 53 * hash + this.getServerBuffListList().hashCode();
            }
            switch (this.entityCase_) {
                case 10: {
                    hash = 37 * hash + 10;
                    hash = 53 * hash + this.getAvatar().hashCode();
                    break;
                }
                case 11: {
                    hash = 37 * hash + 11;
                    hash = 53 * hash + this.getMonster().hashCode();
                    break;
                }
                case 12: {
                    hash = 37 * hash + 12;
                    hash = 53 * hash + this.getNpc().hashCode();
                    break;
                }
                case 13: {
                    hash = 37 * hash + 13;
                    hash = 53 * hash + this.getGadget().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneEntityInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneEntityInfo.PARSER.parseFrom(data);
        }
        
        public static SceneEntityInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneEntityInfo.PARSER.parseFrom(data);
        }
        
        public static SceneEntityInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneEntityInfo.PARSER.parseFrom(data);
        }
        
        public static SceneEntityInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityInfo.PARSER, input);
        }
        
        public static SceneEntityInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneEntityInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneEntityInfo.PARSER, input);
        }
        
        public static SceneEntityInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneEntityInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneEntityInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityInfo.PARSER, input);
        }
        
        public static SceneEntityInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneEntityInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneEntityInfo prototype) {
            return SceneEntityInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneEntityInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneEntityInfo getDefaultInstance() {
            return SceneEntityInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneEntityInfo> parser() {
            return SceneEntityInfo.PARSER;
        }
        
        @Override
        public Parser<SceneEntityInfo> getParserForType() {
            return SceneEntityInfo.PARSER;
        }
        
        @Override
        public SceneEntityInfo getDefaultInstanceForType() {
            return SceneEntityInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneEntityInfo();
            PARSER = new AbstractParser<SceneEntityInfo>() {
                @Override
                public SceneEntityInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneEntityInfo(input, extensionRegistry);
                }
            };
        }
        
        public enum EntityCase implements Internal.EnumLite, InternalOneOfEnum
        {
            AVATAR(10), 
            MONSTER(11), 
            NPC(12), 
            GADGET(13), 
            ENTITY_NOT_SET(0);
            
            private final int value;
            
            private EntityCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static EntityCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static EntityCase forNumber(final int value) {
                switch (value) {
                    case 10: {
                        return EntityCase.AVATAR;
                    }
                    case 11: {
                        return EntityCase.MONSTER;
                    }
                    case 12: {
                        return EntityCase.NPC;
                    }
                    case 13: {
                        return EntityCase.GADGET;
                    }
                    case 0: {
                        return EntityCase.ENTITY_NOT_SET;
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
            
            private static /* synthetic */ EntityCase[] value() {
                return new EntityCase[] { EntityCase.AVATAR, EntityCase.MONSTER, EntityCase.NPC, EntityCase.GADGET, EntityCase.ENTITY_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneEntityInfoOrBuilder
        {
            private int entityCase_;
            private Object entity_;
            private int bitField0_;
            private int entityType_;
            private int entityId_;
            private Object name_;
            private MotionInfoOuterClass.MotionInfo motionInfo_;
            private SingleFieldBuilderV3<MotionInfoOuterClass.MotionInfo, MotionInfoOuterClass.MotionInfo.Builder, MotionInfoOuterClass.MotionInfoOrBuilder> motionInfoBuilder_;
            private List<PropPairOuterClass.PropPair> propList_;
            private RepeatedFieldBuilderV3<PropPairOuterClass.PropPair, PropPairOuterClass.PropPair.Builder, PropPairOuterClass.PropPairOrBuilder> propListBuilder_;
            private List<FightPropPairOuterClass.FightPropPair> fightPropList_;
            private RepeatedFieldBuilderV3<FightPropPairOuterClass.FightPropPair, FightPropPairOuterClass.FightPropPair.Builder, FightPropPairOuterClass.FightPropPairOrBuilder> fightPropListBuilder_;
            private int lifeState_;
            private List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> animatorParaList_;
            private RepeatedFieldBuilderV3<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> animatorParaListBuilder_;
            private int lastMoveSceneTimeMs_;
            private int lastMoveReliableSeq_;
            private EntityClientDataOuterClass.EntityClientData entityClientData_;
            private SingleFieldBuilderV3<EntityClientDataOuterClass.EntityClientData, EntityClientDataOuterClass.EntityClientData.Builder, EntityClientDataOuterClass.EntityClientDataOrBuilder> entityClientDataBuilder_;
            private List<EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo> entityEnvironmentInfoList_;
            private RepeatedFieldBuilderV3<EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo, EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder, EntityEnvironmentInfoOuterClass.EntityEnvironmentInfoOrBuilder> entityEnvironmentInfoListBuilder_;
            private EntityAuthorityInfoOuterClass.EntityAuthorityInfo entityAuthorityInfo_;
            private SingleFieldBuilderV3<EntityAuthorityInfoOuterClass.EntityAuthorityInfo, EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder, EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder> entityAuthorityInfoBuilder_;
            private LazyStringList tagList_;
            private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
            private RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder> serverBuffListBuilder_;
            private SingleFieldBuilderV3<SceneAvatarInfoOuterClass.SceneAvatarInfo, SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder, SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder> avatarBuilder_;
            private SingleFieldBuilderV3<SceneMonsterInfoOuterClass.SceneMonsterInfo, SceneMonsterInfoOuterClass.SceneMonsterInfo.Builder, SceneMonsterInfoOuterClass.SceneMonsterInfoOrBuilder> monsterBuilder_;
            private SingleFieldBuilderV3<SceneNpcInfoOuterClass.SceneNpcInfo, SceneNpcInfoOuterClass.SceneNpcInfo.Builder, SceneNpcInfoOuterClass.SceneNpcInfoOrBuilder> npcBuilder_;
            private SingleFieldBuilderV3<SceneGadgetInfoOuterClass.SceneGadgetInfo, SceneGadgetInfoOuterClass.SceneGadgetInfo.Builder, SceneGadgetInfoOuterClass.SceneGadgetInfoOrBuilder> gadgetBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneEntityInfoOuterClass.internal_static_SceneEntityInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneEntityInfoOuterClass.internal_static_SceneEntityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneEntityInfo.class, Builder.class);
            }
            
            private Builder() {
                this.entityCase_ = 0;
                this.entityType_ = 0;
                this.name_ = "";
                this.propList_ = Collections.emptyList();
                this.fightPropList_ = Collections.emptyList();
                this.animatorParaList_ = Collections.emptyList();
                this.entityEnvironmentInfoList_ = Collections.emptyList();
                this.tagList_ = LazyStringArrayList.EMPTY;
                this.serverBuffList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.entityCase_ = 0;
                this.entityType_ = 0;
                this.name_ = "";
                this.propList_ = Collections.emptyList();
                this.fightPropList_ = Collections.emptyList();
                this.animatorParaList_ = Collections.emptyList();
                this.entityEnvironmentInfoList_ = Collections.emptyList();
                this.tagList_ = LazyStringArrayList.EMPTY;
                this.serverBuffList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneEntityInfo.alwaysUseFieldBuilders) {
                    this.getPropListFieldBuilder();
                    this.getFightPropListFieldBuilder();
                    this.getAnimatorParaListFieldBuilder();
                    this.getEntityEnvironmentInfoListFieldBuilder();
                    this.getServerBuffListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityType_ = 0;
                this.entityId_ = 0;
                this.name_ = "";
                if (this.motionInfoBuilder_ == null) {
                    this.motionInfo_ = null;
                }
                else {
                    this.motionInfo_ = null;
                    this.motionInfoBuilder_ = null;
                }
                if (this.propListBuilder_ == null) {
                    this.propList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.propListBuilder_.clear();
                }
                if (this.fightPropListBuilder_ == null) {
                    this.fightPropList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.fightPropListBuilder_.clear();
                }
                this.lifeState_ = 0;
                if (this.animatorParaListBuilder_ == null) {
                    this.animatorParaList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                }
                else {
                    this.animatorParaListBuilder_.clear();
                }
                this.lastMoveSceneTimeMs_ = 0;
                this.lastMoveReliableSeq_ = 0;
                if (this.entityClientDataBuilder_ == null) {
                    this.entityClientData_ = null;
                }
                else {
                    this.entityClientData_ = null;
                    this.entityClientDataBuilder_ = null;
                }
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    this.entityEnvironmentInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                }
                else {
                    this.entityEnvironmentInfoListBuilder_.clear();
                }
                if (this.entityAuthorityInfoBuilder_ == null) {
                    this.entityAuthorityInfo_ = null;
                }
                else {
                    this.entityAuthorityInfo_ = null;
                    this.entityAuthorityInfoBuilder_ = null;
                }
                this.tagList_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= 0xFFFFFFEF;
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFDF;
                }
                else {
                    this.serverBuffListBuilder_.clear();
                }
                this.entityCase_ = 0;
                this.entity_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneEntityInfoOuterClass.internal_static_SceneEntityInfo_descriptor;
            }
            
            @Override
            public SceneEntityInfo getDefaultInstanceForType() {
                return SceneEntityInfo.getDefaultInstance();
            }
            
            @Override
            public SceneEntityInfo build() {
                final SceneEntityInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneEntityInfo buildPartial() {
                final SceneEntityInfo result = new SceneEntityInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.entityType_ = this.entityType_;
                result.entityId_ = this.entityId_;
                result.name_ = this.name_;
                if (this.motionInfoBuilder_ == null) {
                    result.motionInfo_ = this.motionInfo_;
                }
                else {
                    result.motionInfo_ = this.motionInfoBuilder_.build();
                }
                if (this.propListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.propList_ = Collections.unmodifiableList((List<? extends PropPairOuterClass.PropPair>)this.propList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.propList_ = this.propList_;
                }
                else {
                    result.propList_ = this.propListBuilder_.build();
                }
                if (this.fightPropListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.fightPropList_ = Collections.unmodifiableList((List<? extends FightPropPairOuterClass.FightPropPair>)this.fightPropList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.fightPropList_ = this.fightPropList_;
                }
                else {
                    result.fightPropList_ = this.fightPropListBuilder_.build();
                }
                result.lifeState_ = this.lifeState_;
                if (this.animatorParaListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) != 0x0) {
                        this.animatorParaList_ = Collections.unmodifiableList((List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair>)this.animatorParaList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.animatorParaList_ = this.animatorParaList_;
                }
                else {
                    result.animatorParaList_ = this.animatorParaListBuilder_.build();
                }
                result.lastMoveSceneTimeMs_ = this.lastMoveSceneTimeMs_;
                result.lastMoveReliableSeq_ = this.lastMoveReliableSeq_;
                if (this.entityClientDataBuilder_ == null) {
                    result.entityClientData_ = this.entityClientData_;
                }
                else {
                    result.entityClientData_ = this.entityClientDataBuilder_.build();
                }
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) != 0x0) {
                        this.entityEnvironmentInfoList_ = Collections.unmodifiableList((List<? extends EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo>)this.entityEnvironmentInfoList_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.entityEnvironmentInfoList_ = this.entityEnvironmentInfoList_;
                }
                else {
                    result.entityEnvironmentInfoList_ = this.entityEnvironmentInfoListBuilder_.build();
                }
                if (this.entityAuthorityInfoBuilder_ == null) {
                    result.entityAuthorityInfo_ = this.entityAuthorityInfo_;
                }
                else {
                    result.entityAuthorityInfo_ = this.entityAuthorityInfoBuilder_.build();
                }
                if ((this.bitField0_ & 0x10) != 0x0) {
                    this.tagList_ = this.tagList_.getUnmodifiableView();
                    this.bitField0_ &= 0xFFFFFFEF;
                }
                result.tagList_ = this.tagList_;
                if (this.serverBuffListBuilder_ == null) {
                    if ((this.bitField0_ & 0x20) != 0x0) {
                        this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                        this.bitField0_ &= 0xFFFFFFDF;
                    }
                    result.serverBuffList_ = this.serverBuffList_;
                }
                else {
                    result.serverBuffList_ = this.serverBuffListBuilder_.build();
                }
                if (this.entityCase_ == 10) {
                    if (this.avatarBuilder_ == null) {
                        result.entity_ = this.entity_;
                    }
                    else {
                        result.entity_ = this.avatarBuilder_.build();
                    }
                }
                if (this.entityCase_ == 11) {
                    if (this.monsterBuilder_ == null) {
                        result.entity_ = this.entity_;
                    }
                    else {
                        result.entity_ = this.monsterBuilder_.build();
                    }
                }
                if (this.entityCase_ == 12) {
                    if (this.npcBuilder_ == null) {
                        result.entity_ = this.entity_;
                    }
                    else {
                        result.entity_ = this.npcBuilder_.build();
                    }
                }
                if (this.entityCase_ == 13) {
                    if (this.gadgetBuilder_ == null) {
                        result.entity_ = this.entity_;
                    }
                    else {
                        result.entity_ = this.gadgetBuilder_.build();
                    }
                }
                result.entityCase_ = this.entityCase_;
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
                if (other instanceof SceneEntityInfo) {
                    return this.mergeFrom((SceneEntityInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneEntityInfo other) {
                if (other == SceneEntityInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.entityType_ != 0) {
                    this.setEntityTypeValue(other.getEntityTypeValue());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (!other.getName().isEmpty()) {
                    this.name_ = other.name_;
                    this.onChanged();
                }
                if (other.hasMotionInfo()) {
                    this.mergeMotionInfo(other.getMotionInfo());
                }
                if (this.propListBuilder_ == null) {
                    if (!other.propList_.isEmpty()) {
                        if (this.propList_.isEmpty()) {
                            this.propList_ = other.propList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensurePropListIsMutable();
                            this.propList_.addAll(other.propList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.propList_.isEmpty()) {
                    if (this.propListBuilder_.isEmpty()) {
                        this.propListBuilder_.dispose();
                        this.propListBuilder_ = null;
                        this.propList_ = other.propList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.propListBuilder_ = (SceneEntityInfo.alwaysUseFieldBuilders ? this.getPropListFieldBuilder() : null);
                    }
                    else {
                        this.propListBuilder_.addAllMessages(other.propList_);
                    }
                }
                if (this.fightPropListBuilder_ == null) {
                    if (!other.fightPropList_.isEmpty()) {
                        if (this.fightPropList_.isEmpty()) {
                            this.fightPropList_ = other.fightPropList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureFightPropListIsMutable();
                            this.fightPropList_.addAll(other.fightPropList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.fightPropList_.isEmpty()) {
                    if (this.fightPropListBuilder_.isEmpty()) {
                        this.fightPropListBuilder_.dispose();
                        this.fightPropListBuilder_ = null;
                        this.fightPropList_ = other.fightPropList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.fightPropListBuilder_ = (SceneEntityInfo.alwaysUseFieldBuilders ? this.getFightPropListFieldBuilder() : null);
                    }
                    else {
                        this.fightPropListBuilder_.addAllMessages(other.fightPropList_);
                    }
                }
                if (other.getLifeState() != 0) {
                    this.setLifeState(other.getLifeState());
                }
                if (this.animatorParaListBuilder_ == null) {
                    if (!other.animatorParaList_.isEmpty()) {
                        if (this.animatorParaList_.isEmpty()) {
                            this.animatorParaList_ = other.animatorParaList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        }
                        else {
                            this.ensureAnimatorParaListIsMutable();
                            this.animatorParaList_.addAll(other.animatorParaList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.animatorParaList_.isEmpty()) {
                    if (this.animatorParaListBuilder_.isEmpty()) {
                        this.animatorParaListBuilder_.dispose();
                        this.animatorParaListBuilder_ = null;
                        this.animatorParaList_ = other.animatorParaList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.animatorParaListBuilder_ = (SceneEntityInfo.alwaysUseFieldBuilders ? this.getAnimatorParaListFieldBuilder() : null);
                    }
                    else {
                        this.animatorParaListBuilder_.addAllMessages(other.animatorParaList_);
                    }
                }
                if (other.getLastMoveSceneTimeMs() != 0) {
                    this.setLastMoveSceneTimeMs(other.getLastMoveSceneTimeMs());
                }
                if (other.getLastMoveReliableSeq() != 0) {
                    this.setLastMoveReliableSeq(other.getLastMoveReliableSeq());
                }
                if (other.hasEntityClientData()) {
                    this.mergeEntityClientData(other.getEntityClientData());
                }
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    if (!other.entityEnvironmentInfoList_.isEmpty()) {
                        if (this.entityEnvironmentInfoList_.isEmpty()) {
                            this.entityEnvironmentInfoList_ = other.entityEnvironmentInfoList_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        }
                        else {
                            this.ensureEntityEnvironmentInfoListIsMutable();
                            this.entityEnvironmentInfoList_.addAll(other.entityEnvironmentInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.entityEnvironmentInfoList_.isEmpty()) {
                    if (this.entityEnvironmentInfoListBuilder_.isEmpty()) {
                        this.entityEnvironmentInfoListBuilder_.dispose();
                        this.entityEnvironmentInfoListBuilder_ = null;
                        this.entityEnvironmentInfoList_ = other.entityEnvironmentInfoList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.entityEnvironmentInfoListBuilder_ = (SceneEntityInfo.alwaysUseFieldBuilders ? this.getEntityEnvironmentInfoListFieldBuilder() : null);
                    }
                    else {
                        this.entityEnvironmentInfoListBuilder_.addAllMessages(other.entityEnvironmentInfoList_);
                    }
                }
                if (other.hasEntityAuthorityInfo()) {
                    this.mergeEntityAuthorityInfo(other.getEntityAuthorityInfo());
                }
                if (!other.tagList_.isEmpty()) {
                    if (this.tagList_.isEmpty()) {
                        this.tagList_ = other.tagList_;
                        this.bitField0_ &= 0xFFFFFFEF;
                    }
                    else {
                        this.ensureTagListIsMutable();
                        this.tagList_.addAll(other.tagList_);
                    }
                    this.onChanged();
                }
                if (this.serverBuffListBuilder_ == null) {
                    if (!other.serverBuffList_.isEmpty()) {
                        if (this.serverBuffList_.isEmpty()) {
                            this.serverBuffList_ = other.serverBuffList_;
                            this.bitField0_ &= 0xFFFFFFDF;
                        }
                        else {
                            this.ensureServerBuffListIsMutable();
                            this.serverBuffList_.addAll(other.serverBuffList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.serverBuffList_.isEmpty()) {
                    if (this.serverBuffListBuilder_.isEmpty()) {
                        this.serverBuffListBuilder_.dispose();
                        this.serverBuffListBuilder_ = null;
                        this.serverBuffList_ = other.serverBuffList_;
                        this.bitField0_ &= 0xFFFFFFDF;
                        this.serverBuffListBuilder_ = (SceneEntityInfo.alwaysUseFieldBuilders ? this.getServerBuffListFieldBuilder() : null);
                    }
                    else {
                        this.serverBuffListBuilder_.addAllMessages(other.serverBuffList_);
                    }
                }
                switch (other.getEntityCase()) {
                    case AVATAR: {
                        this.mergeAvatar(other.getAvatar());
                        break;
                    }
                    case MONSTER: {
                        this.mergeMonster(other.getMonster());
                        break;
                    }
                    case NPC: {
                        this.mergeNpc(other.getNpc());
                        break;
                    }
                    case GADGET: {
                        this.mergeGadget(other.getGadget());
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
                SceneEntityInfo parsedMessage = null;
                try {
                    parsedMessage = SceneEntityInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneEntityInfo)e.getUnfinishedMessage();
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
            public EntityCase getEntityCase() {
                return EntityCase.forNumber(this.entityCase_);
            }
            
            public Builder clearEntity() {
                this.entityCase_ = 0;
                this.entity_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEntityTypeValue() {
                return this.entityType_;
            }
            
            public Builder setEntityTypeValue(final int value) {
                this.entityType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public ProtEntityTypeOuterClass.ProtEntityType getEntityType() {
                final ProtEntityTypeOuterClass.ProtEntityType result = ProtEntityTypeOuterClass.ProtEntityType.valueOf(this.entityType_);
                return (result == null) ? ProtEntityTypeOuterClass.ProtEntityType.UNRECOGNIZED : result;
            }
            
            public Builder setEntityType(final ProtEntityTypeOuterClass.ProtEntityType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.entityType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityType() {
                this.entityType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getName() {
                final Object ref = this.name_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.name_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getNameBytes() {
                final Object ref = this.name_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.name_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setName(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.name_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearName() {
                this.name_ = SceneEntityInfo.getDefaultInstance().getName();
                this.onChanged();
                return this;
            }
            
            public Builder setNameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.name_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasMotionInfo() {
                return this.motionInfoBuilder_ != null || this.motionInfo_ != null;
            }
            
            @Override
            public MotionInfoOuterClass.MotionInfo getMotionInfo() {
                if (this.motionInfoBuilder_ == null) {
                    return (this.motionInfo_ == null) ? MotionInfoOuterClass.MotionInfo.getDefaultInstance() : this.motionInfo_;
                }
                return this.motionInfoBuilder_.getMessage();
            }
            
            public Builder setMotionInfo(final MotionInfoOuterClass.MotionInfo value) {
                if (this.motionInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.motionInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.motionInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setMotionInfo(final MotionInfoOuterClass.MotionInfo.Builder builderForValue) {
                if (this.motionInfoBuilder_ == null) {
                    this.motionInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.motionInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeMotionInfo(final MotionInfoOuterClass.MotionInfo value) {
                if (this.motionInfoBuilder_ == null) {
                    if (this.motionInfo_ != null) {
                        this.motionInfo_ = MotionInfoOuterClass.MotionInfo.newBuilder(this.motionInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.motionInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.motionInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearMotionInfo() {
                if (this.motionInfoBuilder_ == null) {
                    this.motionInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.motionInfo_ = null;
                    this.motionInfoBuilder_ = null;
                }
                return this;
            }
            
            public MotionInfoOuterClass.MotionInfo.Builder getMotionInfoBuilder() {
                this.onChanged();
                return this.getMotionInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder() {
                if (this.motionInfoBuilder_ != null) {
                    return this.motionInfoBuilder_.getMessageOrBuilder();
                }
                return (this.motionInfo_ == null) ? MotionInfoOuterClass.MotionInfo.getDefaultInstance() : this.motionInfo_;
            }
            
            private SingleFieldBuilderV3<MotionInfoOuterClass.MotionInfo, MotionInfoOuterClass.MotionInfo.Builder, MotionInfoOuterClass.MotionInfoOrBuilder> getMotionInfoFieldBuilder() {
                if (this.motionInfoBuilder_ == null) {
                    this.motionInfoBuilder_ = new SingleFieldBuilderV3<MotionInfoOuterClass.MotionInfo, MotionInfoOuterClass.MotionInfo.Builder, MotionInfoOuterClass.MotionInfoOrBuilder>(this.getMotionInfo(), this.getParentForChildren(), this.isClean());
                    this.motionInfo_ = null;
                }
                return this.motionInfoBuilder_;
            }
            
            private void ensurePropListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.propList_ = new ArrayList<PropPairOuterClass.PropPair>(this.propList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<PropPairOuterClass.PropPair> getPropListList() {
                if (this.propListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends PropPairOuterClass.PropPair>)this.propList_);
                }
                return this.propListBuilder_.getMessageList();
            }
            
            @Override
            public int getPropListCount() {
                if (this.propListBuilder_ == null) {
                    return this.propList_.size();
                }
                return this.propListBuilder_.getCount();
            }
            
            @Override
            public PropPairOuterClass.PropPair getPropList(final int index) {
                if (this.propListBuilder_ == null) {
                    return this.propList_.get(index);
                }
                return this.propListBuilder_.getMessage(index);
            }
            
            public Builder setPropList(final int index, final PropPairOuterClass.PropPair value) {
                if (this.propListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePropListIsMutable();
                    this.propList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPropList(final int index, final PropPairOuterClass.PropPair.Builder builderForValue) {
                if (this.propListBuilder_ == null) {
                    this.ensurePropListIsMutable();
                    this.propList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPropList(final PropPairOuterClass.PropPair value) {
                if (this.propListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePropListIsMutable();
                    this.propList_.add(value);
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPropList(final int index, final PropPairOuterClass.PropPair value) {
                if (this.propListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePropListIsMutable();
                    this.propList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPropList(final PropPairOuterClass.PropPair.Builder builderForValue) {
                if (this.propListBuilder_ == null) {
                    this.ensurePropListIsMutable();
                    this.propList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPropList(final int index, final PropPairOuterClass.PropPair.Builder builderForValue) {
                if (this.propListBuilder_ == null) {
                    this.ensurePropListIsMutable();
                    this.propList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPropList(final Iterable<? extends PropPairOuterClass.PropPair> values) {
                if (this.propListBuilder_ == null) {
                    this.ensurePropListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.propList_);
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPropList() {
                if (this.propListBuilder_ == null) {
                    this.propList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePropList(final int index) {
                if (this.propListBuilder_ == null) {
                    this.ensurePropListIsMutable();
                    this.propList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.propListBuilder_.remove(index);
                }
                return this;
            }
            
            public PropPairOuterClass.PropPair.Builder getPropListBuilder(final int index) {
                return this.getPropListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public PropPairOuterClass.PropPairOrBuilder getPropListOrBuilder(final int index) {
                if (this.propListBuilder_ == null) {
                    return this.propList_.get(index);
                }
                return this.propListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends PropPairOuterClass.PropPairOrBuilder> getPropListOrBuilderList() {
                if (this.propListBuilder_ != null) {
                    return this.propListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends PropPairOuterClass.PropPairOrBuilder>)this.propList_);
            }
            
            public PropPairOuterClass.PropPair.Builder addPropListBuilder() {
                return this.getPropListFieldBuilder().addBuilder(PropPairOuterClass.PropPair.getDefaultInstance());
            }
            
            public PropPairOuterClass.PropPair.Builder addPropListBuilder(final int index) {
                return this.getPropListFieldBuilder().addBuilder(index, PropPairOuterClass.PropPair.getDefaultInstance());
            }
            
            public List<PropPairOuterClass.PropPair.Builder> getPropListBuilderList() {
                return this.getPropListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<PropPairOuterClass.PropPair, PropPairOuterClass.PropPair.Builder, PropPairOuterClass.PropPairOrBuilder> getPropListFieldBuilder() {
                if (this.propListBuilder_ == null) {
                    this.propListBuilder_ = new RepeatedFieldBuilderV3<PropPairOuterClass.PropPair, PropPairOuterClass.PropPair.Builder, PropPairOuterClass.PropPairOrBuilder>(this.propList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.propList_ = null;
                }
                return this.propListBuilder_;
            }
            
            private void ensureFightPropListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.fightPropList_ = new ArrayList<FightPropPairOuterClass.FightPropPair>(this.fightPropList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<FightPropPairOuterClass.FightPropPair> getFightPropListList() {
                if (this.fightPropListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends FightPropPairOuterClass.FightPropPair>)this.fightPropList_);
                }
                return this.fightPropListBuilder_.getMessageList();
            }
            
            @Override
            public int getFightPropListCount() {
                if (this.fightPropListBuilder_ == null) {
                    return this.fightPropList_.size();
                }
                return this.fightPropListBuilder_.getCount();
            }
            
            @Override
            public FightPropPairOuterClass.FightPropPair getFightPropList(final int index) {
                if (this.fightPropListBuilder_ == null) {
                    return this.fightPropList_.get(index);
                }
                return this.fightPropListBuilder_.getMessage(index);
            }
            
            public Builder setFightPropList(final int index, final FightPropPairOuterClass.FightPropPair value) {
                if (this.fightPropListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFightPropListIsMutable();
                    this.fightPropList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.fightPropListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setFightPropList(final int index, final FightPropPairOuterClass.FightPropPair.Builder builderForValue) {
                if (this.fightPropListBuilder_ == null) {
                    this.ensureFightPropListIsMutable();
                    this.fightPropList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fightPropListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addFightPropList(final FightPropPairOuterClass.FightPropPair value) {
                if (this.fightPropListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFightPropListIsMutable();
                    this.fightPropList_.add(value);
                    this.onChanged();
                }
                else {
                    this.fightPropListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addFightPropList(final int index, final FightPropPairOuterClass.FightPropPair value) {
                if (this.fightPropListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureFightPropListIsMutable();
                    this.fightPropList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.fightPropListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addFightPropList(final FightPropPairOuterClass.FightPropPair.Builder builderForValue) {
                if (this.fightPropListBuilder_ == null) {
                    this.ensureFightPropListIsMutable();
                    this.fightPropList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fightPropListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addFightPropList(final int index, final FightPropPairOuterClass.FightPropPair.Builder builderForValue) {
                if (this.fightPropListBuilder_ == null) {
                    this.ensureFightPropListIsMutable();
                    this.fightPropList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.fightPropListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllFightPropList(final Iterable<? extends FightPropPairOuterClass.FightPropPair> values) {
                if (this.fightPropListBuilder_ == null) {
                    this.ensureFightPropListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.fightPropList_);
                    this.onChanged();
                }
                else {
                    this.fightPropListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearFightPropList() {
                if (this.fightPropListBuilder_ == null) {
                    this.fightPropList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.fightPropListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeFightPropList(final int index) {
                if (this.fightPropListBuilder_ == null) {
                    this.ensureFightPropListIsMutable();
                    this.fightPropList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.fightPropListBuilder_.remove(index);
                }
                return this;
            }
            
            public FightPropPairOuterClass.FightPropPair.Builder getFightPropListBuilder(final int index) {
                return this.getFightPropListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public FightPropPairOuterClass.FightPropPairOrBuilder getFightPropListOrBuilder(final int index) {
                if (this.fightPropListBuilder_ == null) {
                    return this.fightPropList_.get(index);
                }
                return this.fightPropListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends FightPropPairOuterClass.FightPropPairOrBuilder> getFightPropListOrBuilderList() {
                if (this.fightPropListBuilder_ != null) {
                    return this.fightPropListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends FightPropPairOuterClass.FightPropPairOrBuilder>)this.fightPropList_);
            }
            
            public FightPropPairOuterClass.FightPropPair.Builder addFightPropListBuilder() {
                return this.getFightPropListFieldBuilder().addBuilder(FightPropPairOuterClass.FightPropPair.getDefaultInstance());
            }
            
            public FightPropPairOuterClass.FightPropPair.Builder addFightPropListBuilder(final int index) {
                return this.getFightPropListFieldBuilder().addBuilder(index, FightPropPairOuterClass.FightPropPair.getDefaultInstance());
            }
            
            public List<FightPropPairOuterClass.FightPropPair.Builder> getFightPropListBuilderList() {
                return this.getFightPropListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<FightPropPairOuterClass.FightPropPair, FightPropPairOuterClass.FightPropPair.Builder, FightPropPairOuterClass.FightPropPairOrBuilder> getFightPropListFieldBuilder() {
                if (this.fightPropListBuilder_ == null) {
                    this.fightPropListBuilder_ = new RepeatedFieldBuilderV3<FightPropPairOuterClass.FightPropPair, FightPropPairOuterClass.FightPropPair.Builder, FightPropPairOuterClass.FightPropPairOrBuilder>(this.fightPropList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.fightPropList_ = null;
                }
                return this.fightPropListBuilder_;
            }
            
            @Override
            public int getLifeState() {
                return this.lifeState_;
            }
            
            public Builder setLifeState(final int value) {
                this.lifeState_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLifeState() {
                this.lifeState_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureAnimatorParaListIsMutable() {
                if ((this.bitField0_ & 0x4) == 0x0) {
                    this.animatorParaList_ = new ArrayList<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair>(this.animatorParaList_);
                    this.bitField0_ |= 0x4;
                }
            }
            
            @Override
            public List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> getAnimatorParaListList() {
                if (this.animatorParaListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair>)this.animatorParaList_);
                }
                return this.animatorParaListBuilder_.getMessageList();
            }
            
            @Override
            public int getAnimatorParaListCount() {
                if (this.animatorParaListBuilder_ == null) {
                    return this.animatorParaList_.size();
                }
                return this.animatorParaListBuilder_.getCount();
            }
            
            @Override
            public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getAnimatorParaList(final int index) {
                if (this.animatorParaListBuilder_ == null) {
                    return this.animatorParaList_.get(index);
                }
                return this.animatorParaListBuilder_.getMessage(index);
            }
            
            public Builder setAnimatorParaList(final int index, final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair value) {
                if (this.animatorParaListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnimatorParaListIsMutable();
                    this.animatorParaList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.animatorParaListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setAnimatorParaList(final int index, final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder builderForValue) {
                if (this.animatorParaListBuilder_ == null) {
                    this.ensureAnimatorParaListIsMutable();
                    this.animatorParaList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.animatorParaListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAnimatorParaList(final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair value) {
                if (this.animatorParaListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnimatorParaListIsMutable();
                    this.animatorParaList_.add(value);
                    this.onChanged();
                }
                else {
                    this.animatorParaListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addAnimatorParaList(final int index, final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair value) {
                if (this.animatorParaListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureAnimatorParaListIsMutable();
                    this.animatorParaList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.animatorParaListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addAnimatorParaList(final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder builderForValue) {
                if (this.animatorParaListBuilder_ == null) {
                    this.ensureAnimatorParaListIsMutable();
                    this.animatorParaList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.animatorParaListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addAnimatorParaList(final int index, final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder builderForValue) {
                if (this.animatorParaListBuilder_ == null) {
                    this.ensureAnimatorParaListIsMutable();
                    this.animatorParaList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.animatorParaListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllAnimatorParaList(final Iterable<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> values) {
                if (this.animatorParaListBuilder_ == null) {
                    this.ensureAnimatorParaListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.animatorParaList_);
                    this.onChanged();
                }
                else {
                    this.animatorParaListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearAnimatorParaList() {
                if (this.animatorParaListBuilder_ == null) {
                    this.animatorParaList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    this.onChanged();
                }
                else {
                    this.animatorParaListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeAnimatorParaList(final int index) {
                if (this.animatorParaListBuilder_ == null) {
                    this.ensureAnimatorParaListIsMutable();
                    this.animatorParaList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.animatorParaListBuilder_.remove(index);
                }
                return this;
            }
            
            public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder getAnimatorParaListBuilder(final int index) {
                return this.getAnimatorParaListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder getAnimatorParaListOrBuilder(final int index) {
                if (this.animatorParaListBuilder_ == null) {
                    return this.animatorParaList_.get(index);
                }
                return this.animatorParaListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> getAnimatorParaListOrBuilderList() {
                if (this.animatorParaListBuilder_ != null) {
                    return this.animatorParaListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder>)this.animatorParaList_);
            }
            
            public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder addAnimatorParaListBuilder() {
                return this.getAnimatorParaListFieldBuilder().addBuilder(AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.getDefaultInstance());
            }
            
            public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder addAnimatorParaListBuilder(final int index) {
                return this.getAnimatorParaListFieldBuilder().addBuilder(index, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.getDefaultInstance());
            }
            
            public List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder> getAnimatorParaListBuilderList() {
                return this.getAnimatorParaListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> getAnimatorParaListFieldBuilder() {
                if (this.animatorParaListBuilder_ == null) {
                    this.animatorParaListBuilder_ = new RepeatedFieldBuilderV3<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder>(this.animatorParaList_, (this.bitField0_ & 0x4) != 0x0, this.getParentForChildren(), this.isClean());
                    this.animatorParaList_ = null;
                }
                return this.animatorParaListBuilder_;
            }
            
            @Override
            public int getLastMoveSceneTimeMs() {
                return this.lastMoveSceneTimeMs_;
            }
            
            public Builder setLastMoveSceneTimeMs(final int value) {
                this.lastMoveSceneTimeMs_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLastMoveSceneTimeMs() {
                this.lastMoveSceneTimeMs_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLastMoveReliableSeq() {
                return this.lastMoveReliableSeq_;
            }
            
            public Builder setLastMoveReliableSeq(final int value) {
                this.lastMoveReliableSeq_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLastMoveReliableSeq() {
                this.lastMoveReliableSeq_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasEntityClientData() {
                return this.entityClientDataBuilder_ != null || this.entityClientData_ != null;
            }
            
            @Override
            public EntityClientDataOuterClass.EntityClientData getEntityClientData() {
                if (this.entityClientDataBuilder_ == null) {
                    return (this.entityClientData_ == null) ? EntityClientDataOuterClass.EntityClientData.getDefaultInstance() : this.entityClientData_;
                }
                return this.entityClientDataBuilder_.getMessage();
            }
            
            public Builder setEntityClientData(final EntityClientDataOuterClass.EntityClientData value) {
                if (this.entityClientDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.entityClientData_ = value;
                    this.onChanged();
                }
                else {
                    this.entityClientDataBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setEntityClientData(final EntityClientDataOuterClass.EntityClientData.Builder builderForValue) {
                if (this.entityClientDataBuilder_ == null) {
                    this.entityClientData_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.entityClientDataBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeEntityClientData(final EntityClientDataOuterClass.EntityClientData value) {
                if (this.entityClientDataBuilder_ == null) {
                    if (this.entityClientData_ != null) {
                        this.entityClientData_ = EntityClientDataOuterClass.EntityClientData.newBuilder(this.entityClientData_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.entityClientData_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.entityClientDataBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearEntityClientData() {
                if (this.entityClientDataBuilder_ == null) {
                    this.entityClientData_ = null;
                    this.onChanged();
                }
                else {
                    this.entityClientData_ = null;
                    this.entityClientDataBuilder_ = null;
                }
                return this;
            }
            
            public EntityClientDataOuterClass.EntityClientData.Builder getEntityClientDataBuilder() {
                this.onChanged();
                return this.getEntityClientDataFieldBuilder().getBuilder();
            }
            
            @Override
            public EntityClientDataOuterClass.EntityClientDataOrBuilder getEntityClientDataOrBuilder() {
                if (this.entityClientDataBuilder_ != null) {
                    return this.entityClientDataBuilder_.getMessageOrBuilder();
                }
                return (this.entityClientData_ == null) ? EntityClientDataOuterClass.EntityClientData.getDefaultInstance() : this.entityClientData_;
            }
            
            private SingleFieldBuilderV3<EntityClientDataOuterClass.EntityClientData, EntityClientDataOuterClass.EntityClientData.Builder, EntityClientDataOuterClass.EntityClientDataOrBuilder> getEntityClientDataFieldBuilder() {
                if (this.entityClientDataBuilder_ == null) {
                    this.entityClientDataBuilder_ = new SingleFieldBuilderV3<EntityClientDataOuterClass.EntityClientData, EntityClientDataOuterClass.EntityClientData.Builder, EntityClientDataOuterClass.EntityClientDataOrBuilder>(this.getEntityClientData(), this.getParentForChildren(), this.isClean());
                    this.entityClientData_ = null;
                }
                return this.entityClientDataBuilder_;
            }
            
            private void ensureEntityEnvironmentInfoListIsMutable() {
                if ((this.bitField0_ & 0x8) == 0x0) {
                    this.entityEnvironmentInfoList_ = new ArrayList<EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo>(this.entityEnvironmentInfoList_);
                    this.bitField0_ |= 0x8;
                }
            }
            
            @Override
            public List<EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo> getEntityEnvironmentInfoListList() {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo>)this.entityEnvironmentInfoList_);
                }
                return this.entityEnvironmentInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getEntityEnvironmentInfoListCount() {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    return this.entityEnvironmentInfoList_.size();
                }
                return this.entityEnvironmentInfoListBuilder_.getCount();
            }
            
            @Override
            public EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo getEntityEnvironmentInfoList(final int index) {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    return this.entityEnvironmentInfoList_.get(index);
                }
                return this.entityEnvironmentInfoListBuilder_.getMessage(index);
            }
            
            public Builder setEntityEnvironmentInfoList(final int index, final EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo value) {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEntityEnvironmentInfoListIsMutable();
                    this.entityEnvironmentInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.entityEnvironmentInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setEntityEnvironmentInfoList(final int index, final EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder builderForValue) {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    this.ensureEntityEnvironmentInfoListIsMutable();
                    this.entityEnvironmentInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.entityEnvironmentInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addEntityEnvironmentInfoList(final EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo value) {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEntityEnvironmentInfoListIsMutable();
                    this.entityEnvironmentInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.entityEnvironmentInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addEntityEnvironmentInfoList(final int index, final EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo value) {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureEntityEnvironmentInfoListIsMutable();
                    this.entityEnvironmentInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.entityEnvironmentInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addEntityEnvironmentInfoList(final EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder builderForValue) {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    this.ensureEntityEnvironmentInfoListIsMutable();
                    this.entityEnvironmentInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.entityEnvironmentInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addEntityEnvironmentInfoList(final int index, final EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder builderForValue) {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    this.ensureEntityEnvironmentInfoListIsMutable();
                    this.entityEnvironmentInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.entityEnvironmentInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllEntityEnvironmentInfoList(final Iterable<? extends EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo> values) {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    this.ensureEntityEnvironmentInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.entityEnvironmentInfoList_);
                    this.onChanged();
                }
                else {
                    this.entityEnvironmentInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearEntityEnvironmentInfoList() {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    this.entityEnvironmentInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    this.onChanged();
                }
                else {
                    this.entityEnvironmentInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeEntityEnvironmentInfoList(final int index) {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    this.ensureEntityEnvironmentInfoListIsMutable();
                    this.entityEnvironmentInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.entityEnvironmentInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder getEntityEnvironmentInfoListBuilder(final int index) {
                return this.getEntityEnvironmentInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public EntityEnvironmentInfoOuterClass.EntityEnvironmentInfoOrBuilder getEntityEnvironmentInfoListOrBuilder(final int index) {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    return this.entityEnvironmentInfoList_.get(index);
                }
                return this.entityEnvironmentInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends EntityEnvironmentInfoOuterClass.EntityEnvironmentInfoOrBuilder> getEntityEnvironmentInfoListOrBuilderList() {
                if (this.entityEnvironmentInfoListBuilder_ != null) {
                    return this.entityEnvironmentInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends EntityEnvironmentInfoOuterClass.EntityEnvironmentInfoOrBuilder>)this.entityEnvironmentInfoList_);
            }
            
            public EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder addEntityEnvironmentInfoListBuilder() {
                return this.getEntityEnvironmentInfoListFieldBuilder().addBuilder(EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.getDefaultInstance());
            }
            
            public EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder addEntityEnvironmentInfoListBuilder(final int index) {
                return this.getEntityEnvironmentInfoListFieldBuilder().addBuilder(index, EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.getDefaultInstance());
            }
            
            public List<EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder> getEntityEnvironmentInfoListBuilderList() {
                return this.getEntityEnvironmentInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo, EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder, EntityEnvironmentInfoOuterClass.EntityEnvironmentInfoOrBuilder> getEntityEnvironmentInfoListFieldBuilder() {
                if (this.entityEnvironmentInfoListBuilder_ == null) {
                    this.entityEnvironmentInfoListBuilder_ = new RepeatedFieldBuilderV3<EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo, EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo.Builder, EntityEnvironmentInfoOuterClass.EntityEnvironmentInfoOrBuilder>(this.entityEnvironmentInfoList_, (this.bitField0_ & 0x8) != 0x0, this.getParentForChildren(), this.isClean());
                    this.entityEnvironmentInfoList_ = null;
                }
                return this.entityEnvironmentInfoListBuilder_;
            }
            
            @Override
            public boolean hasEntityAuthorityInfo() {
                return this.entityAuthorityInfoBuilder_ != null || this.entityAuthorityInfo_ != null;
            }
            
            @Override
            public EntityAuthorityInfoOuterClass.EntityAuthorityInfo getEntityAuthorityInfo() {
                if (this.entityAuthorityInfoBuilder_ == null) {
                    return (this.entityAuthorityInfo_ == null) ? EntityAuthorityInfoOuterClass.EntityAuthorityInfo.getDefaultInstance() : this.entityAuthorityInfo_;
                }
                return this.entityAuthorityInfoBuilder_.getMessage();
            }
            
            public Builder setEntityAuthorityInfo(final EntityAuthorityInfoOuterClass.EntityAuthorityInfo value) {
                if (this.entityAuthorityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.entityAuthorityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.entityAuthorityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setEntityAuthorityInfo(final EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder builderForValue) {
                if (this.entityAuthorityInfoBuilder_ == null) {
                    this.entityAuthorityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.entityAuthorityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeEntityAuthorityInfo(final EntityAuthorityInfoOuterClass.EntityAuthorityInfo value) {
                if (this.entityAuthorityInfoBuilder_ == null) {
                    if (this.entityAuthorityInfo_ != null) {
                        this.entityAuthorityInfo_ = EntityAuthorityInfoOuterClass.EntityAuthorityInfo.newBuilder(this.entityAuthorityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.entityAuthorityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.entityAuthorityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearEntityAuthorityInfo() {
                if (this.entityAuthorityInfoBuilder_ == null) {
                    this.entityAuthorityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.entityAuthorityInfo_ = null;
                    this.entityAuthorityInfoBuilder_ = null;
                }
                return this;
            }
            
            public EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder getEntityAuthorityInfoBuilder() {
                this.onChanged();
                return this.getEntityAuthorityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder getEntityAuthorityInfoOrBuilder() {
                if (this.entityAuthorityInfoBuilder_ != null) {
                    return this.entityAuthorityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.entityAuthorityInfo_ == null) ? EntityAuthorityInfoOuterClass.EntityAuthorityInfo.getDefaultInstance() : this.entityAuthorityInfo_;
            }
            
            private SingleFieldBuilderV3<EntityAuthorityInfoOuterClass.EntityAuthorityInfo, EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder, EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder> getEntityAuthorityInfoFieldBuilder() {
                if (this.entityAuthorityInfoBuilder_ == null) {
                    this.entityAuthorityInfoBuilder_ = new SingleFieldBuilderV3<EntityAuthorityInfoOuterClass.EntityAuthorityInfo, EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder, EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder>(this.getEntityAuthorityInfo(), this.getParentForChildren(), this.isClean());
                    this.entityAuthorityInfo_ = null;
                }
                return this.entityAuthorityInfoBuilder_;
            }
            
            private void ensureTagListIsMutable() {
                if ((this.bitField0_ & 0x10) == 0x0) {
                    this.tagList_ = new LazyStringArrayList(this.tagList_);
                    this.bitField0_ |= 0x10;
                }
            }
            
            @Override
            public ProtocolStringList getTagListList() {
                return this.tagList_.getUnmodifiableView();
            }
            
            @Override
            public int getTagListCount() {
                return this.tagList_.size();
            }
            
            @Override
            public String getTagList(final int index) {
                return this.tagList_.get(index);
            }
            
            @Override
            public ByteString getTagListBytes(final int index) {
                return this.tagList_.getByteString(index);
            }
            
            public Builder setTagList(final int index, final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureTagListIsMutable();
                this.tagList_.set(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addTagList(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ensureTagListIsMutable();
                this.tagList_.add(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllTagList(final Iterable<String> values) {
                this.ensureTagListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.tagList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearTagList() {
                this.tagList_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= 0xFFFFFFEF;
                this.onChanged();
                return this;
            }
            
            public Builder addTagListBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.ensureTagListIsMutable();
                this.tagList_.add(value);
                this.onChanged();
                return this;
            }
            
            private void ensureServerBuffListIsMutable() {
                if ((this.bitField0_ & 0x20) == 0x0) {
                    this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>(this.serverBuffList_);
                    this.bitField0_ |= 0x20;
                }
            }
            
            @Override
            public List<ServerBuffOuterClass.ServerBuff> getServerBuffListList() {
                if (this.serverBuffListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                }
                return this.serverBuffListBuilder_.getMessageList();
            }
            
            @Override
            public int getServerBuffListCount() {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.size();
                }
                return this.serverBuffListBuilder_.getCount();
            }
            
            @Override
            public ServerBuffOuterClass.ServerBuff getServerBuffList(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.get(index);
                }
                return this.serverBuffListBuilder_.getMessage(index);
            }
            
            public Builder setServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addServerBuffList(final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff value) {
                if (this.serverBuffListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addServerBuffList(final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addServerBuffList(final int index, final ServerBuffOuterClass.ServerBuff.Builder builderForValue) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllServerBuffList(final Iterable<? extends ServerBuffOuterClass.ServerBuff> values) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.serverBuffList_);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearServerBuffList() {
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFDF;
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeServerBuffList(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    this.ensureServerBuffListIsMutable();
                    this.serverBuffList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.serverBuffListBuilder_.remove(index);
                }
                return this;
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder getServerBuffListBuilder(final int index) {
                return this.getServerBuffListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int index) {
                if (this.serverBuffListBuilder_ == null) {
                    return this.serverBuffList_.get(index);
                }
                return this.serverBuffListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList() {
                if (this.serverBuffListBuilder_ != null) {
                    return this.serverBuffListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuffOrBuilder>)this.serverBuffList_);
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder addServerBuffListBuilder() {
                return this.getServerBuffListFieldBuilder().addBuilder(ServerBuffOuterClass.ServerBuff.getDefaultInstance());
            }
            
            public ServerBuffOuterClass.ServerBuff.Builder addServerBuffListBuilder(final int index) {
                return this.getServerBuffListFieldBuilder().addBuilder(index, ServerBuffOuterClass.ServerBuff.getDefaultInstance());
            }
            
            public List<ServerBuffOuterClass.ServerBuff.Builder> getServerBuffListBuilderList() {
                return this.getServerBuffListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListFieldBuilder() {
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffListBuilder_ = new RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder>(this.serverBuffList_, (this.bitField0_ & 0x20) != 0x0, this.getParentForChildren(), this.isClean());
                    this.serverBuffList_ = null;
                }
                return this.serverBuffListBuilder_;
            }
            
            @Override
            public boolean hasAvatar() {
                return this.entityCase_ == 10;
            }
            
            @Override
            public SceneAvatarInfoOuterClass.SceneAvatarInfo getAvatar() {
                if (this.avatarBuilder_ == null) {
                    if (this.entityCase_ == 10) {
                        return (SceneAvatarInfoOuterClass.SceneAvatarInfo)this.entity_;
                    }
                    return SceneAvatarInfoOuterClass.SceneAvatarInfo.getDefaultInstance();
                }
                else {
                    if (this.entityCase_ == 10) {
                        return this.avatarBuilder_.getMessage();
                    }
                    return SceneAvatarInfoOuterClass.SceneAvatarInfo.getDefaultInstance();
                }
            }
            
            public Builder setAvatar(final SceneAvatarInfoOuterClass.SceneAvatarInfo value) {
                if (this.avatarBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.entity_ = value;
                    this.onChanged();
                }
                else {
                    this.avatarBuilder_.setMessage(value);
                }
                this.entityCase_ = 10;
                return this;
            }
            
            public Builder setAvatar(final SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder builderForValue) {
                if (this.avatarBuilder_ == null) {
                    this.entity_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.avatarBuilder_.setMessage(builderForValue.build());
                }
                this.entityCase_ = 10;
                return this;
            }
            
            public Builder mergeAvatar(final SceneAvatarInfoOuterClass.SceneAvatarInfo value) {
                if (this.avatarBuilder_ == null) {
                    if (this.entityCase_ == 10 && this.entity_ != SceneAvatarInfoOuterClass.SceneAvatarInfo.getDefaultInstance()) {
                        this.entity_ = SceneAvatarInfoOuterClass.SceneAvatarInfo.newBuilder((SceneAvatarInfoOuterClass.SceneAvatarInfo)this.entity_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.entity_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.entityCase_ == 10) {
                        this.avatarBuilder_.mergeFrom(value);
                    }
                    this.avatarBuilder_.setMessage(value);
                }
                this.entityCase_ = 10;
                return this;
            }
            
            public Builder clearAvatar() {
                if (this.avatarBuilder_ == null) {
                    if (this.entityCase_ == 10) {
                        this.entityCase_ = 0;
                        this.entity_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.entityCase_ == 10) {
                        this.entityCase_ = 0;
                        this.entity_ = null;
                    }
                    this.avatarBuilder_.clear();
                }
                return this;
            }
            
            public SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder getAvatarBuilder() {
                return this.getAvatarFieldBuilder().getBuilder();
            }
            
            @Override
            public SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder getAvatarOrBuilder() {
                if (this.entityCase_ == 10 && this.avatarBuilder_ != null) {
                    return this.avatarBuilder_.getMessageOrBuilder();
                }
                if (this.entityCase_ == 10) {
                    return (SceneAvatarInfoOuterClass.SceneAvatarInfo)this.entity_;
                }
                return SceneAvatarInfoOuterClass.SceneAvatarInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<SceneAvatarInfoOuterClass.SceneAvatarInfo, SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder, SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder> getAvatarFieldBuilder() {
                if (this.avatarBuilder_ == null) {
                    if (this.entityCase_ != 10) {
                        this.entity_ = SceneAvatarInfoOuterClass.SceneAvatarInfo.getDefaultInstance();
                    }
                    this.avatarBuilder_ = new SingleFieldBuilderV3<SceneAvatarInfoOuterClass.SceneAvatarInfo, SceneAvatarInfoOuterClass.SceneAvatarInfo.Builder, SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder>((SceneAvatarInfoOuterClass.SceneAvatarInfo)this.entity_, this.getParentForChildren(), this.isClean());
                    this.entity_ = null;
                }
                this.entityCase_ = 10;
                this.onChanged();
                return this.avatarBuilder_;
            }
            
            @Override
            public boolean hasMonster() {
                return this.entityCase_ == 11;
            }
            
            @Override
            public SceneMonsterInfoOuterClass.SceneMonsterInfo getMonster() {
                if (this.monsterBuilder_ == null) {
                    if (this.entityCase_ == 11) {
                        return (SceneMonsterInfoOuterClass.SceneMonsterInfo)this.entity_;
                    }
                    return SceneMonsterInfoOuterClass.SceneMonsterInfo.getDefaultInstance();
                }
                else {
                    if (this.entityCase_ == 11) {
                        return this.monsterBuilder_.getMessage();
                    }
                    return SceneMonsterInfoOuterClass.SceneMonsterInfo.getDefaultInstance();
                }
            }
            
            public Builder setMonster(final SceneMonsterInfoOuterClass.SceneMonsterInfo value) {
                if (this.monsterBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.entity_ = value;
                    this.onChanged();
                }
                else {
                    this.monsterBuilder_.setMessage(value);
                }
                this.entityCase_ = 11;
                return this;
            }
            
            public Builder setMonster(final SceneMonsterInfoOuterClass.SceneMonsterInfo.Builder builderForValue) {
                if (this.monsterBuilder_ == null) {
                    this.entity_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.monsterBuilder_.setMessage(builderForValue.build());
                }
                this.entityCase_ = 11;
                return this;
            }
            
            public Builder mergeMonster(final SceneMonsterInfoOuterClass.SceneMonsterInfo value) {
                if (this.monsterBuilder_ == null) {
                    if (this.entityCase_ == 11 && this.entity_ != SceneMonsterInfoOuterClass.SceneMonsterInfo.getDefaultInstance()) {
                        this.entity_ = SceneMonsterInfoOuterClass.SceneMonsterInfo.newBuilder((SceneMonsterInfoOuterClass.SceneMonsterInfo)this.entity_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.entity_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.entityCase_ == 11) {
                        this.monsterBuilder_.mergeFrom(value);
                    }
                    this.monsterBuilder_.setMessage(value);
                }
                this.entityCase_ = 11;
                return this;
            }
            
            public Builder clearMonster() {
                if (this.monsterBuilder_ == null) {
                    if (this.entityCase_ == 11) {
                        this.entityCase_ = 0;
                        this.entity_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.entityCase_ == 11) {
                        this.entityCase_ = 0;
                        this.entity_ = null;
                    }
                    this.monsterBuilder_.clear();
                }
                return this;
            }
            
            public SceneMonsterInfoOuterClass.SceneMonsterInfo.Builder getMonsterBuilder() {
                return this.getMonsterFieldBuilder().getBuilder();
            }
            
            @Override
            public SceneMonsterInfoOuterClass.SceneMonsterInfoOrBuilder getMonsterOrBuilder() {
                if (this.entityCase_ == 11 && this.monsterBuilder_ != null) {
                    return this.monsterBuilder_.getMessageOrBuilder();
                }
                if (this.entityCase_ == 11) {
                    return (SceneMonsterInfoOuterClass.SceneMonsterInfo)this.entity_;
                }
                return SceneMonsterInfoOuterClass.SceneMonsterInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<SceneMonsterInfoOuterClass.SceneMonsterInfo, SceneMonsterInfoOuterClass.SceneMonsterInfo.Builder, SceneMonsterInfoOuterClass.SceneMonsterInfoOrBuilder> getMonsterFieldBuilder() {
                if (this.monsterBuilder_ == null) {
                    if (this.entityCase_ != 11) {
                        this.entity_ = SceneMonsterInfoOuterClass.SceneMonsterInfo.getDefaultInstance();
                    }
                    this.monsterBuilder_ = new SingleFieldBuilderV3<SceneMonsterInfoOuterClass.SceneMonsterInfo, SceneMonsterInfoOuterClass.SceneMonsterInfo.Builder, SceneMonsterInfoOuterClass.SceneMonsterInfoOrBuilder>((SceneMonsterInfoOuterClass.SceneMonsterInfo)this.entity_, this.getParentForChildren(), this.isClean());
                    this.entity_ = null;
                }
                this.entityCase_ = 11;
                this.onChanged();
                return this.monsterBuilder_;
            }
            
            @Override
            public boolean hasNpc() {
                return this.entityCase_ == 12;
            }
            
            @Override
            public SceneNpcInfoOuterClass.SceneNpcInfo getNpc() {
                if (this.npcBuilder_ == null) {
                    if (this.entityCase_ == 12) {
                        return (SceneNpcInfoOuterClass.SceneNpcInfo)this.entity_;
                    }
                    return SceneNpcInfoOuterClass.SceneNpcInfo.getDefaultInstance();
                }
                else {
                    if (this.entityCase_ == 12) {
                        return this.npcBuilder_.getMessage();
                    }
                    return SceneNpcInfoOuterClass.SceneNpcInfo.getDefaultInstance();
                }
            }
            
            public Builder setNpc(final SceneNpcInfoOuterClass.SceneNpcInfo value) {
                if (this.npcBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.entity_ = value;
                    this.onChanged();
                }
                else {
                    this.npcBuilder_.setMessage(value);
                }
                this.entityCase_ = 12;
                return this;
            }
            
            public Builder setNpc(final SceneNpcInfoOuterClass.SceneNpcInfo.Builder builderForValue) {
                if (this.npcBuilder_ == null) {
                    this.entity_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.npcBuilder_.setMessage(builderForValue.build());
                }
                this.entityCase_ = 12;
                return this;
            }
            
            public Builder mergeNpc(final SceneNpcInfoOuterClass.SceneNpcInfo value) {
                if (this.npcBuilder_ == null) {
                    if (this.entityCase_ == 12 && this.entity_ != SceneNpcInfoOuterClass.SceneNpcInfo.getDefaultInstance()) {
                        this.entity_ = SceneNpcInfoOuterClass.SceneNpcInfo.newBuilder((SceneNpcInfoOuterClass.SceneNpcInfo)this.entity_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.entity_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.entityCase_ == 12) {
                        this.npcBuilder_.mergeFrom(value);
                    }
                    this.npcBuilder_.setMessage(value);
                }
                this.entityCase_ = 12;
                return this;
            }
            
            public Builder clearNpc() {
                if (this.npcBuilder_ == null) {
                    if (this.entityCase_ == 12) {
                        this.entityCase_ = 0;
                        this.entity_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.entityCase_ == 12) {
                        this.entityCase_ = 0;
                        this.entity_ = null;
                    }
                    this.npcBuilder_.clear();
                }
                return this;
            }
            
            public SceneNpcInfoOuterClass.SceneNpcInfo.Builder getNpcBuilder() {
                return this.getNpcFieldBuilder().getBuilder();
            }
            
            @Override
            public SceneNpcInfoOuterClass.SceneNpcInfoOrBuilder getNpcOrBuilder() {
                if (this.entityCase_ == 12 && this.npcBuilder_ != null) {
                    return this.npcBuilder_.getMessageOrBuilder();
                }
                if (this.entityCase_ == 12) {
                    return (SceneNpcInfoOuterClass.SceneNpcInfo)this.entity_;
                }
                return SceneNpcInfoOuterClass.SceneNpcInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<SceneNpcInfoOuterClass.SceneNpcInfo, SceneNpcInfoOuterClass.SceneNpcInfo.Builder, SceneNpcInfoOuterClass.SceneNpcInfoOrBuilder> getNpcFieldBuilder() {
                if (this.npcBuilder_ == null) {
                    if (this.entityCase_ != 12) {
                        this.entity_ = SceneNpcInfoOuterClass.SceneNpcInfo.getDefaultInstance();
                    }
                    this.npcBuilder_ = new SingleFieldBuilderV3<SceneNpcInfoOuterClass.SceneNpcInfo, SceneNpcInfoOuterClass.SceneNpcInfo.Builder, SceneNpcInfoOuterClass.SceneNpcInfoOrBuilder>((SceneNpcInfoOuterClass.SceneNpcInfo)this.entity_, this.getParentForChildren(), this.isClean());
                    this.entity_ = null;
                }
                this.entityCase_ = 12;
                this.onChanged();
                return this.npcBuilder_;
            }
            
            @Override
            public boolean hasGadget() {
                return this.entityCase_ == 13;
            }
            
            @Override
            public SceneGadgetInfoOuterClass.SceneGadgetInfo getGadget() {
                if (this.gadgetBuilder_ == null) {
                    if (this.entityCase_ == 13) {
                        return (SceneGadgetInfoOuterClass.SceneGadgetInfo)this.entity_;
                    }
                    return SceneGadgetInfoOuterClass.SceneGadgetInfo.getDefaultInstance();
                }
                else {
                    if (this.entityCase_ == 13) {
                        return this.gadgetBuilder_.getMessage();
                    }
                    return SceneGadgetInfoOuterClass.SceneGadgetInfo.getDefaultInstance();
                }
            }
            
            public Builder setGadget(final SceneGadgetInfoOuterClass.SceneGadgetInfo value) {
                if (this.gadgetBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.entity_ = value;
                    this.onChanged();
                }
                else {
                    this.gadgetBuilder_.setMessage(value);
                }
                this.entityCase_ = 13;
                return this;
            }
            
            public Builder setGadget(final SceneGadgetInfoOuterClass.SceneGadgetInfo.Builder builderForValue) {
                if (this.gadgetBuilder_ == null) {
                    this.entity_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.gadgetBuilder_.setMessage(builderForValue.build());
                }
                this.entityCase_ = 13;
                return this;
            }
            
            public Builder mergeGadget(final SceneGadgetInfoOuterClass.SceneGadgetInfo value) {
                if (this.gadgetBuilder_ == null) {
                    if (this.entityCase_ == 13 && this.entity_ != SceneGadgetInfoOuterClass.SceneGadgetInfo.getDefaultInstance()) {
                        this.entity_ = SceneGadgetInfoOuterClass.SceneGadgetInfo.newBuilder((SceneGadgetInfoOuterClass.SceneGadgetInfo)this.entity_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.entity_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.entityCase_ == 13) {
                        this.gadgetBuilder_.mergeFrom(value);
                    }
                    this.gadgetBuilder_.setMessage(value);
                }
                this.entityCase_ = 13;
                return this;
            }
            
            public Builder clearGadget() {
                if (this.gadgetBuilder_ == null) {
                    if (this.entityCase_ == 13) {
                        this.entityCase_ = 0;
                        this.entity_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.entityCase_ == 13) {
                        this.entityCase_ = 0;
                        this.entity_ = null;
                    }
                    this.gadgetBuilder_.clear();
                }
                return this;
            }
            
            public SceneGadgetInfoOuterClass.SceneGadgetInfo.Builder getGadgetBuilder() {
                return this.getGadgetFieldBuilder().getBuilder();
            }
            
            @Override
            public SceneGadgetInfoOuterClass.SceneGadgetInfoOrBuilder getGadgetOrBuilder() {
                if (this.entityCase_ == 13 && this.gadgetBuilder_ != null) {
                    return this.gadgetBuilder_.getMessageOrBuilder();
                }
                if (this.entityCase_ == 13) {
                    return (SceneGadgetInfoOuterClass.SceneGadgetInfo)this.entity_;
                }
                return SceneGadgetInfoOuterClass.SceneGadgetInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<SceneGadgetInfoOuterClass.SceneGadgetInfo, SceneGadgetInfoOuterClass.SceneGadgetInfo.Builder, SceneGadgetInfoOuterClass.SceneGadgetInfoOrBuilder> getGadgetFieldBuilder() {
                if (this.gadgetBuilder_ == null) {
                    if (this.entityCase_ != 13) {
                        this.entity_ = SceneGadgetInfoOuterClass.SceneGadgetInfo.getDefaultInstance();
                    }
                    this.gadgetBuilder_ = new SingleFieldBuilderV3<SceneGadgetInfoOuterClass.SceneGadgetInfo, SceneGadgetInfoOuterClass.SceneGadgetInfo.Builder, SceneGadgetInfoOuterClass.SceneGadgetInfoOrBuilder>((SceneGadgetInfoOuterClass.SceneGadgetInfo)this.entity_, this.getParentForChildren(), this.isClean());
                    this.entity_ = null;
                }
                this.entityCase_ = 13;
                this.onChanged();
                return this.gadgetBuilder_;
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
    
    public interface SceneEntityInfoOrBuilder extends MessageOrBuilder
    {
        int getEntityTypeValue();
        
        ProtEntityTypeOuterClass.ProtEntityType getEntityType();
        
        int getEntityId();
        
        String getName();
        
        ByteString getNameBytes();
        
        boolean hasMotionInfo();
        
        MotionInfoOuterClass.MotionInfo getMotionInfo();
        
        MotionInfoOuterClass.MotionInfoOrBuilder getMotionInfoOrBuilder();
        
        List<PropPairOuterClass.PropPair> getPropListList();
        
        PropPairOuterClass.PropPair getPropList(final int p0);
        
        int getPropListCount();
        
        List<? extends PropPairOuterClass.PropPairOrBuilder> getPropListOrBuilderList();
        
        PropPairOuterClass.PropPairOrBuilder getPropListOrBuilder(final int p0);
        
        List<FightPropPairOuterClass.FightPropPair> getFightPropListList();
        
        FightPropPairOuterClass.FightPropPair getFightPropList(final int p0);
        
        int getFightPropListCount();
        
        List<? extends FightPropPairOuterClass.FightPropPairOrBuilder> getFightPropListOrBuilderList();
        
        FightPropPairOuterClass.FightPropPairOrBuilder getFightPropListOrBuilder(final int p0);
        
        int getLifeState();
        
        List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> getAnimatorParaListList();
        
        AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getAnimatorParaList(final int p0);
        
        int getAnimatorParaListCount();
        
        List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> getAnimatorParaListOrBuilderList();
        
        AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder getAnimatorParaListOrBuilder(final int p0);
        
        int getLastMoveSceneTimeMs();
        
        int getLastMoveReliableSeq();
        
        boolean hasEntityClientData();
        
        EntityClientDataOuterClass.EntityClientData getEntityClientData();
        
        EntityClientDataOuterClass.EntityClientDataOrBuilder getEntityClientDataOrBuilder();
        
        List<EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo> getEntityEnvironmentInfoListList();
        
        EntityEnvironmentInfoOuterClass.EntityEnvironmentInfo getEntityEnvironmentInfoList(final int p0);
        
        int getEntityEnvironmentInfoListCount();
        
        List<? extends EntityEnvironmentInfoOuterClass.EntityEnvironmentInfoOrBuilder> getEntityEnvironmentInfoListOrBuilderList();
        
        EntityEnvironmentInfoOuterClass.EntityEnvironmentInfoOrBuilder getEntityEnvironmentInfoListOrBuilder(final int p0);
        
        boolean hasEntityAuthorityInfo();
        
        EntityAuthorityInfoOuterClass.EntityAuthorityInfo getEntityAuthorityInfo();
        
        EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder getEntityAuthorityInfoOrBuilder();
        
        List<String> getTagListList();
        
        int getTagListCount();
        
        String getTagList(final int p0);
        
        ByteString getTagListBytes(final int p0);
        
        List<ServerBuffOuterClass.ServerBuff> getServerBuffListList();
        
        ServerBuffOuterClass.ServerBuff getServerBuffList(final int p0);
        
        int getServerBuffListCount();
        
        List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList();
        
        ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int p0);
        
        boolean hasAvatar();
        
        SceneAvatarInfoOuterClass.SceneAvatarInfo getAvatar();
        
        SceneAvatarInfoOuterClass.SceneAvatarInfoOrBuilder getAvatarOrBuilder();
        
        boolean hasMonster();
        
        SceneMonsterInfoOuterClass.SceneMonsterInfo getMonster();
        
        SceneMonsterInfoOuterClass.SceneMonsterInfoOrBuilder getMonsterOrBuilder();
        
        boolean hasNpc();
        
        SceneNpcInfoOuterClass.SceneNpcInfo getNpc();
        
        SceneNpcInfoOuterClass.SceneNpcInfoOrBuilder getNpcOrBuilder();
        
        boolean hasGadget();
        
        SceneGadgetInfoOuterClass.SceneGadgetInfo getGadget();
        
        SceneGadgetInfoOuterClass.SceneGadgetInfoOrBuilder getGadgetOrBuilder();
        
        SceneEntityInfo.EntityCase getEntityCase();
    }
}
