// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AvatarEnterSceneInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarEnterSceneInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarEnterSceneInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarEnterSceneInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarEnterSceneInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aAvatarEnterSceneInfo.proto\u001a\u001aAbilitySyncStateInfo.proto\u001a\u0010ServerBuff.proto\"\u0099\u0002\n\u0014AvatarEnterSceneInfo\u0012%\n\u0010server_buff_list\u0018\u000e \u0003(\u000b2\u000b.ServerBuff\u0012\u0018\n\u0010avatar_entity_id\u0018\n \u0001(\r\u00122\n\u0013weapon_ability_info\u0018\u0007 \u0001(\u000b2\u0015.AbilitySyncStateInfo\u0012\u0018\n\u0010weapon_entity_id\u0018\u000b \u0001(\r\u00122\n\u0013avatar_ability_info\u0018\u0001 \u0001(\u000b2\u0015.AbilitySyncStateInfo\u0012\u0013\n\u000bavatar_guid\u0018\u0002 \u0001(\u0004\u0012\u0013\n\u000bweapon_guid\u0018\u000f \u0001(\u0004\u0012\u0014\n\fbuff_id_list\u0018\t \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarEnterSceneInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilitySyncStateInfoOuterClass.getDescriptor(), ServerBuffOuterClass.getDescriptor() });
        internal_static_AvatarEnterSceneInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarEnterSceneInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarEnterSceneInfoOuterClass.internal_static_AvatarEnterSceneInfo_descriptor, new String[] { "ServerBuffList", "AvatarEntityId", "WeaponAbilityInfo", "WeaponEntityId", "AvatarAbilityInfo", "AvatarGuid", "WeaponGuid", "BuffIdList" });
        AbilitySyncStateInfoOuterClass.getDescriptor();
        ServerBuffOuterClass.getDescriptor();
    }
    
    public static final class AvatarEnterSceneInfo extends GeneratedMessageV3 implements AvatarEnterSceneInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SERVER_BUFF_LIST_FIELD_NUMBER = 14;
        private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
        public static final int AVATAR_ENTITY_ID_FIELD_NUMBER = 10;
        private int avatarEntityId_;
        public static final int WEAPON_ABILITY_INFO_FIELD_NUMBER = 7;
        private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo weaponAbilityInfo_;
        public static final int WEAPON_ENTITY_ID_FIELD_NUMBER = 11;
        private int weaponEntityId_;
        public static final int AVATAR_ABILITY_INFO_FIELD_NUMBER = 1;
        private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo avatarAbilityInfo_;
        public static final int AVATAR_GUID_FIELD_NUMBER = 2;
        private long avatarGuid_;
        public static final int WEAPON_GUID_FIELD_NUMBER = 15;
        private long weaponGuid_;
        public static final int BUFF_ID_LIST_FIELD_NUMBER = 9;
        private Internal.IntList buffIdList_;
        private int buffIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final AvatarEnterSceneInfo DEFAULT_INSTANCE;
        private static final Parser<AvatarEnterSceneInfo> PARSER;
        
        private AvatarEnterSceneInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.buffIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarEnterSceneInfo() {
            this.buffIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.serverBuffList_ = Collections.emptyList();
            this.buffIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarEnterSceneInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarEnterSceneInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder = null;
                            if (this.avatarAbilityInfo_ != null) {
                                subBuilder = this.avatarAbilityInfo_.toBuilder();
                            }
                            this.avatarAbilityInfo_ = input.readMessage(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.avatarAbilityInfo_);
                                this.avatarAbilityInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 16: {
                            this.avatarGuid_ = input.readUInt64();
                            continue;
                        }
                        case 58: {
                            AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder = null;
                            if (this.weaponAbilityInfo_ != null) {
                                subBuilder = this.weaponAbilityInfo_.toBuilder();
                            }
                            this.weaponAbilityInfo_ = input.readMessage(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.weaponAbilityInfo_);
                                this.weaponAbilityInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 72: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.buffIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.buffIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 74: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.buffIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.buffIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 80: {
                            this.avatarEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.weaponEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 114: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.serverBuffList_.add(input.readMessage(ServerBuffOuterClass.ServerBuff.parser(), extensionRegistry));
                            continue;
                        }
                        case 120: {
                            this.weaponGuid_ = input.readUInt64();
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.buffIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AvatarEnterSceneInfoOuterClass.internal_static_AvatarEnterSceneInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarEnterSceneInfoOuterClass.internal_static_AvatarEnterSceneInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarEnterSceneInfo.class, Builder.class);
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
        public int getAvatarEntityId() {
            return this.avatarEntityId_;
        }
        
        @Override
        public boolean hasWeaponAbilityInfo() {
            return this.weaponAbilityInfo_ != null;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getWeaponAbilityInfo() {
            return (this.weaponAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.weaponAbilityInfo_;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getWeaponAbilityInfoOrBuilder() {
            return this.getWeaponAbilityInfo();
        }
        
        @Override
        public int getWeaponEntityId() {
            return this.weaponEntityId_;
        }
        
        @Override
        public boolean hasAvatarAbilityInfo() {
            return this.avatarAbilityInfo_ != null;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAvatarAbilityInfo() {
            return (this.avatarAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.avatarAbilityInfo_;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAvatarAbilityInfoOrBuilder() {
            return this.getAvatarAbilityInfo();
        }
        
        @Override
        public long getAvatarGuid() {
            return this.avatarGuid_;
        }
        
        @Override
        public long getWeaponGuid() {
            return this.weaponGuid_;
        }
        
        @Override
        public List<Integer> getBuffIdListList() {
            return this.buffIdList_;
        }
        
        @Override
        public int getBuffIdListCount() {
            return this.buffIdList_.size();
        }
        
        @Override
        public int getBuffIdList(final int index) {
            return this.buffIdList_.getInt(index);
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
            if (this.avatarAbilityInfo_ != null) {
                output.writeMessage(1, this.getAvatarAbilityInfo());
            }
            if (this.avatarGuid_ != 0L) {
                output.writeUInt64(2, this.avatarGuid_);
            }
            if (this.weaponAbilityInfo_ != null) {
                output.writeMessage(7, this.getWeaponAbilityInfo());
            }
            if (this.getBuffIdListList().size() > 0) {
                output.writeUInt32NoTag(74);
                output.writeUInt32NoTag(this.buffIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.buffIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.buffIdList_.getInt(i));
            }
            if (this.avatarEntityId_ != 0) {
                output.writeUInt32(10, this.avatarEntityId_);
            }
            if (this.weaponEntityId_ != 0) {
                output.writeUInt32(11, this.weaponEntityId_);
            }
            for (int i = 0; i < this.serverBuffList_.size(); ++i) {
                output.writeMessage(14, this.serverBuffList_.get(i));
            }
            if (this.weaponGuid_ != 0L) {
                output.writeUInt64(15, this.weaponGuid_);
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
            if (this.avatarAbilityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getAvatarAbilityInfo());
            }
            if (this.avatarGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(2, this.avatarGuid_);
            }
            if (this.weaponAbilityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getWeaponAbilityInfo());
            }
            int dataSize = 0;
            for (int i = 0; i < this.buffIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.buffIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getBuffIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.buffIdListMemoizedSerializedSize = dataSize;
            if (this.avatarEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.avatarEntityId_);
            }
            if (this.weaponEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.weaponEntityId_);
            }
            for (int j = 0; j < this.serverBuffList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(14, this.serverBuffList_.get(j));
            }
            if (this.weaponGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(15, this.weaponGuid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarEnterSceneInfo)) {
                return super.equals(obj);
            }
            final AvatarEnterSceneInfo other = (AvatarEnterSceneInfo)obj;
            return this.getServerBuffListList().equals(other.getServerBuffListList()) && this.getAvatarEntityId() == other.getAvatarEntityId() && this.hasWeaponAbilityInfo() == other.hasWeaponAbilityInfo() && (!this.hasWeaponAbilityInfo() || this.getWeaponAbilityInfo().equals(other.getWeaponAbilityInfo())) && this.getWeaponEntityId() == other.getWeaponEntityId() && this.hasAvatarAbilityInfo() == other.hasAvatarAbilityInfo() && (!this.hasAvatarAbilityInfo() || this.getAvatarAbilityInfo().equals(other.getAvatarAbilityInfo())) && this.getAvatarGuid() == other.getAvatarGuid() && this.getWeaponGuid() == other.getWeaponGuid() && this.getBuffIdListList().equals(other.getBuffIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getServerBuffListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getServerBuffListList().hashCode();
            }
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getAvatarEntityId();
            if (this.hasWeaponAbilityInfo()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getWeaponAbilityInfo().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getWeaponEntityId();
            if (this.hasAvatarAbilityInfo()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getAvatarAbilityInfo().hashCode();
            }
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashLong(this.getAvatarGuid());
            hash = 37 * hash + 15;
            hash = 53 * hash + Internal.hashLong(this.getWeaponGuid());
            if (this.getBuffIdListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getBuffIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarEnterSceneInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarEnterSceneInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarEnterSceneInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarEnterSceneInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarEnterSceneInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarEnterSceneInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarEnterSceneInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarEnterSceneInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarEnterSceneInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarEnterSceneInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarEnterSceneInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarEnterSceneInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarEnterSceneInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarEnterSceneInfo.PARSER, input);
        }
        
        public static AvatarEnterSceneInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarEnterSceneInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarEnterSceneInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarEnterSceneInfo.PARSER, input);
        }
        
        public static AvatarEnterSceneInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarEnterSceneInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarEnterSceneInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarEnterSceneInfo.PARSER, input);
        }
        
        public static AvatarEnterSceneInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarEnterSceneInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarEnterSceneInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarEnterSceneInfo prototype) {
            return AvatarEnterSceneInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarEnterSceneInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarEnterSceneInfo getDefaultInstance() {
            return AvatarEnterSceneInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarEnterSceneInfo> parser() {
            return AvatarEnterSceneInfo.PARSER;
        }
        
        @Override
        public Parser<AvatarEnterSceneInfo> getParserForType() {
            return AvatarEnterSceneInfo.PARSER;
        }
        
        @Override
        public AvatarEnterSceneInfo getDefaultInstanceForType() {
            return AvatarEnterSceneInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarEnterSceneInfo();
            PARSER = new AbstractParser<AvatarEnterSceneInfo>() {
                @Override
                public AvatarEnterSceneInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarEnterSceneInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarEnterSceneInfoOrBuilder
        {
            private int bitField0_;
            private List<ServerBuffOuterClass.ServerBuff> serverBuffList_;
            private RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder> serverBuffListBuilder_;
            private int avatarEntityId_;
            private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo weaponAbilityInfo_;
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> weaponAbilityInfoBuilder_;
            private int weaponEntityId_;
            private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo avatarAbilityInfo_;
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> avatarAbilityInfoBuilder_;
            private long avatarGuid_;
            private long weaponGuid_;
            private Internal.IntList buffIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarEnterSceneInfoOuterClass.internal_static_AvatarEnterSceneInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarEnterSceneInfoOuterClass.internal_static_AvatarEnterSceneInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarEnterSceneInfo.class, Builder.class);
            }
            
            private Builder() {
                this.serverBuffList_ = Collections.emptyList();
                this.buffIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.serverBuffList_ = Collections.emptyList();
                this.buffIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarEnterSceneInfo.alwaysUseFieldBuilders) {
                    this.getServerBuffListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.serverBuffListBuilder_ == null) {
                    this.serverBuffList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.serverBuffListBuilder_.clear();
                }
                this.avatarEntityId_ = 0;
                if (this.weaponAbilityInfoBuilder_ == null) {
                    this.weaponAbilityInfo_ = null;
                }
                else {
                    this.weaponAbilityInfo_ = null;
                    this.weaponAbilityInfoBuilder_ = null;
                }
                this.weaponEntityId_ = 0;
                if (this.avatarAbilityInfoBuilder_ == null) {
                    this.avatarAbilityInfo_ = null;
                }
                else {
                    this.avatarAbilityInfo_ = null;
                    this.avatarAbilityInfoBuilder_ = null;
                }
                this.avatarGuid_ = 0L;
                this.weaponGuid_ = 0L;
                this.buffIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarEnterSceneInfoOuterClass.internal_static_AvatarEnterSceneInfo_descriptor;
            }
            
            @Override
            public AvatarEnterSceneInfo getDefaultInstanceForType() {
                return AvatarEnterSceneInfo.getDefaultInstance();
            }
            
            @Override
            public AvatarEnterSceneInfo build() {
                final AvatarEnterSceneInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarEnterSceneInfo buildPartial() {
                final AvatarEnterSceneInfo result = new AvatarEnterSceneInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.serverBuffListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.serverBuffList_ = Collections.unmodifiableList((List<? extends ServerBuffOuterClass.ServerBuff>)this.serverBuffList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.serverBuffList_ = this.serverBuffList_;
                }
                else {
                    result.serverBuffList_ = this.serverBuffListBuilder_.build();
                }
                result.avatarEntityId_ = this.avatarEntityId_;
                if (this.weaponAbilityInfoBuilder_ == null) {
                    result.weaponAbilityInfo_ = this.weaponAbilityInfo_;
                }
                else {
                    result.weaponAbilityInfo_ = this.weaponAbilityInfoBuilder_.build();
                }
                result.weaponEntityId_ = this.weaponEntityId_;
                if (this.avatarAbilityInfoBuilder_ == null) {
                    result.avatarAbilityInfo_ = this.avatarAbilityInfo_;
                }
                else {
                    result.avatarAbilityInfo_ = this.avatarAbilityInfoBuilder_.build();
                }
                result.avatarGuid_ = this.avatarGuid_;
                result.weaponGuid_ = this.weaponGuid_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.buffIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.buffIdList_ = this.buffIdList_;
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
                if (other instanceof AvatarEnterSceneInfo) {
                    return this.mergeFrom((AvatarEnterSceneInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarEnterSceneInfo other) {
                if (other == AvatarEnterSceneInfo.getDefaultInstance()) {
                    return this;
                }
                if (this.serverBuffListBuilder_ == null) {
                    if (!other.serverBuffList_.isEmpty()) {
                        if (this.serverBuffList_.isEmpty()) {
                            this.serverBuffList_ = other.serverBuffList_;
                            this.bitField0_ &= 0xFFFFFFFE;
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
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.serverBuffListBuilder_ = (AvatarEnterSceneInfo.alwaysUseFieldBuilders ? this.getServerBuffListFieldBuilder() : null);
                    }
                    else {
                        this.serverBuffListBuilder_.addAllMessages(other.serverBuffList_);
                    }
                }
                if (other.getAvatarEntityId() != 0) {
                    this.setAvatarEntityId(other.getAvatarEntityId());
                }
                if (other.hasWeaponAbilityInfo()) {
                    this.mergeWeaponAbilityInfo(other.getWeaponAbilityInfo());
                }
                if (other.getWeaponEntityId() != 0) {
                    this.setWeaponEntityId(other.getWeaponEntityId());
                }
                if (other.hasAvatarAbilityInfo()) {
                    this.mergeAvatarAbilityInfo(other.getAvatarAbilityInfo());
                }
                if (other.getAvatarGuid() != 0L) {
                    this.setAvatarGuid(other.getAvatarGuid());
                }
                if (other.getWeaponGuid() != 0L) {
                    this.setWeaponGuid(other.getWeaponGuid());
                }
                if (!other.buffIdList_.isEmpty()) {
                    if (this.buffIdList_.isEmpty()) {
                        this.buffIdList_ = other.buffIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureBuffIdListIsMutable();
                        this.buffIdList_.addAll(other.buffIdList_);
                    }
                    this.onChanged();
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
                AvatarEnterSceneInfo parsedMessage = null;
                try {
                    parsedMessage = AvatarEnterSceneInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarEnterSceneInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureServerBuffListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.serverBuffList_ = new ArrayList<ServerBuffOuterClass.ServerBuff>(this.serverBuffList_);
                    this.bitField0_ |= 0x1;
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
                    this.bitField0_ &= 0xFFFFFFFE;
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
                    this.serverBuffListBuilder_ = new RepeatedFieldBuilderV3<ServerBuffOuterClass.ServerBuff, ServerBuffOuterClass.ServerBuff.Builder, ServerBuffOuterClass.ServerBuffOrBuilder>(this.serverBuffList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.serverBuffList_ = null;
                }
                return this.serverBuffListBuilder_;
            }
            
            @Override
            public int getAvatarEntityId() {
                return this.avatarEntityId_;
            }
            
            public Builder setAvatarEntityId(final int value) {
                this.avatarEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarEntityId() {
                this.avatarEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasWeaponAbilityInfo() {
                return this.weaponAbilityInfoBuilder_ != null || this.weaponAbilityInfo_ != null;
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getWeaponAbilityInfo() {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    return (this.weaponAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.weaponAbilityInfo_;
                }
                return this.weaponAbilityInfoBuilder_.getMessage();
            }
            
            public Builder setWeaponAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.weaponAbilityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.weaponAbilityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setWeaponAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    this.weaponAbilityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.weaponAbilityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeWeaponAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    if (this.weaponAbilityInfo_ != null) {
                        this.weaponAbilityInfo_ = AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(this.weaponAbilityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.weaponAbilityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.weaponAbilityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearWeaponAbilityInfo() {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    this.weaponAbilityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.weaponAbilityInfo_ = null;
                    this.weaponAbilityInfoBuilder_ = null;
                }
                return this;
            }
            
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getWeaponAbilityInfoBuilder() {
                this.onChanged();
                return this.getWeaponAbilityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getWeaponAbilityInfoOrBuilder() {
                if (this.weaponAbilityInfoBuilder_ != null) {
                    return this.weaponAbilityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.weaponAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.weaponAbilityInfo_;
            }
            
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> getWeaponAbilityInfoFieldBuilder() {
                if (this.weaponAbilityInfoBuilder_ == null) {
                    this.weaponAbilityInfoBuilder_ = new SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(this.getWeaponAbilityInfo(), this.getParentForChildren(), this.isClean());
                    this.weaponAbilityInfo_ = null;
                }
                return this.weaponAbilityInfoBuilder_;
            }
            
            @Override
            public int getWeaponEntityId() {
                return this.weaponEntityId_;
            }
            
            public Builder setWeaponEntityId(final int value) {
                this.weaponEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWeaponEntityId() {
                this.weaponEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasAvatarAbilityInfo() {
                return this.avatarAbilityInfoBuilder_ != null || this.avatarAbilityInfo_ != null;
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAvatarAbilityInfo() {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    return (this.avatarAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.avatarAbilityInfo_;
                }
                return this.avatarAbilityInfoBuilder_.getMessage();
            }
            
            public Builder setAvatarAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.avatarAbilityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.avatarAbilityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAvatarAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    this.avatarAbilityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.avatarAbilityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAvatarAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    if (this.avatarAbilityInfo_ != null) {
                        this.avatarAbilityInfo_ = AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(this.avatarAbilityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.avatarAbilityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.avatarAbilityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAvatarAbilityInfo() {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    this.avatarAbilityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.avatarAbilityInfo_ = null;
                    this.avatarAbilityInfoBuilder_ = null;
                }
                return this;
            }
            
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getAvatarAbilityInfoBuilder() {
                this.onChanged();
                return this.getAvatarAbilityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAvatarAbilityInfoOrBuilder() {
                if (this.avatarAbilityInfoBuilder_ != null) {
                    return this.avatarAbilityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.avatarAbilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.avatarAbilityInfo_;
            }
            
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> getAvatarAbilityInfoFieldBuilder() {
                if (this.avatarAbilityInfoBuilder_ == null) {
                    this.avatarAbilityInfoBuilder_ = new SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(this.getAvatarAbilityInfo(), this.getParentForChildren(), this.isClean());
                    this.avatarAbilityInfo_ = null;
                }
                return this.avatarAbilityInfoBuilder_;
            }
            
            @Override
            public long getAvatarGuid() {
                return this.avatarGuid_;
            }
            
            public Builder setAvatarGuid(final long value) {
                this.avatarGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarGuid() {
                this.avatarGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getWeaponGuid() {
                return this.weaponGuid_;
            }
            
            public Builder setWeaponGuid(final long value) {
                this.weaponGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWeaponGuid() {
                this.weaponGuid_ = 0L;
                this.onChanged();
                return this;
            }
            
            private void ensureBuffIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.buffIdList_ = GeneratedMessageV3.mutableCopy(this.buffIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getBuffIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.buffIdList_) : this.buffIdList_;
            }
            
            @Override
            public int getBuffIdListCount() {
                return this.buffIdList_.size();
            }
            
            @Override
            public int getBuffIdList(final int index) {
                return this.buffIdList_.getInt(index);
            }
            
            public Builder setBuffIdList(final int index, final int value) {
                this.ensureBuffIdListIsMutable();
                this.buffIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addBuffIdList(final int value) {
                this.ensureBuffIdListIsMutable();
                this.buffIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllBuffIdList(final Iterable<? extends Integer> values) {
                this.ensureBuffIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.buffIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearBuffIdList() {
                this.buffIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.onChanged();
                return this;
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
    
    public interface AvatarEnterSceneInfoOrBuilder extends MessageOrBuilder
    {
        List<ServerBuffOuterClass.ServerBuff> getServerBuffListList();
        
        ServerBuffOuterClass.ServerBuff getServerBuffList(final int p0);
        
        int getServerBuffListCount();
        
        List<? extends ServerBuffOuterClass.ServerBuffOrBuilder> getServerBuffListOrBuilderList();
        
        ServerBuffOuterClass.ServerBuffOrBuilder getServerBuffListOrBuilder(final int p0);
        
        int getAvatarEntityId();
        
        boolean hasWeaponAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getWeaponAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getWeaponAbilityInfoOrBuilder();
        
        int getWeaponEntityId();
        
        boolean hasAvatarAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAvatarAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAvatarAbilityInfoOrBuilder();
        
        long getAvatarGuid();
        
        long getWeaponGuid();
        
        List<Integer> getBuffIdListList();
        
        int getBuffIdListCount();
        
        int getBuffIdList(final int p0);
    }
}
