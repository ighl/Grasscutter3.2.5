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

public final class PingRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_PingRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PingRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PingRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PingRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\rPingRsp.proto\"<\n\u0007PingRsp\u0012\u0013\n\u000bclient_time\u0018\u000b \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0006 \u0001(\u0005\u0012\u000b\n\u0003seq\u0018\r \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PingRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PingRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PingRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PingRspOuterClass.internal_static_PingRsp_descriptor, new String[] { "ClientTime", "Retcode", "Seq" });
    }
    
    public static final class PingRsp extends GeneratedMessageV3 implements PingRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CLIENT_TIME_FIELD_NUMBER = 11;
        private int clientTime_;
        public static final int RETCODE_FIELD_NUMBER = 6;
        private int retcode_;
        public static final int SEQ_FIELD_NUMBER = 13;
        private int seq_;
        private byte memoizedIsInitialized;
        private static final PingRsp DEFAULT_INSTANCE;
        private static final Parser<PingRsp> PARSER;
        
        private PingRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PingRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PingRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PingRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 88: {
                            this.clientTime_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.seq_ = input.readUInt32();
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
            return PingRspOuterClass.internal_static_PingRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PingRspOuterClass.internal_static_PingRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PingRsp.class, Builder.class);
        }
        
        @Override
        public int getClientTime() {
            return this.clientTime_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(6, this.retcode_);
            }
            if (this.clientTime_ != 0) {
                output.writeUInt32(11, this.clientTime_);
            }
            if (this.seq_ != 0) {
                output.writeUInt32(13, this.seq_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(6, this.retcode_);
            }
            if (this.clientTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.clientTime_);
            }
            if (this.seq_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.seq_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PingRsp)) {
                return super.equals(obj);
            }
            final PingRsp other = (PingRsp)obj;
            return this.getClientTime() == other.getClientTime() && this.getRetcode() == other.getRetcode() && this.getSeq() == other.getSeq() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getClientTime();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getSeq();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PingRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PingRsp.PARSER.parseFrom(data);
        }
        
        public static PingRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PingRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PingRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PingRsp.PARSER.parseFrom(data);
        }
        
        public static PingRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PingRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PingRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PingRsp.PARSER.parseFrom(data);
        }
        
        public static PingRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PingRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PingRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PingRsp.PARSER, input);
        }
        
        public static PingRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PingRsp.PARSER, input, extensionRegistry);
        }
        
        public static PingRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PingRsp.PARSER, input);
        }
        
        public static PingRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PingRsp.PARSER, input, extensionRegistry);
        }
        
        public static PingRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PingRsp.PARSER, input);
        }
        
        public static PingRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PingRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PingRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PingRsp prototype) {
            return PingRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PingRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PingRsp getDefaultInstance() {
            return PingRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<PingRsp> parser() {
            return PingRsp.PARSER;
        }
        
        @Override
        public Parser<PingRsp> getParserForType() {
            return PingRsp.PARSER;
        }
        
        @Override
        public PingRsp getDefaultInstanceForType() {
            return PingRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PingRsp();
            PARSER = new AbstractParser<PingRsp>() {
                @Override
                public PingRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PingRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PingRspOrBuilder
        {
            private int clientTime_;
            private int retcode_;
            private int seq_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PingRspOuterClass.internal_static_PingRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PingRspOuterClass.internal_static_PingRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PingRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PingRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.clientTime_ = 0;
                this.retcode_ = 0;
                this.seq_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PingRspOuterClass.internal_static_PingRsp_descriptor;
            }
            
            @Override
            public PingRsp getDefaultInstanceForType() {
                return PingRsp.getDefaultInstance();
            }
            
            @Override
            public PingRsp build() {
                final PingRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PingRsp buildPartial() {
                final PingRsp result = new PingRsp(this);
                result.clientTime_ = this.clientTime_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof PingRsp) {
                    return this.mergeFrom((PingRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PingRsp other) {
                if (other == PingRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getClientTime() != 0) {
                    this.setClientTime(other.getClientTime());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                PingRsp parsedMessage = null;
                try {
                    parsedMessage = PingRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PingRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
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
    
    public interface PingRspOrBuilder extends MessageOrBuilder
    {
        int getClientTime();
        
        int getRetcode();
        
        int getSeq();
    }
}
