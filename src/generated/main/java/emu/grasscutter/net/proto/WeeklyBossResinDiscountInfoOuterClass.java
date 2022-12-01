// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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

public final class WeeklyBossResinDiscountInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_WeeklyBossResinDiscountInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeeklyBossResinDiscountInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WeeklyBossResinDiscountInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WeeklyBossResinDiscountInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!WeeklyBossResinDiscountInfo.proto\"\u0080\u0001\n\u001bWeeklyBossResinDiscountInfo\u0012\u0014\n\fdiscount_num\u0018\u0001 \u0001(\r\u0012\u001a\n\u0012discount_num_limit\u0018\u0002 \u0001(\r\u0012\u0012\n\nresin_cost\u0018\u0003 \u0001(\r\u0012\u001b\n\u0013original_resin_cost\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WeeklyBossResinDiscountInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WeeklyBossResinDiscountInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WeeklyBossResinDiscountInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeeklyBossResinDiscountInfoOuterClass.internal_static_WeeklyBossResinDiscountInfo_descriptor, new String[] { "DiscountNum", "DiscountNumLimit", "ResinCost", "OriginalResinCost" });
    }
    
    public static final class WeeklyBossResinDiscountInfo extends GeneratedMessageV3 implements WeeklyBossResinDiscountInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int DISCOUNT_NUM_FIELD_NUMBER = 1;
        private int discountNum_;
        public static final int DISCOUNT_NUM_LIMIT_FIELD_NUMBER = 2;
        private int discountNumLimit_;
        public static final int RESIN_COST_FIELD_NUMBER = 3;
        private int resinCost_;
        public static final int ORIGINAL_RESIN_COST_FIELD_NUMBER = 4;
        private int originalResinCost_;
        private byte memoizedIsInitialized;
        private static final WeeklyBossResinDiscountInfo DEFAULT_INSTANCE;
        private static final Parser<WeeklyBossResinDiscountInfo> PARSER;
        
        private WeeklyBossResinDiscountInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WeeklyBossResinDiscountInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WeeklyBossResinDiscountInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WeeklyBossResinDiscountInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.discountNum_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.discountNumLimit_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.resinCost_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.originalResinCost_ = input.readUInt32();
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
            return WeeklyBossResinDiscountInfoOuterClass.internal_static_WeeklyBossResinDiscountInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WeeklyBossResinDiscountInfoOuterClass.internal_static_WeeklyBossResinDiscountInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WeeklyBossResinDiscountInfo.class, Builder.class);
        }
        
        @Override
        public int getDiscountNum() {
            return this.discountNum_;
        }
        
        @Override
        public int getDiscountNumLimit() {
            return this.discountNumLimit_;
        }
        
        @Override
        public int getResinCost() {
            return this.resinCost_;
        }
        
        @Override
        public int getOriginalResinCost() {
            return this.originalResinCost_;
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
            if (this.discountNum_ != 0) {
                output.writeUInt32(1, this.discountNum_);
            }
            if (this.discountNumLimit_ != 0) {
                output.writeUInt32(2, this.discountNumLimit_);
            }
            if (this.resinCost_ != 0) {
                output.writeUInt32(3, this.resinCost_);
            }
            if (this.originalResinCost_ != 0) {
                output.writeUInt32(4, this.originalResinCost_);
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
            if (this.discountNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.discountNum_);
            }
            if (this.discountNumLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.discountNumLimit_);
            }
            if (this.resinCost_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.resinCost_);
            }
            if (this.originalResinCost_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.originalResinCost_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeeklyBossResinDiscountInfo)) {
                return super.equals(obj);
            }
            final WeeklyBossResinDiscountInfo other = (WeeklyBossResinDiscountInfo)obj;
            return this.getDiscountNum() == other.getDiscountNum() && this.getDiscountNumLimit() == other.getDiscountNumLimit() && this.getResinCost() == other.getResinCost() && this.getOriginalResinCost() == other.getOriginalResinCost() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getDiscountNum();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getDiscountNumLimit();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getResinCost();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getOriginalResinCost();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WeeklyBossResinDiscountInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WeeklyBossResinDiscountInfo.PARSER.parseFrom(data);
        }
        
        public static WeeklyBossResinDiscountInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeeklyBossResinDiscountInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeeklyBossResinDiscountInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WeeklyBossResinDiscountInfo.PARSER.parseFrom(data);
        }
        
        public static WeeklyBossResinDiscountInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeeklyBossResinDiscountInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeeklyBossResinDiscountInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WeeklyBossResinDiscountInfo.PARSER.parseFrom(data);
        }
        
        public static WeeklyBossResinDiscountInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeeklyBossResinDiscountInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeeklyBossResinDiscountInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeeklyBossResinDiscountInfo.PARSER, input);
        }
        
        public static WeeklyBossResinDiscountInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeeklyBossResinDiscountInfo.PARSER, input, extensionRegistry);
        }
        
        public static WeeklyBossResinDiscountInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeeklyBossResinDiscountInfo.PARSER, input);
        }
        
        public static WeeklyBossResinDiscountInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeeklyBossResinDiscountInfo.PARSER, input, extensionRegistry);
        }
        
        public static WeeklyBossResinDiscountInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeeklyBossResinDiscountInfo.PARSER, input);
        }
        
        public static WeeklyBossResinDiscountInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeeklyBossResinDiscountInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WeeklyBossResinDiscountInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WeeklyBossResinDiscountInfo prototype) {
            return WeeklyBossResinDiscountInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WeeklyBossResinDiscountInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WeeklyBossResinDiscountInfo getDefaultInstance() {
            return WeeklyBossResinDiscountInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<WeeklyBossResinDiscountInfo> parser() {
            return WeeklyBossResinDiscountInfo.PARSER;
        }
        
        @Override
        public Parser<WeeklyBossResinDiscountInfo> getParserForType() {
            return WeeklyBossResinDiscountInfo.PARSER;
        }
        
        @Override
        public WeeklyBossResinDiscountInfo getDefaultInstanceForType() {
            return WeeklyBossResinDiscountInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WeeklyBossResinDiscountInfo();
            PARSER = new AbstractParser<WeeklyBossResinDiscountInfo>() {
                @Override
                public WeeklyBossResinDiscountInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WeeklyBossResinDiscountInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeeklyBossResinDiscountInfoOrBuilder
        {
            private int discountNum_;
            private int discountNumLimit_;
            private int resinCost_;
            private int originalResinCost_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WeeklyBossResinDiscountInfoOuterClass.internal_static_WeeklyBossResinDiscountInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WeeklyBossResinDiscountInfoOuterClass.internal_static_WeeklyBossResinDiscountInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WeeklyBossResinDiscountInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WeeklyBossResinDiscountInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.discountNum_ = 0;
                this.discountNumLimit_ = 0;
                this.resinCost_ = 0;
                this.originalResinCost_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WeeklyBossResinDiscountInfoOuterClass.internal_static_WeeklyBossResinDiscountInfo_descriptor;
            }
            
            @Override
            public WeeklyBossResinDiscountInfo getDefaultInstanceForType() {
                return WeeklyBossResinDiscountInfo.getDefaultInstance();
            }
            
            @Override
            public WeeklyBossResinDiscountInfo build() {
                final WeeklyBossResinDiscountInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WeeklyBossResinDiscountInfo buildPartial() {
                final WeeklyBossResinDiscountInfo result = new WeeklyBossResinDiscountInfo(this);
                result.discountNum_ = this.discountNum_;
                result.discountNumLimit_ = this.discountNumLimit_;
                result.resinCost_ = this.resinCost_;
                result.originalResinCost_ = this.originalResinCost_;
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
                if (other instanceof WeeklyBossResinDiscountInfo) {
                    return this.mergeFrom((WeeklyBossResinDiscountInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WeeklyBossResinDiscountInfo other) {
                if (other == WeeklyBossResinDiscountInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getDiscountNum() != 0) {
                    this.setDiscountNum(other.getDiscountNum());
                }
                if (other.getDiscountNumLimit() != 0) {
                    this.setDiscountNumLimit(other.getDiscountNumLimit());
                }
                if (other.getResinCost() != 0) {
                    this.setResinCost(other.getResinCost());
                }
                if (other.getOriginalResinCost() != 0) {
                    this.setOriginalResinCost(other.getOriginalResinCost());
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
                WeeklyBossResinDiscountInfo parsedMessage = null;
                try {
                    parsedMessage = WeeklyBossResinDiscountInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WeeklyBossResinDiscountInfo)e.getUnfinishedMessage();
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
            public int getDiscountNum() {
                return this.discountNum_;
            }
            
            public Builder setDiscountNum(final int value) {
                this.discountNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDiscountNum() {
                this.discountNum_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDiscountNumLimit() {
                return this.discountNumLimit_;
            }
            
            public Builder setDiscountNumLimit(final int value) {
                this.discountNumLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDiscountNumLimit() {
                this.discountNumLimit_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getResinCost() {
                return this.resinCost_;
            }
            
            public Builder setResinCost(final int value) {
                this.resinCost_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearResinCost() {
                this.resinCost_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOriginalResinCost() {
                return this.originalResinCost_;
            }
            
            public Builder setOriginalResinCost(final int value) {
                this.originalResinCost_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOriginalResinCost() {
                this.originalResinCost_ = 0;
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
    
    public interface WeeklyBossResinDiscountInfoOrBuilder extends MessageOrBuilder
    {
        int getDiscountNum();
        
        int getDiscountNumLimit();
        
        int getResinCost();
        
        int getOriginalResinCost();
    }
}
