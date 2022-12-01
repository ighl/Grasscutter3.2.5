// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class HomeBasicInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeBasicInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeBasicInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeBasicInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeBasicInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013HomeBasicInfo.proto\u001a\u0019HomeLimitedShopInfo.proto\"\u00d8\u0001\n\rHomeBasicInfo\u0012\r\n\u0005level\u0018\n \u0001(\r\u0012\u0019\n\u0011cur_room_scene_id\u0018\r \u0001(\r\u0012\u0015\n\rcur_module_id\u0018\t \u0001(\r\u0012\u0017\n\u000fis_in_edit_mode\u0018\u0005 \u0001(\b\u0012\u0016\n\u000ehome_owner_uid\u0018\u0003 \u0001(\r\u0012\u000b\n\u0003exp\u0018\u000e \u0001(\u0004\u0012/\n\u0011limited_shop_info\u0018\u000f \u0001(\u000b2\u0014.HomeLimitedShopInfo\u0012\u0017\n\u000fowner_nick_name\u0018\u0004 \u0001(\tB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeBasicInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { HomeLimitedShopInfoOuterClass.getDescriptor() });
        internal_static_HomeBasicInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeBasicInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeBasicInfoOuterClass.internal_static_HomeBasicInfo_descriptor, new String[] { "Level", "CurRoomSceneId", "CurModuleId", "IsInEditMode", "HomeOwnerUid", "Exp", "LimitedShopInfo", "OwnerNickName" });
        HomeLimitedShopInfoOuterClass.getDescriptor();
    }
    
    public static final class HomeBasicInfo extends GeneratedMessageV3 implements HomeBasicInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LEVEL_FIELD_NUMBER = 10;
        private int level_;
        public static final int CUR_ROOM_SCENE_ID_FIELD_NUMBER = 13;
        private int curRoomSceneId_;
        public static final int CUR_MODULE_ID_FIELD_NUMBER = 9;
        private int curModuleId_;
        public static final int IS_IN_EDIT_MODE_FIELD_NUMBER = 5;
        private boolean isInEditMode_;
        public static final int HOME_OWNER_UID_FIELD_NUMBER = 3;
        private int homeOwnerUid_;
        public static final int EXP_FIELD_NUMBER = 14;
        private long exp_;
        public static final int LIMITED_SHOP_INFO_FIELD_NUMBER = 15;
        private HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo limitedShopInfo_;
        public static final int OWNER_NICK_NAME_FIELD_NUMBER = 4;
        private volatile Object ownerNickName_;
        private byte memoizedIsInitialized;
        private static final HomeBasicInfo DEFAULT_INSTANCE;
        private static final Parser<HomeBasicInfo> PARSER;
        
        private HomeBasicInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeBasicInfo() {
            this.memoizedIsInitialized = -1;
            this.ownerNickName_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeBasicInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeBasicInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 24: {
                            this.homeOwnerUid_ = input.readUInt32();
                            continue;
                        }
                        case 34: {
                            final String s = input.readStringRequireUtf8();
                            this.ownerNickName_ = s;
                            continue;
                        }
                        case 40: {
                            this.isInEditMode_ = input.readBool();
                            continue;
                        }
                        case 72: {
                            this.curModuleId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.curRoomSceneId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.exp_ = input.readUInt64();
                            continue;
                        }
                        case 122: {
                            HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder subBuilder = null;
                            if (this.limitedShopInfo_ != null) {
                                subBuilder = this.limitedShopInfo_.toBuilder();
                            }
                            this.limitedShopInfo_ = input.readMessage(HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.limitedShopInfo_);
                                this.limitedShopInfo_ = subBuilder.buildPartial();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return HomeBasicInfoOuterClass.internal_static_HomeBasicInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeBasicInfoOuterClass.internal_static_HomeBasicInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBasicInfo.class, Builder.class);
        }
        
        @Override
        public int getLevel() {
            return this.level_;
        }
        
        @Override
        public int getCurRoomSceneId() {
            return this.curRoomSceneId_;
        }
        
        @Override
        public int getCurModuleId() {
            return this.curModuleId_;
        }
        
        @Override
        public boolean getIsInEditMode() {
            return this.isInEditMode_;
        }
        
        @Override
        public int getHomeOwnerUid() {
            return this.homeOwnerUid_;
        }
        
        @Override
        public long getExp() {
            return this.exp_;
        }
        
        @Override
        public boolean hasLimitedShopInfo() {
            return this.limitedShopInfo_ != null;
        }
        
        @Override
        public HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo getLimitedShopInfo() {
            return (this.limitedShopInfo_ == null) ? HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.getDefaultInstance() : this.limitedShopInfo_;
        }
        
        @Override
        public HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder getLimitedShopInfoOrBuilder() {
            return this.getLimitedShopInfo();
        }
        
        @Override
        public String getOwnerNickName() {
            final Object ref = this.ownerNickName_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.ownerNickName_ = s);
        }
        
        @Override
        public ByteString getOwnerNickNameBytes() {
            final Object ref = this.ownerNickName_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.ownerNickName_ = b);
            }
            return (ByteString)ref;
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
            if (this.homeOwnerUid_ != 0) {
                output.writeUInt32(3, this.homeOwnerUid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.ownerNickName_)) {
                GeneratedMessageV3.writeString(output, 4, this.ownerNickName_);
            }
            if (this.isInEditMode_) {
                output.writeBool(5, this.isInEditMode_);
            }
            if (this.curModuleId_ != 0) {
                output.writeUInt32(9, this.curModuleId_);
            }
            if (this.level_ != 0) {
                output.writeUInt32(10, this.level_);
            }
            if (this.curRoomSceneId_ != 0) {
                output.writeUInt32(13, this.curRoomSceneId_);
            }
            if (this.exp_ != 0L) {
                output.writeUInt64(14, this.exp_);
            }
            if (this.limitedShopInfo_ != null) {
                output.writeMessage(15, this.getLimitedShopInfo());
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
            if (this.homeOwnerUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.homeOwnerUid_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.ownerNickName_)) {
                size += GeneratedMessageV3.computeStringSize(4, this.ownerNickName_);
            }
            if (this.isInEditMode_) {
                size += CodedOutputStream.computeBoolSize(5, this.isInEditMode_);
            }
            if (this.curModuleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.curModuleId_);
            }
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.level_);
            }
            if (this.curRoomSceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.curRoomSceneId_);
            }
            if (this.exp_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(14, this.exp_);
            }
            if (this.limitedShopInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getLimitedShopInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeBasicInfo)) {
                return super.equals(obj);
            }
            final HomeBasicInfo other = (HomeBasicInfo)obj;
            return this.getLevel() == other.getLevel() && this.getCurRoomSceneId() == other.getCurRoomSceneId() && this.getCurModuleId() == other.getCurModuleId() && this.getIsInEditMode() == other.getIsInEditMode() && this.getHomeOwnerUid() == other.getHomeOwnerUid() && this.getExp() == other.getExp() && this.hasLimitedShopInfo() == other.hasLimitedShopInfo() && (!this.hasLimitedShopInfo() || this.getLimitedShopInfo().equals(other.getLimitedShopInfo())) && this.getOwnerNickName().equals(other.getOwnerNickName()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getLevel();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getCurRoomSceneId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getCurModuleId();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsInEditMode());
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getHomeOwnerUid();
            hash = 37 * hash + 14;
            hash = 53 * hash + Internal.hashLong(this.getExp());
            if (this.hasLimitedShopInfo()) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getLimitedShopInfo().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getOwnerNickName().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeBasicInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeBasicInfo.PARSER.parseFrom(data);
        }
        
        public static HomeBasicInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBasicInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBasicInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeBasicInfo.PARSER.parseFrom(data);
        }
        
        public static HomeBasicInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBasicInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBasicInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeBasicInfo.PARSER.parseFrom(data);
        }
        
        public static HomeBasicInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBasicInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBasicInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBasicInfo.PARSER, input);
        }
        
        public static HomeBasicInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBasicInfo.PARSER, input, extensionRegistry);
        }
        
        public static HomeBasicInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBasicInfo.PARSER, input);
        }
        
        public static HomeBasicInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBasicInfo.PARSER, input, extensionRegistry);
        }
        
        public static HomeBasicInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBasicInfo.PARSER, input);
        }
        
        public static HomeBasicInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBasicInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeBasicInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeBasicInfo prototype) {
            return HomeBasicInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeBasicInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeBasicInfo getDefaultInstance() {
            return HomeBasicInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeBasicInfo> parser() {
            return HomeBasicInfo.PARSER;
        }
        
        @Override
        public Parser<HomeBasicInfo> getParserForType() {
            return HomeBasicInfo.PARSER;
        }
        
        @Override
        public HomeBasicInfo getDefaultInstanceForType() {
            return HomeBasicInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeBasicInfo();
            PARSER = new AbstractParser<HomeBasicInfo>() {
                @Override
                public HomeBasicInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeBasicInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeBasicInfoOrBuilder
        {
            private int level_;
            private int curRoomSceneId_;
            private int curModuleId_;
            private boolean isInEditMode_;
            private int homeOwnerUid_;
            private long exp_;
            private HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo limitedShopInfo_;
            private SingleFieldBuilderV3<HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo, HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder, HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder> limitedShopInfoBuilder_;
            private Object ownerNickName_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeBasicInfoOuterClass.internal_static_HomeBasicInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeBasicInfoOuterClass.internal_static_HomeBasicInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBasicInfo.class, Builder.class);
            }
            
            private Builder() {
                this.ownerNickName_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.ownerNickName_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeBasicInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.level_ = 0;
                this.curRoomSceneId_ = 0;
                this.curModuleId_ = 0;
                this.isInEditMode_ = false;
                this.homeOwnerUid_ = 0;
                this.exp_ = 0L;
                if (this.limitedShopInfoBuilder_ == null) {
                    this.limitedShopInfo_ = null;
                }
                else {
                    this.limitedShopInfo_ = null;
                    this.limitedShopInfoBuilder_ = null;
                }
                this.ownerNickName_ = "";
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeBasicInfoOuterClass.internal_static_HomeBasicInfo_descriptor;
            }
            
            @Override
            public HomeBasicInfo getDefaultInstanceForType() {
                return HomeBasicInfo.getDefaultInstance();
            }
            
            @Override
            public HomeBasicInfo build() {
                final HomeBasicInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeBasicInfo buildPartial() {
                final HomeBasicInfo result = new HomeBasicInfo(this);
                result.level_ = this.level_;
                result.curRoomSceneId_ = this.curRoomSceneId_;
                result.curModuleId_ = this.curModuleId_;
                result.isInEditMode_ = this.isInEditMode_;
                result.homeOwnerUid_ = this.homeOwnerUid_;
                result.exp_ = this.exp_;
                if (this.limitedShopInfoBuilder_ == null) {
                    result.limitedShopInfo_ = this.limitedShopInfo_;
                }
                else {
                    result.limitedShopInfo_ = this.limitedShopInfoBuilder_.build();
                }
                result.ownerNickName_ = this.ownerNickName_;
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
                if (other instanceof HomeBasicInfo) {
                    return this.mergeFrom((HomeBasicInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeBasicInfo other) {
                if (other == HomeBasicInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
                }
                if (other.getCurRoomSceneId() != 0) {
                    this.setCurRoomSceneId(other.getCurRoomSceneId());
                }
                if (other.getCurModuleId() != 0) {
                    this.setCurModuleId(other.getCurModuleId());
                }
                if (other.getIsInEditMode()) {
                    this.setIsInEditMode(other.getIsInEditMode());
                }
                if (other.getHomeOwnerUid() != 0) {
                    this.setHomeOwnerUid(other.getHomeOwnerUid());
                }
                if (other.getExp() != 0L) {
                    this.setExp(other.getExp());
                }
                if (other.hasLimitedShopInfo()) {
                    this.mergeLimitedShopInfo(other.getLimitedShopInfo());
                }
                if (!other.getOwnerNickName().isEmpty()) {
                    this.ownerNickName_ = other.ownerNickName_;
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
                HomeBasicInfo parsedMessage = null;
                try {
                    parsedMessage = HomeBasicInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeBasicInfo)e.getUnfinishedMessage();
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
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurRoomSceneId() {
                return this.curRoomSceneId_;
            }
            
            public Builder setCurRoomSceneId(final int value) {
                this.curRoomSceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurRoomSceneId() {
                this.curRoomSceneId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurModuleId() {
                return this.curModuleId_;
            }
            
            public Builder setCurModuleId(final int value) {
                this.curModuleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurModuleId() {
                this.curModuleId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsInEditMode() {
                return this.isInEditMode_;
            }
            
            public Builder setIsInEditMode(final boolean value) {
                this.isInEditMode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsInEditMode() {
                this.isInEditMode_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getHomeOwnerUid() {
                return this.homeOwnerUid_;
            }
            
            public Builder setHomeOwnerUid(final int value) {
                this.homeOwnerUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHomeOwnerUid() {
                this.homeOwnerUid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getExp() {
                return this.exp_;
            }
            
            public Builder setExp(final long value) {
                this.exp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExp() {
                this.exp_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasLimitedShopInfo() {
                return this.limitedShopInfoBuilder_ != null || this.limitedShopInfo_ != null;
            }
            
            @Override
            public HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo getLimitedShopInfo() {
                if (this.limitedShopInfoBuilder_ == null) {
                    return (this.limitedShopInfo_ == null) ? HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.getDefaultInstance() : this.limitedShopInfo_;
                }
                return this.limitedShopInfoBuilder_.getMessage();
            }
            
            public Builder setLimitedShopInfo(final HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo value) {
                if (this.limitedShopInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.limitedShopInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.limitedShopInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setLimitedShopInfo(final HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder builderForValue) {
                if (this.limitedShopInfoBuilder_ == null) {
                    this.limitedShopInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.limitedShopInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeLimitedShopInfo(final HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo value) {
                if (this.limitedShopInfoBuilder_ == null) {
                    if (this.limitedShopInfo_ != null) {
                        this.limitedShopInfo_ = HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.newBuilder(this.limitedShopInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.limitedShopInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.limitedShopInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearLimitedShopInfo() {
                if (this.limitedShopInfoBuilder_ == null) {
                    this.limitedShopInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.limitedShopInfo_ = null;
                    this.limitedShopInfoBuilder_ = null;
                }
                return this;
            }
            
            public HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder getLimitedShopInfoBuilder() {
                this.onChanged();
                return this.getLimitedShopInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder getLimitedShopInfoOrBuilder() {
                if (this.limitedShopInfoBuilder_ != null) {
                    return this.limitedShopInfoBuilder_.getMessageOrBuilder();
                }
                return (this.limitedShopInfo_ == null) ? HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.getDefaultInstance() : this.limitedShopInfo_;
            }
            
            private SingleFieldBuilderV3<HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo, HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder, HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder> getLimitedShopInfoFieldBuilder() {
                if (this.limitedShopInfoBuilder_ == null) {
                    this.limitedShopInfoBuilder_ = new SingleFieldBuilderV3<HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo, HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo.Builder, HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder>(this.getLimitedShopInfo(), this.getParentForChildren(), this.isClean());
                    this.limitedShopInfo_ = null;
                }
                return this.limitedShopInfoBuilder_;
            }
            
            @Override
            public String getOwnerNickName() {
                final Object ref = this.ownerNickName_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.ownerNickName_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getOwnerNickNameBytes() {
                final Object ref = this.ownerNickName_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.ownerNickName_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setOwnerNickName(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.ownerNickName_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOwnerNickName() {
                this.ownerNickName_ = HomeBasicInfo.getDefaultInstance().getOwnerNickName();
                this.onChanged();
                return this;
            }
            
            public Builder setOwnerNickNameBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.ownerNickName_ = value;
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
    
    public interface HomeBasicInfoOrBuilder extends MessageOrBuilder
    {
        int getLevel();
        
        int getCurRoomSceneId();
        
        int getCurModuleId();
        
        boolean getIsInEditMode();
        
        int getHomeOwnerUid();
        
        long getExp();
        
        boolean hasLimitedShopInfo();
        
        HomeLimitedShopInfoOuterClass.HomeLimitedShopInfo getLimitedShopInfo();
        
        HomeLimitedShopInfoOuterClass.HomeLimitedShopInfoOrBuilder getLimitedShopInfoOrBuilder();
        
        String getOwnerNickName();
        
        ByteString getOwnerNickNameBytes();
    }
}
