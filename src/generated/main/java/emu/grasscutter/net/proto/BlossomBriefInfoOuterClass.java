// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
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

public final class BlossomBriefInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_BlossomBriefInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BlossomBriefInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BlossomBriefInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BlossomBriefInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016BlossomBriefInfo.proto\u001a\fVector.proto\"\u00d8\u0001\n\u0010BlossomBriefInfo\u0012\u0012\n\nrefresh_id\u0018\r \u0001(\r\u0012\u0011\n\treward_id\u0018\u0005 \u0001(\r\u0012\u000f\n\u0007city_id\u0018\n \u0001(\r\u0012\r\n\u0005resin\u0018\u000b \u0001(\r\u0012\r\n\u0005state\u0018\u0007 \u0001(\r\u0012\u0017\n\u000fis_guide_opened\u0018\u0001 \u0001(\b\u0012\u0015\n\rmonster_level\u0018\b \u0001(\r\u0012\u0016\n\u000ecircle_camp_id\u0018\u000f \u0001(\r\u0012\u0014\n\u0003pos\u0018\f \u0001(\u000b2\u0007.Vector\u0012\u0010\n\bscene_id\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BlossomBriefInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_BlossomBriefInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BlossomBriefInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BlossomBriefInfoOuterClass.internal_static_BlossomBriefInfo_descriptor, new String[] { "RefreshId", "RewardId", "CityId", "Resin", "State", "IsGuideOpened", "MonsterLevel", "CircleCampId", "Pos", "SceneId" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class BlossomBriefInfo extends GeneratedMessageV3 implements BlossomBriefInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int REFRESH_ID_FIELD_NUMBER = 13;
        private int refreshId_;
        public static final int REWARD_ID_FIELD_NUMBER = 5;
        private int rewardId_;
        public static final int CITY_ID_FIELD_NUMBER = 10;
        private int cityId_;
        public static final int RESIN_FIELD_NUMBER = 11;
        private int resin_;
        public static final int STATE_FIELD_NUMBER = 7;
        private int state_;
        public static final int IS_GUIDE_OPENED_FIELD_NUMBER = 1;
        private boolean isGuideOpened_;
        public static final int MONSTER_LEVEL_FIELD_NUMBER = 8;
        private int monsterLevel_;
        public static final int CIRCLE_CAMP_ID_FIELD_NUMBER = 15;
        private int circleCampId_;
        public static final int POS_FIELD_NUMBER = 12;
        private VectorOuterClass.Vector pos_;
        public static final int SCENE_ID_FIELD_NUMBER = 9;
        private int sceneId_;
        private byte memoizedIsInitialized;
        private static final BlossomBriefInfo DEFAULT_INSTANCE;
        private static final Parser<BlossomBriefInfo> PARSER;
        
        private BlossomBriefInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BlossomBriefInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BlossomBriefInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BlossomBriefInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.isGuideOpened_ = input.readBool();
                            continue;
                        }
                        case 40: {
                            this.rewardId_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.state_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.monsterLevel_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.sceneId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.cityId_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.resin_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.pos_ != null) {
                                subBuilder = this.pos_.toBuilder();
                            }
                            this.pos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.pos_);
                                this.pos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 104: {
                            this.refreshId_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.circleCampId_ = input.readUInt32();
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
            return BlossomBriefInfoOuterClass.internal_static_BlossomBriefInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BlossomBriefInfoOuterClass.internal_static_BlossomBriefInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BlossomBriefInfo.class, Builder.class);
        }
        
        @Override
        public int getRefreshId() {
            return this.refreshId_;
        }
        
        @Override
        public int getRewardId() {
            return this.rewardId_;
        }
        
        @Override
        public int getCityId() {
            return this.cityId_;
        }
        
        @Override
        public int getResin() {
            return this.resin_;
        }
        
        @Override
        public int getState() {
            return this.state_;
        }
        
        @Override
        public boolean getIsGuideOpened() {
            return this.isGuideOpened_;
        }
        
        @Override
        public int getMonsterLevel() {
            return this.monsterLevel_;
        }
        
        @Override
        public int getCircleCampId() {
            return this.circleCampId_;
        }
        
        @Override
        public boolean hasPos() {
            return this.pos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getPos() {
            return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
            return this.getPos();
        }
        
        @Override
        public int getSceneId() {
            return this.sceneId_;
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
            if (this.isGuideOpened_) {
                output.writeBool(1, this.isGuideOpened_);
            }
            if (this.rewardId_ != 0) {
                output.writeUInt32(5, this.rewardId_);
            }
            if (this.state_ != 0) {
                output.writeUInt32(7, this.state_);
            }
            if (this.monsterLevel_ != 0) {
                output.writeUInt32(8, this.monsterLevel_);
            }
            if (this.sceneId_ != 0) {
                output.writeUInt32(9, this.sceneId_);
            }
            if (this.cityId_ != 0) {
                output.writeUInt32(10, this.cityId_);
            }
            if (this.resin_ != 0) {
                output.writeUInt32(11, this.resin_);
            }
            if (this.pos_ != null) {
                output.writeMessage(12, this.getPos());
            }
            if (this.refreshId_ != 0) {
                output.writeUInt32(13, this.refreshId_);
            }
            if (this.circleCampId_ != 0) {
                output.writeUInt32(15, this.circleCampId_);
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
            if (this.isGuideOpened_) {
                size += CodedOutputStream.computeBoolSize(1, this.isGuideOpened_);
            }
            if (this.rewardId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.rewardId_);
            }
            if (this.state_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.state_);
            }
            if (this.monsterLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.monsterLevel_);
            }
            if (this.sceneId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.sceneId_);
            }
            if (this.cityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.cityId_);
            }
            if (this.resin_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.resin_);
            }
            if (this.pos_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getPos());
            }
            if (this.refreshId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.refreshId_);
            }
            if (this.circleCampId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.circleCampId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BlossomBriefInfo)) {
                return super.equals(obj);
            }
            final BlossomBriefInfo other = (BlossomBriefInfo)obj;
            return this.getRefreshId() == other.getRefreshId() && this.getRewardId() == other.getRewardId() && this.getCityId() == other.getCityId() && this.getResin() == other.getResin() && this.getState() == other.getState() && this.getIsGuideOpened() == other.getIsGuideOpened() && this.getMonsterLevel() == other.getMonsterLevel() && this.getCircleCampId() == other.getCircleCampId() && this.hasPos() == other.hasPos() && (!this.hasPos() || this.getPos().equals(other.getPos())) && this.getSceneId() == other.getSceneId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getRefreshId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getRewardId();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getCityId();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getResin();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getState();
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getIsGuideOpened());
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getMonsterLevel();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getCircleCampId();
            if (this.hasPos()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getPos().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getSceneId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BlossomBriefInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BlossomBriefInfo.PARSER.parseFrom(data);
        }
        
        public static BlossomBriefInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomBriefInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomBriefInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BlossomBriefInfo.PARSER.parseFrom(data);
        }
        
        public static BlossomBriefInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomBriefInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomBriefInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BlossomBriefInfo.PARSER.parseFrom(data);
        }
        
        public static BlossomBriefInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BlossomBriefInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BlossomBriefInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomBriefInfo.PARSER, input);
        }
        
        public static BlossomBriefInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomBriefInfo.PARSER, input, extensionRegistry);
        }
        
        public static BlossomBriefInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BlossomBriefInfo.PARSER, input);
        }
        
        public static BlossomBriefInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BlossomBriefInfo.PARSER, input, extensionRegistry);
        }
        
        public static BlossomBriefInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomBriefInfo.PARSER, input);
        }
        
        public static BlossomBriefInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BlossomBriefInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BlossomBriefInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BlossomBriefInfo prototype) {
            return BlossomBriefInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BlossomBriefInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BlossomBriefInfo getDefaultInstance() {
            return BlossomBriefInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<BlossomBriefInfo> parser() {
            return BlossomBriefInfo.PARSER;
        }
        
        @Override
        public Parser<BlossomBriefInfo> getParserForType() {
            return BlossomBriefInfo.PARSER;
        }
        
        @Override
        public BlossomBriefInfo getDefaultInstanceForType() {
            return BlossomBriefInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BlossomBriefInfo();
            PARSER = new AbstractParser<BlossomBriefInfo>() {
                @Override
                public BlossomBriefInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BlossomBriefInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BlossomBriefInfoOrBuilder
        {
            private int refreshId_;
            private int rewardId_;
            private int cityId_;
            private int resin_;
            private int state_;
            private boolean isGuideOpened_;
            private int monsterLevel_;
            private int circleCampId_;
            private VectorOuterClass.Vector pos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> posBuilder_;
            private int sceneId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BlossomBriefInfoOuterClass.internal_static_BlossomBriefInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BlossomBriefInfoOuterClass.internal_static_BlossomBriefInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(BlossomBriefInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BlossomBriefInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.refreshId_ = 0;
                this.rewardId_ = 0;
                this.cityId_ = 0;
                this.resin_ = 0;
                this.state_ = 0;
                this.isGuideOpened_ = false;
                this.monsterLevel_ = 0;
                this.circleCampId_ = 0;
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                this.sceneId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BlossomBriefInfoOuterClass.internal_static_BlossomBriefInfo_descriptor;
            }
            
            @Override
            public BlossomBriefInfo getDefaultInstanceForType() {
                return BlossomBriefInfo.getDefaultInstance();
            }
            
            @Override
            public BlossomBriefInfo build() {
                final BlossomBriefInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BlossomBriefInfo buildPartial() {
                final BlossomBriefInfo result = new BlossomBriefInfo(this);
                result.refreshId_ = this.refreshId_;
                result.rewardId_ = this.rewardId_;
                result.cityId_ = this.cityId_;
                result.resin_ = this.resin_;
                result.state_ = this.state_;
                result.isGuideOpened_ = this.isGuideOpened_;
                result.monsterLevel_ = this.monsterLevel_;
                result.circleCampId_ = this.circleCampId_;
                if (this.posBuilder_ == null) {
                    result.pos_ = this.pos_;
                }
                else {
                    result.pos_ = this.posBuilder_.build();
                }
                result.sceneId_ = this.sceneId_;
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
                if (other instanceof BlossomBriefInfo) {
                    return this.mergeFrom((BlossomBriefInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BlossomBriefInfo other) {
                if (other == BlossomBriefInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getRefreshId() != 0) {
                    this.setRefreshId(other.getRefreshId());
                }
                if (other.getRewardId() != 0) {
                    this.setRewardId(other.getRewardId());
                }
                if (other.getCityId() != 0) {
                    this.setCityId(other.getCityId());
                }
                if (other.getResin() != 0) {
                    this.setResin(other.getResin());
                }
                if (other.getState() != 0) {
                    this.setState(other.getState());
                }
                if (other.getIsGuideOpened()) {
                    this.setIsGuideOpened(other.getIsGuideOpened());
                }
                if (other.getMonsterLevel() != 0) {
                    this.setMonsterLevel(other.getMonsterLevel());
                }
                if (other.getCircleCampId() != 0) {
                    this.setCircleCampId(other.getCircleCampId());
                }
                if (other.hasPos()) {
                    this.mergePos(other.getPos());
                }
                if (other.getSceneId() != 0) {
                    this.setSceneId(other.getSceneId());
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
                BlossomBriefInfo parsedMessage = null;
                try {
                    parsedMessage = BlossomBriefInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BlossomBriefInfo)e.getUnfinishedMessage();
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
            public int getRefreshId() {
                return this.refreshId_;
            }
            
            public Builder setRefreshId(final int value) {
                this.refreshId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRefreshId() {
                this.refreshId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRewardId() {
                return this.rewardId_;
            }
            
            public Builder setRewardId(final int value) {
                this.rewardId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRewardId() {
                this.rewardId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCityId() {
                return this.cityId_;
            }
            
            public Builder setCityId(final int value) {
                this.cityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCityId() {
                this.cityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getResin() {
                return this.resin_;
            }
            
            public Builder setResin(final int value) {
                this.resin_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearResin() {
                this.resin_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getState() {
                return this.state_;
            }
            
            public Builder setState(final int value) {
                this.state_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearState() {
                this.state_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsGuideOpened() {
                return this.isGuideOpened_;
            }
            
            public Builder setIsGuideOpened(final boolean value) {
                this.isGuideOpened_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsGuideOpened() {
                this.isGuideOpened_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMonsterLevel() {
                return this.monsterLevel_;
            }
            
            public Builder setMonsterLevel(final int value) {
                this.monsterLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMonsterLevel() {
                this.monsterLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCircleCampId() {
                return this.circleCampId_;
            }
            
            public Builder setCircleCampId(final int value) {
                this.circleCampId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCircleCampId() {
                this.circleCampId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasPos() {
                return this.posBuilder_ != null || this.pos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getPos() {
                if (this.posBuilder_ == null) {
                    return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
                }
                return this.posBuilder_.getMessage();
            }
            
            public Builder setPos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.pos_ = value;
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.posBuilder_ == null) {
                    this.pos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.posBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergePos(final VectorOuterClass.Vector value) {
                if (this.posBuilder_ == null) {
                    if (this.pos_ != null) {
                        this.pos_ = VectorOuterClass.Vector.newBuilder(this.pos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.pos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.posBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearPos() {
                if (this.posBuilder_ == null) {
                    this.pos_ = null;
                    this.onChanged();
                }
                else {
                    this.pos_ = null;
                    this.posBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getPosBuilder() {
                this.onChanged();
                return this.getPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
                if (this.posBuilder_ != null) {
                    return this.posBuilder_.getMessageOrBuilder();
                }
                return (this.pos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.pos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getPosFieldBuilder() {
                if (this.posBuilder_ == null) {
                    this.posBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getPos(), this.getParentForChildren(), this.isClean());
                    this.pos_ = null;
                }
                return this.posBuilder_;
            }
            
            @Override
            public int getSceneId() {
                return this.sceneId_;
            }
            
            public Builder setSceneId(final int value) {
                this.sceneId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSceneId() {
                this.sceneId_ = 0;
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
    
    public interface BlossomBriefInfoOrBuilder extends MessageOrBuilder
    {
        int getRefreshId();
        
        int getRewardId();
        
        int getCityId();
        
        int getResin();
        
        int getState();
        
        boolean getIsGuideOpened();
        
        int getMonsterLevel();
        
        int getCircleCampId();
        
        boolean hasPos();
        
        VectorOuterClass.Vector getPos();
        
        VectorOuterClass.VectorOrBuilder getPosOrBuilder();
        
        int getSceneId();
    }
}
