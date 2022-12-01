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

public final class TowerBuffSelectReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_TowerBuffSelectReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TowerBuffSelectReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TowerBuffSelectReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TowerBuffSelectReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018TowerBuffSelectReq.proto\"+\n\u0012TowerBuffSelectReq\u0012\u0015\n\rtower_buff_id\u0018\u0005 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TowerBuffSelectReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TowerBuffSelectReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TowerBuffSelectReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TowerBuffSelectReqOuterClass.internal_static_TowerBuffSelectReq_descriptor, new String[] { "TowerBuffId" });
    }
    
    public static final class TowerBuffSelectReq extends GeneratedMessageV3 implements TowerBuffSelectReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TOWER_BUFF_ID_FIELD_NUMBER = 5;
        private int towerBuffId_;
        private byte memoizedIsInitialized;
        private static final TowerBuffSelectReq DEFAULT_INSTANCE;
        private static final Parser<TowerBuffSelectReq> PARSER;
        
        private TowerBuffSelectReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TowerBuffSelectReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TowerBuffSelectReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TowerBuffSelectReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.towerBuffId_ = input.readUInt32();
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
            return TowerBuffSelectReqOuterClass.internal_static_TowerBuffSelectReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TowerBuffSelectReqOuterClass.internal_static_TowerBuffSelectReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerBuffSelectReq.class, Builder.class);
        }
        
        @Override
        public int getTowerBuffId() {
            return this.towerBuffId_;
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
            if (this.towerBuffId_ != 0) {
                output.writeUInt32(5, this.towerBuffId_);
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
            if (this.towerBuffId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.towerBuffId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TowerBuffSelectReq)) {
                return super.equals(obj);
            }
            final TowerBuffSelectReq other = (TowerBuffSelectReq)obj;
            return this.getTowerBuffId() == other.getTowerBuffId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getTowerBuffId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TowerBuffSelectReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TowerBuffSelectReq.PARSER.parseFrom(data);
        }
        
        public static TowerBuffSelectReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerBuffSelectReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerBuffSelectReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TowerBuffSelectReq.PARSER.parseFrom(data);
        }
        
        public static TowerBuffSelectReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerBuffSelectReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerBuffSelectReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TowerBuffSelectReq.PARSER.parseFrom(data);
        }
        
        public static TowerBuffSelectReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TowerBuffSelectReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TowerBuffSelectReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerBuffSelectReq.PARSER, input);
        }
        
        public static TowerBuffSelectReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerBuffSelectReq.PARSER, input, extensionRegistry);
        }
        
        public static TowerBuffSelectReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerBuffSelectReq.PARSER, input);
        }
        
        public static TowerBuffSelectReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TowerBuffSelectReq.PARSER, input, extensionRegistry);
        }
        
        public static TowerBuffSelectReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerBuffSelectReq.PARSER, input);
        }
        
        public static TowerBuffSelectReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TowerBuffSelectReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TowerBuffSelectReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TowerBuffSelectReq prototype) {
            return TowerBuffSelectReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TowerBuffSelectReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TowerBuffSelectReq getDefaultInstance() {
            return TowerBuffSelectReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<TowerBuffSelectReq> parser() {
            return TowerBuffSelectReq.PARSER;
        }
        
        @Override
        public Parser<TowerBuffSelectReq> getParserForType() {
            return TowerBuffSelectReq.PARSER;
        }
        
        @Override
        public TowerBuffSelectReq getDefaultInstanceForType() {
            return TowerBuffSelectReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TowerBuffSelectReq();
            PARSER = new AbstractParser<TowerBuffSelectReq>() {
                @Override
                public TowerBuffSelectReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TowerBuffSelectReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TowerBuffSelectReqOrBuilder
        {
            private int towerBuffId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TowerBuffSelectReqOuterClass.internal_static_TowerBuffSelectReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TowerBuffSelectReqOuterClass.internal_static_TowerBuffSelectReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TowerBuffSelectReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TowerBuffSelectReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.towerBuffId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TowerBuffSelectReqOuterClass.internal_static_TowerBuffSelectReq_descriptor;
            }
            
            @Override
            public TowerBuffSelectReq getDefaultInstanceForType() {
                return TowerBuffSelectReq.getDefaultInstance();
            }
            
            @Override
            public TowerBuffSelectReq build() {
                final TowerBuffSelectReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TowerBuffSelectReq buildPartial() {
                final TowerBuffSelectReq result = new TowerBuffSelectReq(this);
                result.towerBuffId_ = this.towerBuffId_;
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
                if (other instanceof TowerBuffSelectReq) {
                    return this.mergeFrom((TowerBuffSelectReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TowerBuffSelectReq other) {
                if (other == TowerBuffSelectReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getTowerBuffId() != 0) {
                    this.setTowerBuffId(other.getTowerBuffId());
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
                TowerBuffSelectReq parsedMessage = null;
                try {
                    parsedMessage = TowerBuffSelectReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TowerBuffSelectReq)e.getUnfinishedMessage();
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
            public int getTowerBuffId() {
                return this.towerBuffId_;
            }
            
            public Builder setTowerBuffId(final int value) {
                this.towerBuffId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTowerBuffId() {
                this.towerBuffId_ = 0;
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
    
    public interface TowerBuffSelectReqOrBuilder extends MessageOrBuilder
    {
        int getTowerBuffId();
    }
}
