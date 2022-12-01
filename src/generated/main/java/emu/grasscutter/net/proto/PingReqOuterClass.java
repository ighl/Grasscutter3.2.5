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
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class PingReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_PingReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PingReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PingReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PingReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\rPingReq.proto\"f\n\u0007PingReq\u0012\u0013\n\u000bclient_time\u0018\u0002 \u0001(\r\u0012\u000f\n\u0007ue_time\u0018\u000e \u0001(\u0002\u0012\u0017\n\u000ftotal_tick_time\u0018\u0006 \u0001(\u0001\u0012\u000f\n\u0007sc_data\u0018\n \u0001(\f\u0012\u000b\n\u0003seq\u0018\u0003 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PingReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PingReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PingReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PingReqOuterClass.internal_static_PingReq_descriptor, new String[] { "ClientTime", "UeTime", "TotalTickTime", "ScData", "Seq" });
    }
    
    public static final class PingReq extends GeneratedMessageV3 implements PingReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CLIENT_TIME_FIELD_NUMBER = 2;
        private int clientTime_;
        public static final int UE_TIME_FIELD_NUMBER = 14;
        private float ueTime_;
        public static final int TOTAL_TICK_TIME_FIELD_NUMBER = 6;
        private double totalTickTime_;
        public static final int SC_DATA_FIELD_NUMBER = 10;
        private ByteString scData_;
        public static final int SEQ_FIELD_NUMBER = 3;
        private int seq_;
        private byte memoizedIsInitialized;
        private static final PingReq DEFAULT_INSTANCE;
        private static final Parser<PingReq> PARSER;
        
        private PingReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PingReq() {
            this.memoizedIsInitialized = -1;
            this.scData_ = ByteString.EMPTY;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PingReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PingReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.clientTime_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.seq_ = input.readUInt32();
                            continue;
                        }
                        case 49: {
                            this.totalTickTime_ = input.readDouble();
                            continue;
                        }
                        case 82: {
                            this.scData_ = input.readBytes();
                            continue;
                        }
                        case 117: {
                            this.ueTime_ = input.readFloat();
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
            return PingReqOuterClass.internal_static_PingReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PingReqOuterClass.internal_static_PingReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PingReq.class, Builder.class);
        }
        
        @Override
        public int getClientTime() {
            return this.clientTime_;
        }
        
        @Override
        public float getUeTime() {
            return this.ueTime_;
        }
        
        @Override
        public double getTotalTickTime() {
            return this.totalTickTime_;
        }
        
        @Override
        public ByteString getScData() {
            return this.scData_;
        }
        
        @Override
        public int getSeq() {
            return this.seq_;
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
            if (this.clientTime_ != 0) {
                output.writeUInt32(2, this.clientTime_);
            }
            if (this.seq_ != 0) {
                output.writeUInt32(3, this.seq_);
            }
            if (this.totalTickTime_ != 0.0) {
                output.writeDouble(6, this.totalTickTime_);
            }
            if (!this.scData_.isEmpty()) {
                output.writeBytes(10, this.scData_);
            }
            if (this.ueTime_ != 0.0f) {
                output.writeFloat(14, this.ueTime_);
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
            if (this.clientTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.clientTime_);
            }
            if (this.seq_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.seq_);
            }
            if (this.totalTickTime_ != 0.0) {
                size += CodedOutputStream.computeDoubleSize(6, this.totalTickTime_);
            }
            if (!this.scData_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(10, this.scData_);
            }
            if (this.ueTime_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(14, this.ueTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PingReq)) {
                return super.equals(obj);
            }
            final PingReq other = (PingReq)obj;
            return this.getClientTime() == other.getClientTime() && Float.floatToIntBits(this.getUeTime()) == Float.floatToIntBits(other.getUeTime()) && Double.doubleToLongBits(this.getTotalTickTime()) == Double.doubleToLongBits(other.getTotalTickTime()) && this.getScData().equals(other.getScData()) && this.getSeq() == other.getSeq() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getClientTime();
            hash = 37 * hash + 14;
            hash = 53 * hash + Float.floatToIntBits(this.getUeTime());
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashLong(Double.doubleToLongBits(this.getTotalTickTime()));
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getScData().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getSeq();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PingReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PingReq.PARSER.parseFrom(data);
        }
        
        public static PingReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PingReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PingReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PingReq.PARSER.parseFrom(data);
        }
        
        public static PingReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PingReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PingReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PingReq.PARSER.parseFrom(data);
        }
        
        public static PingReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PingReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PingReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PingReq.PARSER, input);
        }
        
        public static PingReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PingReq.PARSER, input, extensionRegistry);
        }
        
        public static PingReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PingReq.PARSER, input);
        }
        
        public static PingReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PingReq.PARSER, input, extensionRegistry);
        }
        
        public static PingReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PingReq.PARSER, input);
        }
        
        public static PingReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PingReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PingReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PingReq prototype) {
            return PingReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PingReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PingReq getDefaultInstance() {
            return PingReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<PingReq> parser() {
            return PingReq.PARSER;
        }
        
        @Override
        public Parser<PingReq> getParserForType() {
            return PingReq.PARSER;
        }
        
        @Override
        public PingReq getDefaultInstanceForType() {
            return PingReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PingReq();
            PARSER = new AbstractParser<PingReq>() {
                @Override
                public PingReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PingReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PingReqOrBuilder
        {
            private int clientTime_;
            private float ueTime_;
            private double totalTickTime_;
            private ByteString scData_;
            private int seq_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PingReqOuterClass.internal_static_PingReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PingReqOuterClass.internal_static_PingReq_fieldAccessorTable.ensureFieldAccessorsInitialized(PingReq.class, Builder.class);
            }
            
            private Builder() {
                this.scData_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.scData_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PingReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.clientTime_ = 0;
                this.ueTime_ = 0.0f;
                this.totalTickTime_ = 0.0;
                this.scData_ = ByteString.EMPTY;
                this.seq_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PingReqOuterClass.internal_static_PingReq_descriptor;
            }
            
            @Override
            public PingReq getDefaultInstanceForType() {
                return PingReq.getDefaultInstance();
            }
            
            @Override
            public PingReq build() {
                final PingReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PingReq buildPartial() {
                final PingReq result = new PingReq(this);
                result.clientTime_ = this.clientTime_;
                result.ueTime_ = this.ueTime_;
                result.totalTickTime_ = this.totalTickTime_;
                result.scData_ = this.scData_;
                result.seq_ = this.seq_;
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
                if (other instanceof PingReq) {
                    return this.mergeFrom((PingReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PingReq other) {
                if (other == PingReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getClientTime() != 0) {
                    this.setClientTime(other.getClientTime());
                }
                if (other.getUeTime() != 0.0f) {
                    this.setUeTime(other.getUeTime());
                }
                if (other.getTotalTickTime() != 0.0) {
                    this.setTotalTickTime(other.getTotalTickTime());
                }
                if (other.getScData() != ByteString.EMPTY) {
                    this.setScData(other.getScData());
                }
                if (other.getSeq() != 0) {
                    this.setSeq(other.getSeq());
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
                PingReq parsedMessage = null;
                try {
                    parsedMessage = PingReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PingReq)e.getUnfinishedMessage();
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
            public int getClientTime() {
                return this.clientTime_;
            }
            
            public Builder setClientTime(final int value) {
                this.clientTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearClientTime() {
                this.clientTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getUeTime() {
                return this.ueTime_;
            }
            
            public Builder setUeTime(final float value) {
                this.ueTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUeTime() {
                this.ueTime_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public double getTotalTickTime() {
                return this.totalTickTime_;
            }
            
            public Builder setTotalTickTime(final double value) {
                this.totalTickTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTotalTickTime() {
                this.totalTickTime_ = 0.0;
                this.onChanged();
                return this;
            }
            
            @Override
            public ByteString getScData() {
                return this.scData_;
            }
            
            public Builder setScData(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.scData_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearScData() {
                this.scData_ = PingReq.getDefaultInstance().getScData();
                this.onChanged();
                return this;
            }
            
            @Override
            public int getSeq() {
                return this.seq_;
            }
            
            public Builder setSeq(final int value) {
                this.seq_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearSeq() {
                this.seq_ = 0;
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
    
    public interface PingReqOrBuilder extends MessageOrBuilder
    {
        int getClientTime();
        
        float getUeTime();
        
        double getTotalTickTime();
        
        ByteString getScData();
        
        int getSeq();
    }
}
