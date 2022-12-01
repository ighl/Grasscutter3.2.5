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

public final class ForgeQueueDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_ForgeQueueData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ForgeQueueData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ForgeQueueDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ForgeQueueDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014ForgeQueueData.proto\"´\u0001\n\u000eForgeQueueData\u0012\u0014\n\ffinish_count\u0018\r \u0001(\r\u0012\u001e\n\u0016total_finish_timestamp\u0018\u000e \u0001(\r\u0012\u0011\n\tavatar_id\u0018\u0007 \u0001(\r\u0012\u0010\n\bqueue_id\u0018\u0001 \u0001(\r\u0012\u0016\n\u000eunfinish_count\u0018\n \u0001(\r\u0012\u001d\n\u0015next_finish_timestamp\u0018\u000b \u0001(\r\u0012\u0010\n\bforge_id\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ForgeQueueDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ForgeQueueData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ForgeQueueData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ForgeQueueDataOuterClass.internal_static_ForgeQueueData_descriptor, new String[] { "FinishCount", "TotalFinishTimestamp", "AvatarId", "QueueId", "UnfinishCount", "NextFinishTimestamp", "ForgeId" });
    }
    
    public static final class ForgeQueueData extends GeneratedMessageV3 implements ForgeQueueDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FINISH_COUNT_FIELD_NUMBER = 13;
        private int finishCount_;
        public static final int TOTAL_FINISH_TIMESTAMP_FIELD_NUMBER = 14;
        private int totalFinishTimestamp_;
        public static final int AVATAR_ID_FIELD_NUMBER = 7;
        private int avatarId_;
        public static final int QUEUE_ID_FIELD_NUMBER = 1;
        private int queueId_;
        public static final int UNFINISH_COUNT_FIELD_NUMBER = 10;
        private int unfinishCount_;
        public static final int NEXT_FINISH_TIMESTAMP_FIELD_NUMBER = 11;
        private int nextFinishTimestamp_;
        public static final int FORGE_ID_FIELD_NUMBER = 15;
        private int forgeId_;
        private byte memoizedIsInitialized;
        private static final ForgeQueueData DEFAULT_INSTANCE;
        private static final Parser<ForgeQueueData> PARSER;
        
        private ForgeQueueData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ForgeQueueData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ForgeQueueData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ForgeQueueData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.queueId_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.avatarId_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.unfinishCount_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
                            this.nextFinishTimestamp_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.finishCount_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
                            this.totalFinishTimestamp_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.forgeId_ = input.readUInt32();
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
            return ForgeQueueDataOuterClass.internal_static_ForgeQueueData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ForgeQueueDataOuterClass.internal_static_ForgeQueueData_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeQueueData.class, Builder.class);
        }
        
        @Override
        public int getFinishCount() {
            return this.finishCount_;
        }
        
        @Override
        public int getTotalFinishTimestamp() {
            return this.totalFinishTimestamp_;
        }
        
        @Override
        public int getAvatarId() {
            return this.avatarId_;
        }
        
        @Override
        public int getQueueId() {
            return this.queueId_;
        }
        
        @Override
        public int getUnfinishCount() {
            return this.unfinishCount_;
        }
        
        @Override
        public int getNextFinishTimestamp() {
            return this.nextFinishTimestamp_;
        }
        
        @Override
        public int getForgeId() {
            return this.forgeId_;
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
            if (this.queueId_ != 0) {
                output.writeUInt32(1, this.queueId_);
            }
            if (this.avatarId_ != 0) {
                output.writeUInt32(7, this.avatarId_);
            }
            if (this.unfinishCount_ != 0) {
                output.writeUInt32(10, this.unfinishCount_);
            }
            if (this.nextFinishTimestamp_ != 0) {
                output.writeUInt32(11, this.nextFinishTimestamp_);
            }
            if (this.finishCount_ != 0) {
                output.writeUInt32(13, this.finishCount_);
            }
            if (this.totalFinishTimestamp_ != 0) {
                output.writeUInt32(14, this.totalFinishTimestamp_);
            }
            if (this.forgeId_ != 0) {
                output.writeUInt32(15, this.forgeId_);
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
            if (this.queueId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.queueId_);
            }
            if (this.avatarId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.avatarId_);
            }
            if (this.unfinishCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.unfinishCount_);
            }
            if (this.nextFinishTimestamp_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.nextFinishTimestamp_);
            }
            if (this.finishCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.finishCount_);
            }
            if (this.totalFinishTimestamp_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.totalFinishTimestamp_);
            }
            if (this.forgeId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.forgeId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ForgeQueueData)) {
                return super.equals(obj);
            }
            final ForgeQueueData other = (ForgeQueueData)obj;
            return this.getFinishCount() == other.getFinishCount() && this.getTotalFinishTimestamp() == other.getTotalFinishTimestamp() && this.getAvatarId() == other.getAvatarId() && this.getQueueId() == other.getQueueId() && this.getUnfinishCount() == other.getUnfinishCount() && this.getNextFinishTimestamp() == other.getNextFinishTimestamp() && this.getForgeId() == other.getForgeId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getFinishCount();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getTotalFinishTimestamp();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getAvatarId();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getQueueId();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getUnfinishCount();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getNextFinishTimestamp();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getForgeId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ForgeQueueData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ForgeQueueData.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ForgeQueueData.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ForgeQueueData.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueData.PARSER, input);
        }
        
        public static ForgeQueueData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueData.PARSER, input, extensionRegistry);
        }
        
        public static ForgeQueueData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeQueueData.PARSER, input);
        }
        
        public static ForgeQueueData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeQueueData.PARSER, input, extensionRegistry);
        }
        
        public static ForgeQueueData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueData.PARSER, input);
        }
        
        public static ForgeQueueData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ForgeQueueData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ForgeQueueData prototype) {
            return ForgeQueueData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ForgeQueueData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ForgeQueueData getDefaultInstance() {
            return ForgeQueueData.DEFAULT_INSTANCE;
        }
        
        public static Parser<ForgeQueueData> parser() {
            return ForgeQueueData.PARSER;
        }
        
        @Override
        public Parser<ForgeQueueData> getParserForType() {
            return ForgeQueueData.PARSER;
        }
        
        @Override
        public ForgeQueueData getDefaultInstanceForType() {
            return ForgeQueueData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ForgeQueueData();
            PARSER = new AbstractParser<ForgeQueueData>() {
                @Override
                public ForgeQueueData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ForgeQueueData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForgeQueueDataOrBuilder
        {
            private int finishCount_;
            private int totalFinishTimestamp_;
            private int avatarId_;
            private int queueId_;
            private int unfinishCount_;
            private int nextFinishTimestamp_;
            private int forgeId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ForgeQueueDataOuterClass.internal_static_ForgeQueueData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ForgeQueueDataOuterClass.internal_static_ForgeQueueData_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeQueueData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ForgeQueueData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.finishCount_ = 0;
                this.totalFinishTimestamp_ = 0;
                this.avatarId_ = 0;
                this.queueId_ = 0;
                this.unfinishCount_ = 0;
                this.nextFinishTimestamp_ = 0;
                this.forgeId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ForgeQueueDataOuterClass.internal_static_ForgeQueueData_descriptor;
            }
            
            @Override
            public ForgeQueueData getDefaultInstanceForType() {
                return ForgeQueueData.getDefaultInstance();
            }
            
            @Override
            public ForgeQueueData build() {
                final ForgeQueueData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ForgeQueueData buildPartial() {
                final ForgeQueueData result = new ForgeQueueData(this);
                result.finishCount_ = this.finishCount_;
                result.totalFinishTimestamp_ = this.totalFinishTimestamp_;
                result.avatarId_ = this.avatarId_;
                result.queueId_ = this.queueId_;
                result.unfinishCount_ = this.unfinishCount_;
                result.nextFinishTimestamp_ = this.nextFinishTimestamp_;
                result.forgeId_ = this.forgeId_;
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
                if (other instanceof ForgeQueueData) {
                    return this.mergeFrom((ForgeQueueData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ForgeQueueData other) {
                if (other == ForgeQueueData.getDefaultInstance()) {
                    return this;
                }
                if (other.getFinishCount() != 0) {
                    this.setFinishCount(other.getFinishCount());
                }
                if (other.getTotalFinishTimestamp() != 0) {
                    this.setTotalFinishTimestamp(other.getTotalFinishTimestamp());
                }
                if (other.getAvatarId() != 0) {
                    this.setAvatarId(other.getAvatarId());
                }
                if (other.getQueueId() != 0) {
                    this.setQueueId(other.getQueueId());
                }
                if (other.getUnfinishCount() != 0) {
                    this.setUnfinishCount(other.getUnfinishCount());
                }
                if (other.getNextFinishTimestamp() != 0) {
                    this.setNextFinishTimestamp(other.getNextFinishTimestamp());
                }
                if (other.getForgeId() != 0) {
                    this.setForgeId(other.getForgeId());
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
                ForgeQueueData parsedMessage = null;
                try {
                    parsedMessage = ForgeQueueData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ForgeQueueData)e.getUnfinishedMessage();
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
            public int getFinishCount() {
                return this.finishCount_;
            }
            
            public Builder setFinishCount(final int value) {
                this.finishCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFinishCount() {
                this.finishCount_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTotalFinishTimestamp() {
                return this.totalFinishTimestamp_;
            }
            
            public Builder setTotalFinishTimestamp(final int value) {
                this.totalFinishTimestamp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTotalFinishTimestamp() {
                this.totalFinishTimestamp_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAvatarId() {
                return this.avatarId_;
            }
            
            public Builder setAvatarId(final int value) {
                this.avatarId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAvatarId() {
                this.avatarId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getQueueId() {
                return this.queueId_;
            }
            
            public Builder setQueueId(final int value) {
                this.queueId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQueueId() {
                this.queueId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnfinishCount() {
                return this.unfinishCount_;
            }
            
            public Builder setUnfinishCount(final int value) {
                this.unfinishCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnfinishCount() {
                this.unfinishCount_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getNextFinishTimestamp() {
                return this.nextFinishTimestamp_;
            }
            
            public Builder setNextFinishTimestamp(final int value) {
                this.nextFinishTimestamp_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNextFinishTimestamp() {
                this.nextFinishTimestamp_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getForgeId() {
                return this.forgeId_;
            }
            
            public Builder setForgeId(final int value) {
                this.forgeId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearForgeId() {
                this.forgeId_ = 0;
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
    
    public interface ForgeQueueDataOrBuilder extends MessageOrBuilder
    {
        int getFinishCount();
        
        int getTotalFinishTimestamp();
        
        int getAvatarId();
        
        int getQueueId();
        
        int getUnfinishCount();
        
        int getNextFinishTimestamp();
        
        int getForgeId();
    }
}
