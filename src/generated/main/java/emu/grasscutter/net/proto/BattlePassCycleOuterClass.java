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

public final class BattlePassCycleOuterClass
{
    private static final Descriptors.Descriptor internal_static_BattlePassCycle_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BattlePassCycle_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BattlePassCycleOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BattlePassCycleOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015BattlePassCycle.proto\"J\n\u000fBattlePassCycle\u0012\u0011\n\tcycle_idx\u0018\u0003 \u0001(\r\u0012\u0010\n\bend_time\u0018\n \u0001(\r\u0012\u0012\n\nbegin_time\u0018\r \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BattlePassCycleOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_BattlePassCycle_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BattlePassCycle_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BattlePassCycleOuterClass.internal_static_BattlePassCycle_descriptor, new String[] { "CycleIdx", "EndTime", "BeginTime" });
    }
    
    public static final class BattlePassCycle extends GeneratedMessageV3 implements BattlePassCycleOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CYCLE_IDX_FIELD_NUMBER = 3;
        private int cycleIdx_;
        public static final int END_TIME_FIELD_NUMBER = 10;
        private int endTime_;
        public static final int BEGIN_TIME_FIELD_NUMBER = 13;
        private int beginTime_;
        private byte memoizedIsInitialized;
        private static final BattlePassCycle DEFAULT_INSTANCE;
        private static final Parser<BattlePassCycle> PARSER;
        
        private BattlePassCycle(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BattlePassCycle() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BattlePassCycle();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BattlePassCycle(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.cycleIdx_ = input.readUInt32();
                            continue;
                        }
                        case 80: {
                            this.endTime_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.beginTime_ = input.readUInt32();
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
            return BattlePassCycleOuterClass.internal_static_BattlePassCycle_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BattlePassCycleOuterClass.internal_static_BattlePassCycle_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassCycle.class, Builder.class);
        }
        
        @Override
        public int getCycleIdx() {
            return this.cycleIdx_;
        }
        
        @Override
        public int getEndTime() {
            return this.endTime_;
        }
        
        @Override
        public int getBeginTime() {
            return this.beginTime_;
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
            if (this.cycleIdx_ != 0) {
                output.writeUInt32(3, this.cycleIdx_);
            }
            if (this.endTime_ != 0) {
                output.writeUInt32(10, this.endTime_);
            }
            if (this.beginTime_ != 0) {
                output.writeUInt32(13, this.beginTime_);
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
            if (this.cycleIdx_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.cycleIdx_);
            }
            if (this.endTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.endTime_);
            }
            if (this.beginTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.beginTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BattlePassCycle)) {
                return super.equals(obj);
            }
            final BattlePassCycle other = (BattlePassCycle)obj;
            return this.getCycleIdx() == other.getCycleIdx() && this.getEndTime() == other.getEndTime() && this.getBeginTime() == other.getBeginTime() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getCycleIdx();
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getEndTime();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getBeginTime();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BattlePassCycle parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BattlePassCycle.PARSER.parseFrom(data);
        }
        
        public static BattlePassCycle parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassCycle.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassCycle parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BattlePassCycle.PARSER.parseFrom(data);
        }
        
        public static BattlePassCycle parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassCycle.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassCycle parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BattlePassCycle.PARSER.parseFrom(data);
        }
        
        public static BattlePassCycle parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BattlePassCycle.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BattlePassCycle parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassCycle.PARSER, input);
        }
        
        public static BattlePassCycle parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassCycle.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassCycle parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassCycle.PARSER, input);
        }
        
        public static BattlePassCycle parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BattlePassCycle.PARSER, input, extensionRegistry);
        }
        
        public static BattlePassCycle parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassCycle.PARSER, input);
        }
        
        public static BattlePassCycle parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BattlePassCycle.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BattlePassCycle.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BattlePassCycle prototype) {
            return BattlePassCycle.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BattlePassCycle.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BattlePassCycle getDefaultInstance() {
            return BattlePassCycle.DEFAULT_INSTANCE;
        }
        
        public static Parser<BattlePassCycle> parser() {
            return BattlePassCycle.PARSER;
        }
        
        @Override
        public Parser<BattlePassCycle> getParserForType() {
            return BattlePassCycle.PARSER;
        }
        
        @Override
        public BattlePassCycle getDefaultInstanceForType() {
            return BattlePassCycle.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BattlePassCycle();
            PARSER = new AbstractParser<BattlePassCycle>() {
                @Override
                public BattlePassCycle parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BattlePassCycle(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BattlePassCycleOrBuilder
        {
            private int cycleIdx_;
            private int endTime_;
            private int beginTime_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BattlePassCycleOuterClass.internal_static_BattlePassCycle_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BattlePassCycleOuterClass.internal_static_BattlePassCycle_fieldAccessorTable.ensureFieldAccessorsInitialized(BattlePassCycle.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BattlePassCycle.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.cycleIdx_ = 0;
                this.endTime_ = 0;
                this.beginTime_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BattlePassCycleOuterClass.internal_static_BattlePassCycle_descriptor;
            }
            
            @Override
            public BattlePassCycle getDefaultInstanceForType() {
                return BattlePassCycle.getDefaultInstance();
            }
            
            @Override
            public BattlePassCycle build() {
                final BattlePassCycle result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BattlePassCycle buildPartial() {
                final BattlePassCycle result = new BattlePassCycle(this);
                result.cycleIdx_ = this.cycleIdx_;
                result.endTime_ = this.endTime_;
                result.beginTime_ = this.beginTime_;
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
                if (other instanceof BattlePassCycle) {
                    return this.mergeFrom((BattlePassCycle)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BattlePassCycle other) {
                if (other == BattlePassCycle.getDefaultInstance()) {
                    return this;
                }
                if (other.getCycleIdx() != 0) {
                    this.setCycleIdx(other.getCycleIdx());
                }
                if (other.getEndTime() != 0) {
                    this.setEndTime(other.getEndTime());
                }
                if (other.getBeginTime() != 0) {
                    this.setBeginTime(other.getBeginTime());
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
                BattlePassCycle parsedMessage = null;
                try {
                    parsedMessage = BattlePassCycle.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BattlePassCycle)e.getUnfinishedMessage();
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
            public int getCycleIdx() {
                return this.cycleIdx_;
            }
            
            public Builder setCycleIdx(final int value) {
                this.cycleIdx_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCycleIdx() {
                this.cycleIdx_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getEndTime() {
                return this.endTime_;
            }
            
            public Builder setEndTime(final int value) {
                this.endTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEndTime() {
                this.endTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBeginTime() {
                return this.beginTime_;
            }
            
            public Builder setBeginTime(final int value) {
                this.beginTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBeginTime() {
                this.beginTime_ = 0;
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
    
    public interface BattlePassCycleOrBuilder extends MessageOrBuilder
    {
        int getCycleIdx();
        
        int getEndTime();
        
        int getBeginTime();
    }
}
