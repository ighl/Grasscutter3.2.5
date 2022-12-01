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

public final class DailyDungeonEntryInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_DailyDungeonEntryInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DailyDungeonEntryInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DailyDungeonEntryInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DailyDungeonEntryInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bDailyDungeonEntryInfo.proto\u001a\u0016DungeonEntryInfo.proto\"©\u0001\n\u0015DailyDungeonEntryInfo\u0012\u001f\n\u0017dungeon_entry_config_id\u0018\f \u0001(\r\u0012\u0018\n\u0010dungeon_entry_id\u0018\u000f \u0001(\r\u00127\n\u001crecommend_dungeon_entry_info\u0018\u0001 \u0001(\u000b2\u0011.DungeonEntryInfo\u0012\u001c\n\u0014recommend_dungeon_id\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DailyDungeonEntryInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { DungeonEntryInfoOuterClass.getDescriptor() });
        internal_static_DailyDungeonEntryInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DailyDungeonEntryInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DailyDungeonEntryInfoOuterClass.internal_static_DailyDungeonEntryInfo_descriptor, new String[] { "DungeonEntryConfigId", "DungeonEntryId", "RecommendDungeonEntryInfo", "RecommendDungeonId" });
        DungeonEntryInfoOuterClass.getDescriptor();
    }
    
    public static final class DailyDungeonEntryInfo extends GeneratedMessageV3 implements DailyDungeonEntryInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DUNGEON_ENTRY_CONFIG_ID_FIELD_NUMBER = 12;
        private int dungeonEntryConfigId_;
        public static final int DUNGEON_ENTRY_ID_FIELD_NUMBER = 15;
        private int dungeonEntryId_;
        public static final int RECOMMEND_DUNGEON_ENTRY_INFO_FIELD_NUMBER = 1;
        private DungeonEntryInfoOuterClass.DungeonEntryInfo recommendDungeonEntryInfo_;
        public static final int RECOMMEND_DUNGEON_ID_FIELD_NUMBER = 4;
        private int recommendDungeonId_;
        private byte memoizedIsInitialized;
        private static final DailyDungeonEntryInfo DEFAULT_INSTANCE;
        private static final Parser<DailyDungeonEntryInfo> PARSER;
        
        private DailyDungeonEntryInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private DailyDungeonEntryInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DailyDungeonEntryInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DailyDungeonEntryInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder subBuilder = null;
                            if (this.recommendDungeonEntryInfo_ != null) {
                                subBuilder = this.recommendDungeonEntryInfo_.toBuilder();
                            }
                            this.recommendDungeonEntryInfo_ = input.readMessage(DungeonEntryInfoOuterClass.DungeonEntryInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.recommendDungeonEntryInfo_);
                                this.recommendDungeonEntryInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 32: {
                            this.recommendDungeonId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.dungeonEntryConfigId_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.dungeonEntryId_ = input.readUInt32();
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
            return DailyDungeonEntryInfoOuterClass.internal_static_DailyDungeonEntryInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DailyDungeonEntryInfoOuterClass.internal_static_DailyDungeonEntryInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DailyDungeonEntryInfo.class, Builder.class);
        }
        
        @Override
        public int getDungeonEntryConfigId() {
            return this.dungeonEntryConfigId_;
        }
        
        @Override
        public int getDungeonEntryId() {
            return this.dungeonEntryId_;
        }
        
        @Override
        public boolean hasRecommendDungeonEntryInfo() {
            return this.recommendDungeonEntryInfo_ != null;
        }
        
        @Override
        public DungeonEntryInfoOuterClass.DungeonEntryInfo getRecommendDungeonEntryInfo() {
            return (this.recommendDungeonEntryInfo_ == null) ? DungeonEntryInfoOuterClass.DungeonEntryInfo.getDefaultInstance() : this.recommendDungeonEntryInfo_;
        }
        
        @Override
        public DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder getRecommendDungeonEntryInfoOrBuilder() {
            return this.getRecommendDungeonEntryInfo();
        }
        
        @Override
        public int getRecommendDungeonId() {
            return this.recommendDungeonId_;
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
            if (this.recommendDungeonEntryInfo_ != null) {
                output.writeMessage(1, this.getRecommendDungeonEntryInfo());
            }
            if (this.recommendDungeonId_ != 0) {
                output.writeUInt32(4, this.recommendDungeonId_);
            }
            if (this.dungeonEntryConfigId_ != 0) {
                output.writeUInt32(12, this.dungeonEntryConfigId_);
            }
            if (this.dungeonEntryId_ != 0) {
                output.writeUInt32(15, this.dungeonEntryId_);
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
            if (this.recommendDungeonEntryInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getRecommendDungeonEntryInfo());
            }
            if (this.recommendDungeonId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.recommendDungeonId_);
            }
            if (this.dungeonEntryConfigId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.dungeonEntryConfigId_);
            }
            if (this.dungeonEntryId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.dungeonEntryId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DailyDungeonEntryInfo)) {
                return super.equals(obj);
            }
            final DailyDungeonEntryInfo other = (DailyDungeonEntryInfo)obj;
            return this.getDungeonEntryConfigId() == other.getDungeonEntryConfigId() && this.getDungeonEntryId() == other.getDungeonEntryId() && this.hasRecommendDungeonEntryInfo() == other.hasRecommendDungeonEntryInfo() && (!this.hasRecommendDungeonEntryInfo() || this.getRecommendDungeonEntryInfo().equals(other.getRecommendDungeonEntryInfo())) && this.getRecommendDungeonId() == other.getRecommendDungeonId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getDungeonEntryConfigId();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getDungeonEntryId();
            if (this.hasRecommendDungeonEntryInfo()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getRecommendDungeonEntryInfo().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getRecommendDungeonId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DailyDungeonEntryInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DailyDungeonEntryInfo.PARSER.parseFrom(data);
        }
        
        public static DailyDungeonEntryInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DailyDungeonEntryInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DailyDungeonEntryInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DailyDungeonEntryInfo.PARSER.parseFrom(data);
        }
        
        public static DailyDungeonEntryInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DailyDungeonEntryInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DailyDungeonEntryInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DailyDungeonEntryInfo.PARSER.parseFrom(data);
        }
        
        public static DailyDungeonEntryInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DailyDungeonEntryInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DailyDungeonEntryInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DailyDungeonEntryInfo.PARSER, input);
        }
        
        public static DailyDungeonEntryInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DailyDungeonEntryInfo.PARSER, input, extensionRegistry);
        }
        
        public static DailyDungeonEntryInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DailyDungeonEntryInfo.PARSER, input);
        }
        
        public static DailyDungeonEntryInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DailyDungeonEntryInfo.PARSER, input, extensionRegistry);
        }
        
        public static DailyDungeonEntryInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DailyDungeonEntryInfo.PARSER, input);
        }
        
        public static DailyDungeonEntryInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DailyDungeonEntryInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DailyDungeonEntryInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DailyDungeonEntryInfo prototype) {
            return DailyDungeonEntryInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DailyDungeonEntryInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DailyDungeonEntryInfo getDefaultInstance() {
            return DailyDungeonEntryInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<DailyDungeonEntryInfo> parser() {
            return DailyDungeonEntryInfo.PARSER;
        }
        
        @Override
        public Parser<DailyDungeonEntryInfo> getParserForType() {
            return DailyDungeonEntryInfo.PARSER;
        }
        
        @Override
        public DailyDungeonEntryInfo getDefaultInstanceForType() {
            return DailyDungeonEntryInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DailyDungeonEntryInfo();
            PARSER = new AbstractParser<DailyDungeonEntryInfo>() {
                @Override
                public DailyDungeonEntryInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DailyDungeonEntryInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DailyDungeonEntryInfoOrBuilder
        {
            private int dungeonEntryConfigId_;
            private int dungeonEntryId_;
            private DungeonEntryInfoOuterClass.DungeonEntryInfo recommendDungeonEntryInfo_;
            private SingleFieldBuilderV3<DungeonEntryInfoOuterClass.DungeonEntryInfo, DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder, DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> recommendDungeonEntryInfoBuilder_;
            private int recommendDungeonId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DailyDungeonEntryInfoOuterClass.internal_static_DailyDungeonEntryInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DailyDungeonEntryInfoOuterClass.internal_static_DailyDungeonEntryInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(DailyDungeonEntryInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DailyDungeonEntryInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.dungeonEntryConfigId_ = 0;
                this.dungeonEntryId_ = 0;
                if (this.recommendDungeonEntryInfoBuilder_ == null) {
                    this.recommendDungeonEntryInfo_ = null;
                }
                else {
                    this.recommendDungeonEntryInfo_ = null;
                    this.recommendDungeonEntryInfoBuilder_ = null;
                }
                this.recommendDungeonId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DailyDungeonEntryInfoOuterClass.internal_static_DailyDungeonEntryInfo_descriptor;
            }
            
            @Override
            public DailyDungeonEntryInfo getDefaultInstanceForType() {
                return DailyDungeonEntryInfo.getDefaultInstance();
            }
            
            @Override
            public DailyDungeonEntryInfo build() {
                final DailyDungeonEntryInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DailyDungeonEntryInfo buildPartial() {
                final DailyDungeonEntryInfo result = new DailyDungeonEntryInfo(this);
                result.dungeonEntryConfigId_ = this.dungeonEntryConfigId_;
                result.dungeonEntryId_ = this.dungeonEntryId_;
                if (this.recommendDungeonEntryInfoBuilder_ == null) {
                    result.recommendDungeonEntryInfo_ = this.recommendDungeonEntryInfo_;
                }
                else {
                    result.recommendDungeonEntryInfo_ = this.recommendDungeonEntryInfoBuilder_.build();
                }
                result.recommendDungeonId_ = this.recommendDungeonId_;
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
                if (other instanceof DailyDungeonEntryInfo) {
                    return this.mergeFrom((DailyDungeonEntryInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DailyDungeonEntryInfo other) {
                if (other == DailyDungeonEntryInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getDungeonEntryConfigId() != 0) {
                    this.setDungeonEntryConfigId(other.getDungeonEntryConfigId());
                }
                if (other.getDungeonEntryId() != 0) {
                    this.setDungeonEntryId(other.getDungeonEntryId());
                }
                if (other.hasRecommendDungeonEntryInfo()) {
                    this.mergeRecommendDungeonEntryInfo(other.getRecommendDungeonEntryInfo());
                }
                if (other.getRecommendDungeonId() != 0) {
                    this.setRecommendDungeonId(other.getRecommendDungeonId());
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
                DailyDungeonEntryInfo parsedMessage = null;
                try {
                    parsedMessage = DailyDungeonEntryInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DailyDungeonEntryInfo)e.getUnfinishedMessage();
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
            public int getDungeonEntryConfigId() {
                return this.dungeonEntryConfigId_;
            }
            
            public Builder setDungeonEntryConfigId(final int value) {
                this.dungeonEntryConfigId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDungeonEntryConfigId() {
                this.dungeonEntryConfigId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDungeonEntryId() {
                return this.dungeonEntryId_;
            }
            
            public Builder setDungeonEntryId(final int value) {
                this.dungeonEntryId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDungeonEntryId() {
                this.dungeonEntryId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasRecommendDungeonEntryInfo() {
                return this.recommendDungeonEntryInfoBuilder_ != null || this.recommendDungeonEntryInfo_ != null;
            }
            
            @Override
            public DungeonEntryInfoOuterClass.DungeonEntryInfo getRecommendDungeonEntryInfo() {
                if (this.recommendDungeonEntryInfoBuilder_ == null) {
                    return (this.recommendDungeonEntryInfo_ == null) ? DungeonEntryInfoOuterClass.DungeonEntryInfo.getDefaultInstance() : this.recommendDungeonEntryInfo_;
                }
                return this.recommendDungeonEntryInfoBuilder_.getMessage();
            }
            
            public Builder setRecommendDungeonEntryInfo(final DungeonEntryInfoOuterClass.DungeonEntryInfo value) {
                if (this.recommendDungeonEntryInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.recommendDungeonEntryInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.recommendDungeonEntryInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRecommendDungeonEntryInfo(final DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder builderForValue) {
                if (this.recommendDungeonEntryInfoBuilder_ == null) {
                    this.recommendDungeonEntryInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.recommendDungeonEntryInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRecommendDungeonEntryInfo(final DungeonEntryInfoOuterClass.DungeonEntryInfo value) {
                if (this.recommendDungeonEntryInfoBuilder_ == null) {
                    if (this.recommendDungeonEntryInfo_ != null) {
                        this.recommendDungeonEntryInfo_ = DungeonEntryInfoOuterClass.DungeonEntryInfo.newBuilder(this.recommendDungeonEntryInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.recommendDungeonEntryInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.recommendDungeonEntryInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRecommendDungeonEntryInfo() {
                if (this.recommendDungeonEntryInfoBuilder_ == null) {
                    this.recommendDungeonEntryInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.recommendDungeonEntryInfo_ = null;
                    this.recommendDungeonEntryInfoBuilder_ = null;
                }
                return this;
            }
            
            public DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder getRecommendDungeonEntryInfoBuilder() {
                this.onChanged();
                return this.getRecommendDungeonEntryInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder getRecommendDungeonEntryInfoOrBuilder() {
                if (this.recommendDungeonEntryInfoBuilder_ != null) {
                    return this.recommendDungeonEntryInfoBuilder_.getMessageOrBuilder();
                }
                return (this.recommendDungeonEntryInfo_ == null) ? DungeonEntryInfoOuterClass.DungeonEntryInfo.getDefaultInstance() : this.recommendDungeonEntryInfo_;
            }
            
            private SingleFieldBuilderV3<DungeonEntryInfoOuterClass.DungeonEntryInfo, DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder, DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder> getRecommendDungeonEntryInfoFieldBuilder() {
                if (this.recommendDungeonEntryInfoBuilder_ == null) {
                    this.recommendDungeonEntryInfoBuilder_ = new SingleFieldBuilderV3<DungeonEntryInfoOuterClass.DungeonEntryInfo, DungeonEntryInfoOuterClass.DungeonEntryInfo.Builder, DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder>(this.getRecommendDungeonEntryInfo(), this.getParentForChildren(), this.isClean());
                    this.recommendDungeonEntryInfo_ = null;
                }
                return this.recommendDungeonEntryInfoBuilder_;
            }
            
            @Override
            public int getRecommendDungeonId() {
                return this.recommendDungeonId_;
            }
            
            public Builder setRecommendDungeonId(final int value) {
                this.recommendDungeonId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRecommendDungeonId() {
                this.recommendDungeonId_ = 0;
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
    
    public interface DailyDungeonEntryInfoOrBuilder extends MessageOrBuilder
    {
        int getDungeonEntryConfigId();
        
        int getDungeonEntryId();
        
        boolean hasRecommendDungeonEntryInfo();
        
        DungeonEntryInfoOuterClass.DungeonEntryInfo getRecommendDungeonEntryInfo();
        
        DungeonEntryInfoOuterClass.DungeonEntryInfoOrBuilder getRecommendDungeonEntryInfoOrBuilder();
        
        int getRecommendDungeonId();
    }
}
