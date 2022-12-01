// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
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

public final class FishPoolInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_FishPoolInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FishPoolInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FishPoolInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FishPoolInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012FishPoolInfo.proto\"O\n\fFishPoolInfo\u0012\u000f\n\u0007pool_id\u0018\u0001 \u0001(\r\u0012\u0016\n\u000efish_area_list\u0018\u0002 \u0003(\r\u0012\u0016\n\u000etoday_fish_num\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FishPoolInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_FishPoolInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FishPoolInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FishPoolInfoOuterClass.internal_static_FishPoolInfo_descriptor, new String[] { "PoolId", "FishAreaList", "TodayFishNum" });
    }
    
    public static final class FishPoolInfo extends GeneratedMessageV3 implements FishPoolInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int POOL_ID_FIELD_NUMBER = 1;
        private int poolId_;
        public static final int FISH_AREA_LIST_FIELD_NUMBER = 2;
        private Internal.IntList fishAreaList_;
        private int fishAreaListMemoizedSerializedSize;
        public static final int TODAY_FISH_NUM_FIELD_NUMBER = 3;
        private int todayFishNum_;
        private byte memoizedIsInitialized;
        private static final FishPoolInfo DEFAULT_INSTANCE;
        private static final Parser<FishPoolInfo> PARSER;
        
        private FishPoolInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.fishAreaListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private FishPoolInfo() {
            this.fishAreaListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.fishAreaList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FishPoolInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FishPoolInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.poolId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.fishAreaList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.fishAreaList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 18: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.fishAreaList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.fishAreaList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 24: {
                            this.todayFishNum_ = input.readUInt32();
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
                    this.fishAreaList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return FishPoolInfoOuterClass.internal_static_FishPoolInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FishPoolInfoOuterClass.internal_static_FishPoolInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FishPoolInfo.class, Builder.class);
        }
        
        @Override
        public int getPoolId() {
            return this.poolId_;
        }
        
        @Override
        public List<Integer> getFishAreaListList() {
            return this.fishAreaList_;
        }
        
        @Override
        public int getFishAreaListCount() {
            return this.fishAreaList_.size();
        }
        
        @Override
        public int getFishAreaList(final int index) {
            return this.fishAreaList_.getInt(index);
        }
        
        @Override
        public int getTodayFishNum() {
            return this.todayFishNum_;
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
            if (this.poolId_ != 0) {
                output.writeUInt32(1, this.poolId_);
            }
            if (this.getFishAreaListList().size() > 0) {
                output.writeUInt32NoTag(18);
                output.writeUInt32NoTag(this.fishAreaListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.fishAreaList_.size(); ++i) {
                output.writeUInt32NoTag(this.fishAreaList_.getInt(i));
            }
            if (this.todayFishNum_ != 0) {
                output.writeUInt32(3, this.todayFishNum_);
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
            if (this.poolId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.poolId_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.fishAreaList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.fishAreaList_.getInt(i));
            }
            size += dataSize;
            if (!this.getFishAreaListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.fishAreaListMemoizedSerializedSize = dataSize;
            if (this.todayFishNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.todayFishNum_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FishPoolInfo)) {
                return super.equals(obj);
            }
            final FishPoolInfo other = (FishPoolInfo)obj;
            return this.getPoolId() == other.getPoolId() && this.getFishAreaListList().equals(other.getFishAreaListList()) && this.getTodayFishNum() == other.getTodayFishNum() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getPoolId();
            if (this.getFishAreaListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getFishAreaListList().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getTodayFishNum();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FishPoolInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FishPoolInfo.PARSER.parseFrom(data);
        }
        
        public static FishPoolInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FishPoolInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FishPoolInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FishPoolInfo.PARSER.parseFrom(data);
        }
        
        public static FishPoolInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FishPoolInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FishPoolInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FishPoolInfo.PARSER.parseFrom(data);
        }
        
        public static FishPoolInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FishPoolInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FishPoolInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FishPoolInfo.PARSER, input);
        }
        
        public static FishPoolInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FishPoolInfo.PARSER, input, extensionRegistry);
        }
        
        public static FishPoolInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FishPoolInfo.PARSER, input);
        }
        
        public static FishPoolInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FishPoolInfo.PARSER, input, extensionRegistry);
        }
        
        public static FishPoolInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FishPoolInfo.PARSER, input);
        }
        
        public static FishPoolInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FishPoolInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FishPoolInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FishPoolInfo prototype) {
            return FishPoolInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FishPoolInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FishPoolInfo getDefaultInstance() {
            return FishPoolInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<FishPoolInfo> parser() {
            return FishPoolInfo.PARSER;
        }
        
        @Override
        public Parser<FishPoolInfo> getParserForType() {
            return FishPoolInfo.PARSER;
        }
        
        @Override
        public FishPoolInfo getDefaultInstanceForType() {
            return FishPoolInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FishPoolInfo();
            PARSER = new AbstractParser<FishPoolInfo>() {
                @Override
                public FishPoolInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FishPoolInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FishPoolInfoOrBuilder
        {
            private int bitField0_;
            private int poolId_;
            private Internal.IntList fishAreaList_;
            private int todayFishNum_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FishPoolInfoOuterClass.internal_static_FishPoolInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FishPoolInfoOuterClass.internal_static_FishPoolInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FishPoolInfo.class, Builder.class);
            }
            
            private Builder() {
                this.fishAreaList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.fishAreaList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FishPoolInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.poolId_ = 0;
                this.fishAreaList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.todayFishNum_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FishPoolInfoOuterClass.internal_static_FishPoolInfo_descriptor;
            }
            
            @Override
            public FishPoolInfo getDefaultInstanceForType() {
                return FishPoolInfo.getDefaultInstance();
            }
            
            @Override
            public FishPoolInfo build() {
                final FishPoolInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FishPoolInfo buildPartial() {
                final FishPoolInfo result = new FishPoolInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.poolId_ = this.poolId_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.fishAreaList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.fishAreaList_ = this.fishAreaList_;
                result.todayFishNum_ = this.todayFishNum_;
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
                if (other instanceof FishPoolInfo) {
                    return this.mergeFrom((FishPoolInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FishPoolInfo other) {
                if (other == FishPoolInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getPoolId() != 0) {
                    this.setPoolId(other.getPoolId());
                }
                if (!other.fishAreaList_.isEmpty()) {
                    if (this.fishAreaList_.isEmpty()) {
                        this.fishAreaList_ = other.fishAreaList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureFishAreaListIsMutable();
                        this.fishAreaList_.addAll(other.fishAreaList_);
                    }
                    this.onChanged();
                }
                if (other.getTodayFishNum() != 0) {
                    this.setTodayFishNum(other.getTodayFishNum());
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
                FishPoolInfo parsedMessage = null;
                try {
                    parsedMessage = FishPoolInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FishPoolInfo)e.getUnfinishedMessage();
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
            public int getPoolId() {
                return this.poolId_;
            }
            
            public Builder setPoolId(final int value) {
                this.poolId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPoolId() {
                this.poolId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureFishAreaListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.fishAreaList_ = GeneratedMessageV3.mutableCopy(this.fishAreaList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getFishAreaListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.fishAreaList_) : this.fishAreaList_;
            }
            
            @Override
            public int getFishAreaListCount() {
                return this.fishAreaList_.size();
            }
            
            @Override
            public int getFishAreaList(final int index) {
                return this.fishAreaList_.getInt(index);
            }
            
            public Builder setFishAreaList(final int index, final int value) {
                this.ensureFishAreaListIsMutable();
                this.fishAreaList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFishAreaList(final int value) {
                this.ensureFishAreaListIsMutable();
                this.fishAreaList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFishAreaList(final Iterable<? extends Integer> values) {
                this.ensureFishAreaListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.fishAreaList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFishAreaList() {
                this.fishAreaList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTodayFishNum() {
                return this.todayFishNum_;
            }
            
            public Builder setTodayFishNum(final int value) {
                this.todayFishNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTodayFishNum() {
                this.todayFishNum_ = 0;
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
    
    public interface FishPoolInfoOrBuilder extends MessageOrBuilder
    {
        int getPoolId();
        
        List<Integer> getFishAreaListList();
        
        int getFishAreaListCount();
        
        int getFishAreaList(final int p0);
        
        int getTodayFishNum();
    }
}
