// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
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
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class TowerLevelStarCondNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerLevelStarCondNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerLevelStarCondNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerLevelStarCondNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerLevelStarCondNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eTowerLevelStarCondNotify.proto\u001a\u001cTowerLevelStarCondData.proto\"r\n\u0018TowerLevelStarCondNotify\u0012\u0013\n\u000blevel_index\u0018\u000e \u0001(\r\u0012\u0010\n\bfloor_id\u0018\u000b \u0001(\r\u0012/\n\u000econd_data_list\u0018\t \u0003(\u000b2\u0017.TowerLevelStarCondDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerLevelStarCondNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { TowerLevelStarCondDataOuterClass.getDescriptor() });
        internal_static_TowerLevelStarCondNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerLevelStarCondNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerLevelStarCondNotifyOuterClass.internal_static_TowerLevelStarCondNotify_descriptor, new String[] { "LevelIndex", "FloorId", "CondDataList" });
        TowerLevelStarCondDataOuterClass.getDescriptor();
    }
    
    public static final class TowerLevelStarCondNotify extends GeneratedMessageV3 implements TowerLevelStarCondNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LEVEL_INDEX_FIELD_NUMBER = 14;
        private int levelIndex_;
        public static final int FLOOR_ID_FIELD_NUMBER = 11;
        private int floorId_;
        public static final int COND_DATA_LIST_FIELD_NUMBER = 9;
        private List<TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> condDataList_;
        private byte memoizedIsInitialized;
        private static final TowerLevelStarCondNotify DEFAULT_INSTANCE;
        private static final Parser<TowerLevelStarCondNotify> PARSER;
        
        private TowerLevelStarCondNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TowerLevelStarCondNotify() {
            this.memoizedIsInitialized = -1;
            this.condDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerLevelStarCondNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerLevelStarCondNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 74: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.condDataList_ = new ArrayList<TowerLevelStarCondDataOuterClass.TowerLevelStarCondData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.condDataList_.add(input.readMessage(TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.parser(), extensionRegistry));
                            continue;
                        }
                        case 88: {
                            this.floorId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.levelIndex_ = input.readUInt32();
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
                    this.condDataList_ = Collections.unmodifiableList((List<? extends TowerLevelStarCondDataOuterClass.TowerLevelStarCondData>)this.condDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TowerLevelStarCondNotifyOuterClass.internal_static_TowerLevelStarCondNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerLevelStarCondNotifyOuterClass.internal_static_TowerLevelStarCondNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerLevelStarCondNotify.class, Builder.class);
        }
        
        @Override
        public int getLevelIndex() {
            return this.levelIndex_;
        }
        
        @Override
        public int getFloorId() {
            return this.floorId_;
        }
        
        @Override
        public List<TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> getCondDataListList() {
            return this.condDataList_;
        }
        
        @Override
        public List<? extends TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder> getCondDataListOrBuilderList() {
            return this.condDataList_;
        }
        
        @Override
        public int getCondDataListCount() {
            return this.condDataList_.size();
        }
        
        @Override
        public TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getCondDataList(final int index) {
            return this.condDataList_.get(index);
        }
        
        @Override
        public TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder getCondDataListOrBuilder(final int index) {
            return this.condDataList_.get(index);
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
            for (int i = 0; i < this.condDataList_.size(); ++i) {
                output.writeMessage(9, this.condDataList_.get(i));
            }
            if (this.floorId_ != 0) {
                output.writeUInt32(11, this.floorId_);
            }
            if (this.levelIndex_ != 0) {
                output.writeUInt32(14, this.levelIndex_);
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
            for (int i = 0; i < this.condDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.condDataList_.get(i));
            }
            if (this.floorId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.floorId_);
            }
            if (this.levelIndex_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.levelIndex_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerLevelStarCondNotify)) {
                return super.equals(obj);
            }
            final TowerLevelStarCondNotify other = (TowerLevelStarCondNotify)obj;
            return this.getLevelIndex() == other.getLevelIndex() && this.getFloorId() == other.getFloorId() && this.getCondDataListList().equals(other.getCondDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getLevelIndex();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getFloorId();
            if (this.getCondDataListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getCondDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerLevelStarCondNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerLevelStarCondNotify.PARSER.parseFrom(data);
        }
        
        public static TowerLevelStarCondNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelStarCondNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelStarCondNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerLevelStarCondNotify.PARSER.parseFrom(data);
        }
        
        public static TowerLevelStarCondNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelStarCondNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelStarCondNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerLevelStarCondNotify.PARSER.parseFrom(data);
        }
        
        public static TowerLevelStarCondNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerLevelStarCondNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerLevelStarCondNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelStarCondNotify.PARSER, input);
        }
        
        public static TowerLevelStarCondNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelStarCondNotify.PARSER, input, extensionRegistry);
        }
        
        public static TowerLevelStarCondNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerLevelStarCondNotify.PARSER, input);
        }
        
        public static TowerLevelStarCondNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerLevelStarCondNotify.PARSER, input, extensionRegistry);
        }
        
        public static TowerLevelStarCondNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelStarCondNotify.PARSER, input);
        }
        
        public static TowerLevelStarCondNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerLevelStarCondNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerLevelStarCondNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerLevelStarCondNotify prototype) {
            return TowerLevelStarCondNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerLevelStarCondNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerLevelStarCondNotify getDefaultInstance() {
            return TowerLevelStarCondNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerLevelStarCondNotify> parser() {
            return TowerLevelStarCondNotify.PARSER;
        }
        
        @Override
        public Parser<TowerLevelStarCondNotify> getParserForType() {
            return TowerLevelStarCondNotify.PARSER;
        }
        
        @Override
        public TowerLevelStarCondNotify getDefaultInstanceForType() {
            return TowerLevelStarCondNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerLevelStarCondNotify();
            PARSER = new AbstractParser<TowerLevelStarCondNotify>() {
                @Override
                public TowerLevelStarCondNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerLevelStarCondNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerLevelStarCondNotifyOrBuilder
        {
            private int bitField0_;
            private int levelIndex_;
            private int floorId_;
            private List<TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> condDataList_;
            private RepeatedFieldBuilderV3<TowerLevelStarCondDataOuterClass.TowerLevelStarCondData, TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder, TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder> condDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerLevelStarCondNotifyOuterClass.internal_static_TowerLevelStarCondNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerLevelStarCondNotifyOuterClass.internal_static_TowerLevelStarCondNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerLevelStarCondNotify.class, Builder.class);
            }
            
            private Builder() {
                this.condDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.condDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerLevelStarCondNotify.alwaysUseFieldBuilders) {
                    this.getCondDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.levelIndex_ = 0;
                this.floorId_ = 0;
                if (this.condDataListBuilder_ == null) {
                    this.condDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.condDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerLevelStarCondNotifyOuterClass.internal_static_TowerLevelStarCondNotify_descriptor;
            }
            
            @Override
            public TowerLevelStarCondNotify getDefaultInstanceForType() {
                return TowerLevelStarCondNotify.getDefaultInstance();
            }
            
            @Override
            public TowerLevelStarCondNotify build() {
                final TowerLevelStarCondNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerLevelStarCondNotify buildPartial() {
                final TowerLevelStarCondNotify result = new TowerLevelStarCondNotify(this);
                final int from_bitField0_ = this.bitField0_;
                result.levelIndex_ = this.levelIndex_;
                result.floorId_ = this.floorId_;
                if (this.condDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.condDataList_ = Collections.unmodifiableList((List<? extends TowerLevelStarCondDataOuterClass.TowerLevelStarCondData>)this.condDataList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.condDataList_ = this.condDataList_;
                }
                else {
                    result.condDataList_ = this.condDataListBuilder_.build();
                }
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
                if (other instanceof TowerLevelStarCondNotify) {
                    return this.mergeFrom((TowerLevelStarCondNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerLevelStarCondNotify other) {
                if (other == TowerLevelStarCondNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getLevelIndex() != 0) {
                    this.setLevelIndex(other.getLevelIndex());
                }
                if (other.getFloorId() != 0) {
                    this.setFloorId(other.getFloorId());
                }
                if (this.condDataListBuilder_ == null) {
                    if (!other.condDataList_.isEmpty()) {
                        if (this.condDataList_.isEmpty()) {
                            this.condDataList_ = other.condDataList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureCondDataListIsMutable();
                            this.condDataList_.addAll(other.condDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.condDataList_.isEmpty()) {
                    if (this.condDataListBuilder_.isEmpty()) {
                        this.condDataListBuilder_.dispose();
                        this.condDataListBuilder_ = null;
                        this.condDataList_ = other.condDataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.condDataListBuilder_ = (TowerLevelStarCondNotify.alwaysUseFieldBuilders ? this.getCondDataListFieldBuilder() : null);
                    }
                    else {
                        this.condDataListBuilder_.addAllMessages(other.condDataList_);
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
                TowerLevelStarCondNotify parsedMessage = null;
                try {
                    parsedMessage = TowerLevelStarCondNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerLevelStarCondNotify)e.getUnfinishedMessage();
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
            public int getLevelIndex() {
                return this.levelIndex_;
            }
            
            public Builder setLevelIndex(final int value) {
                this.levelIndex_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevelIndex() {
                this.levelIndex_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFloorId() {
                return this.floorId_;
            }
            
            public Builder setFloorId(final int value) {
                this.floorId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFloorId() {
                this.floorId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureCondDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.condDataList_ = new ArrayList<TowerLevelStarCondDataOuterClass.TowerLevelStarCondData>(this.condDataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> getCondDataListList() {
                if (this.condDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends TowerLevelStarCondDataOuterClass.TowerLevelStarCondData>)this.condDataList_);
                }
                return this.condDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getCondDataListCount() {
                if (this.condDataListBuilder_ == null) {
                    return this.condDataList_.size();
                }
                return this.condDataListBuilder_.getCount();
            }
            
            @Override
            public TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getCondDataList(final int index) {
                if (this.condDataListBuilder_ == null) {
                    return this.condDataList_.get(index);
                }
                return this.condDataListBuilder_.getMessage(index);
            }
            
            public Builder setCondDataList(final int index, final TowerLevelStarCondDataOuterClass.TowerLevelStarCondData value) {
                if (this.condDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCondDataListIsMutable();
                    this.condDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.condDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setCondDataList(final int index, final TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder builderForValue) {
                if (this.condDataListBuilder_ == null) {
                    this.ensureCondDataListIsMutable();
                    this.condDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.condDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addCondDataList(final TowerLevelStarCondDataOuterClass.TowerLevelStarCondData value) {
                if (this.condDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCondDataListIsMutable();
                    this.condDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.condDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addCondDataList(final int index, final TowerLevelStarCondDataOuterClass.TowerLevelStarCondData value) {
                if (this.condDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureCondDataListIsMutable();
                    this.condDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.condDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addCondDataList(final TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder builderForValue) {
                if (this.condDataListBuilder_ == null) {
                    this.ensureCondDataListIsMutable();
                    this.condDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.condDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addCondDataList(final int index, final TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder builderForValue) {
                if (this.condDataListBuilder_ == null) {
                    this.ensureCondDataListIsMutable();
                    this.condDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.condDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllCondDataList(final Iterable<? extends TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> values) {
                if (this.condDataListBuilder_ == null) {
                    this.ensureCondDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.condDataList_);
                    this.onChanged();
                }
                else {
                    this.condDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearCondDataList() {
                if (this.condDataListBuilder_ == null) {
                    this.condDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.condDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeCondDataList(final int index) {
                if (this.condDataListBuilder_ == null) {
                    this.ensureCondDataListIsMutable();
                    this.condDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.condDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder getCondDataListBuilder(final int index) {
                return this.getCondDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder getCondDataListOrBuilder(final int index) {
                if (this.condDataListBuilder_ == null) {
                    return this.condDataList_.get(index);
                }
                return this.condDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder> getCondDataListOrBuilderList() {
                if (this.condDataListBuilder_ != null) {
                    return this.condDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder>)this.condDataList_);
            }
            
            public TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder addCondDataListBuilder() {
                return this.getCondDataListFieldBuilder().addBuilder(TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance());
            }
            
            public TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder addCondDataListBuilder(final int index) {
                return this.getCondDataListFieldBuilder().addBuilder(index, TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.getDefaultInstance());
            }
            
            public List<TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder> getCondDataListBuilderList() {
                return this.getCondDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<TowerLevelStarCondDataOuterClass.TowerLevelStarCondData, TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder, TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder> getCondDataListFieldBuilder() {
                if (this.condDataListBuilder_ == null) {
                    this.condDataListBuilder_ = new RepeatedFieldBuilderV3<TowerLevelStarCondDataOuterClass.TowerLevelStarCondData, TowerLevelStarCondDataOuterClass.TowerLevelStarCondData.Builder, TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder>(this.condDataList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.condDataList_ = null;
                }
                return this.condDataListBuilder_;
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
    
    public interface TowerLevelStarCondNotifyOrBuilder extends MessageOrBuilder
    {
        int getLevelIndex();
        
        int getFloorId();
        
        List<TowerLevelStarCondDataOuterClass.TowerLevelStarCondData> getCondDataListList();
        
        TowerLevelStarCondDataOuterClass.TowerLevelStarCondData getCondDataList(final int p0);
        
        int getCondDataListCount();
        
        List<? extends TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder> getCondDataListOrBuilderList();
        
        TowerLevelStarCondDataOuterClass.TowerLevelStarCondDataOrBuilder getCondDataListOrBuilder(final int p0);
    }
}
