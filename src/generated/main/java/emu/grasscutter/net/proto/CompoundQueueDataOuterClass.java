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

public final class CompoundQueueDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_CompoundQueueData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CompoundQueueData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private CompoundQueueDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return CompoundQueueDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017CompoundQueueData.proto\"g\n\u0011CompoundQueueData\u0012\u0014\n\foutput_count\u0018\u0001 \u0001(\r\u0012\u0013\n\u000bcompound_id\u0018\u0004 \u0001(\r\u0012\u0013\n\u000boutput_time\u0018\u000e \u0001(\r\u0012\u0012\n\nwait_count\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        CompoundQueueDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_CompoundQueueData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CompoundQueueData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(CompoundQueueDataOuterClass.internal_static_CompoundQueueData_descriptor, new String[] { "OutputCount", "CompoundId", "OutputTime", "WaitCount" });
    }
    
    public static final class CompoundQueueData extends GeneratedMessageV3 implements CompoundQueueDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int OUTPUT_COUNT_FIELD_NUMBER = 1;
        private int outputCount_;
        public static final int COMPOUND_ID_FIELD_NUMBER = 4;
        private int compoundId_;
        public static final int OUTPUT_TIME_FIELD_NUMBER = 14;
        private int outputTime_;
        public static final int WAIT_COUNT_FIELD_NUMBER = 8;
        private int waitCount_;
        private byte memoizedIsInitialized;
        private static final CompoundQueueData DEFAULT_INSTANCE;
        private static final Parser<CompoundQueueData> PARSER;
        
        private CompoundQueueData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private CompoundQueueData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new CompoundQueueData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private CompoundQueueData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.outputCount_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.compoundId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.waitCount_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.outputTime_ = input.readUInt32();
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
            return CompoundQueueDataOuterClass.internal_static_CompoundQueueData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return CompoundQueueDataOuterClass.internal_static_CompoundQueueData_fieldAccessorTable.ensureFieldAccessorsInitialized(CompoundQueueData.class, Builder.class);
        }
        
        @Override
        public int getOutputCount() {
            return this.outputCount_;
        }
        
        @Override
        public int getCompoundId() {
            return this.compoundId_;
        }
        
        @Override
        public int getOutputTime() {
            return this.outputTime_;
        }
        
        @Override
        public int getWaitCount() {
            return this.waitCount_;
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
            if (this.outputCount_ != 0) {
                output.writeUInt32(1, this.outputCount_);
            }
            if (this.compoundId_ != 0) {
                output.writeUInt32(4, this.compoundId_);
            }
            if (this.waitCount_ != 0) {
                output.writeUInt32(8, this.waitCount_);
            }
            if (this.outputTime_ != 0) {
                output.writeUInt32(14, this.outputTime_);
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
            if (this.outputCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.outputCount_);
            }
            if (this.compoundId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.compoundId_);
            }
            if (this.waitCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.waitCount_);
            }
            if (this.outputTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.outputTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CompoundQueueData)) {
                return super.equals(obj);
            }
            final CompoundQueueData other = (CompoundQueueData)obj;
            return this.getOutputCount() == other.getOutputCount() && this.getCompoundId() == other.getCompoundId() && this.getOutputTime() == other.getOutputTime() && this.getWaitCount() == other.getWaitCount() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getOutputCount();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getCompoundId();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getOutputTime();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getWaitCount();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static CompoundQueueData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return CompoundQueueData.PARSER.parseFrom(data);
        }
        
        public static CompoundQueueData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CompoundQueueData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CompoundQueueData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return CompoundQueueData.PARSER.parseFrom(data);
        }
        
        public static CompoundQueueData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CompoundQueueData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CompoundQueueData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return CompoundQueueData.PARSER.parseFrom(data);
        }
        
        public static CompoundQueueData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return CompoundQueueData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static CompoundQueueData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundQueueData.PARSER, input);
        }
        
        public static CompoundQueueData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundQueueData.PARSER, input, extensionRegistry);
        }
        
        public static CompoundQueueData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CompoundQueueData.PARSER, input);
        }
        
        public static CompoundQueueData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(CompoundQueueData.PARSER, input, extensionRegistry);
        }
        
        public static CompoundQueueData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundQueueData.PARSER, input);
        }
        
        public static CompoundQueueData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(CompoundQueueData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return CompoundQueueData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final CompoundQueueData prototype) {
            return CompoundQueueData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == CompoundQueueData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static CompoundQueueData getDefaultInstance() {
            return CompoundQueueData.DEFAULT_INSTANCE;
        }
        
        public static Parser<CompoundQueueData> parser() {
            return CompoundQueueData.PARSER;
        }
        
        @Override
        public Parser<CompoundQueueData> getParserForType() {
            return CompoundQueueData.PARSER;
        }
        
        @Override
        public CompoundQueueData getDefaultInstanceForType() {
            return CompoundQueueData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new CompoundQueueData();
            PARSER = new AbstractParser<CompoundQueueData>() {
                @Override
                public CompoundQueueData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new CompoundQueueData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CompoundQueueDataOrBuilder
        {
            private int outputCount_;
            private int compoundId_;
            private int outputTime_;
            private int waitCount_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return CompoundQueueDataOuterClass.internal_static_CompoundQueueData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return CompoundQueueDataOuterClass.internal_static_CompoundQueueData_fieldAccessorTable.ensureFieldAccessorsInitialized(CompoundQueueData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (CompoundQueueData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.outputCount_ = 0;
                this.compoundId_ = 0;
                this.outputTime_ = 0;
                this.waitCount_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return CompoundQueueDataOuterClass.internal_static_CompoundQueueData_descriptor;
            }
            
            @Override
            public CompoundQueueData getDefaultInstanceForType() {
                return CompoundQueueData.getDefaultInstance();
            }
            
            @Override
            public CompoundQueueData build() {
                final CompoundQueueData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public CompoundQueueData buildPartial() {
                final CompoundQueueData result = new CompoundQueueData(this);
                result.outputCount_ = this.outputCount_;
                result.compoundId_ = this.compoundId_;
                result.outputTime_ = this.outputTime_;
                result.waitCount_ = this.waitCount_;
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
                if (other instanceof CompoundQueueData) {
                    return this.mergeFrom((CompoundQueueData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final CompoundQueueData other) {
                if (other == CompoundQueueData.getDefaultInstance()) {
                    return this;
                }
                if (other.getOutputCount() != 0) {
                    this.setOutputCount(other.getOutputCount());
                }
                if (other.getCompoundId() != 0) {
                    this.setCompoundId(other.getCompoundId());
                }
                if (other.getOutputTime() != 0) {
                    this.setOutputTime(other.getOutputTime());
                }
                if (other.getWaitCount() != 0) {
                    this.setWaitCount(other.getWaitCount());
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
                CompoundQueueData parsedMessage = null;
                try {
                    parsedMessage = CompoundQueueData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (CompoundQueueData)e.getUnfinishedMessage();
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
            public int getOutputCount() {
                return this.outputCount_;
            }
            
            public Builder setOutputCount(final int value) {
                this.outputCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOutputCount() {
                this.outputCount_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCompoundId() {
                return this.compoundId_;
            }
            
            public Builder setCompoundId(final int value) {
                this.compoundId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCompoundId() {
                this.compoundId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOutputTime() {
                return this.outputTime_;
            }
            
            public Builder setOutputTime(final int value) {
                this.outputTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOutputTime() {
                this.outputTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWaitCount() {
                return this.waitCount_;
            }
            
            public Builder setWaitCount(final int value) {
                this.waitCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWaitCount() {
                this.waitCount_ = 0;
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
    
    public interface CompoundQueueDataOrBuilder extends MessageOrBuilder
    {
        int getOutputCount();
        
        int getCompoundId();
        
        int getOutputTime();
        
        int getWaitCount();
    }
}
