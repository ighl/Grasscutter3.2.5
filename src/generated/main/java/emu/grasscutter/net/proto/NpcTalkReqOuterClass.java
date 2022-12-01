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

public final class NpcTalkReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_NpcTalkReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NpcTalkReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private NpcTalkReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return NpcTalkReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010NpcTalkReq.proto\"G\n\nNpcTalkReq\u0012\u0011\n\tentity_id\u0018\b \u0001(\r\u0012\u0015\n\rnpc_entity_id\u0018\t \u0001(\r\u0012\u000f\n\u0007talk_id\u0018\u0007 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        NpcTalkReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_NpcTalkReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_NpcTalkReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(NpcTalkReqOuterClass.internal_static_NpcTalkReq_descriptor, new String[] { "EntityId", "NpcEntityId", "TalkId" });
    }
    
    public static final class NpcTalkReq extends GeneratedMessageV3 implements NpcTalkReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 8;
        private int entityId_;
        public static final int NPC_ENTITY_ID_FIELD_NUMBER = 9;
        private int npcEntityId_;
        public static final int TALK_ID_FIELD_NUMBER = 7;
        private int talkId_;
        private byte memoizedIsInitialized;
        private static final NpcTalkReq DEFAULT_INSTANCE;
        private static final Parser<NpcTalkReq> PARSER;
        
        private NpcTalkReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private NpcTalkReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new NpcTalkReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private NpcTalkReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 56: {
                            this.talkId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.npcEntityId_ = input.readUInt32();
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
            return NpcTalkReqOuterClass.internal_static_NpcTalkReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return NpcTalkReqOuterClass.internal_static_NpcTalkReq_fieldAccessorTable.ensureFieldAccessorsInitialized(NpcTalkReq.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public int getNpcEntityId() {
            return this.npcEntityId_;
        }
        
        @Override
        public int getTalkId() {
            return this.talkId_;
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
            if (this.talkId_ != 0) {
                output.writeUInt32(7, this.talkId_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(8, this.entityId_);
            }
            if (this.npcEntityId_ != 0) {
                output.writeUInt32(9, this.npcEntityId_);
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
            if (this.talkId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.talkId_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.entityId_);
            }
            if (this.npcEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.npcEntityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NpcTalkReq)) {
                return super.equals(obj);
            }
            final NpcTalkReq other = (NpcTalkReq)obj;
            return this.getEntityId() == other.getEntityId() && this.getNpcEntityId() == other.getNpcEntityId() && this.getTalkId() == other.getTalkId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getNpcEntityId();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getTalkId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static NpcTalkReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return NpcTalkReq.PARSER.parseFrom(data);
        }
        
        public static NpcTalkReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NpcTalkReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NpcTalkReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return NpcTalkReq.PARSER.parseFrom(data);
        }
        
        public static NpcTalkReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NpcTalkReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NpcTalkReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return NpcTalkReq.PARSER.parseFrom(data);
        }
        
        public static NpcTalkReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NpcTalkReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NpcTalkReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NpcTalkReq.PARSER, input);
        }
        
        public static NpcTalkReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NpcTalkReq.PARSER, input, extensionRegistry);
        }
        
        public static NpcTalkReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(NpcTalkReq.PARSER, input);
        }
        
        public static NpcTalkReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(NpcTalkReq.PARSER, input, extensionRegistry);
        }
        
        public static NpcTalkReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NpcTalkReq.PARSER, input);
        }
        
        public static NpcTalkReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NpcTalkReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return NpcTalkReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final NpcTalkReq prototype) {
            return NpcTalkReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == NpcTalkReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static NpcTalkReq getDefaultInstance() {
            return NpcTalkReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<NpcTalkReq> parser() {
            return NpcTalkReq.PARSER;
        }
        
        @Override
        public Parser<NpcTalkReq> getParserForType() {
            return NpcTalkReq.PARSER;
        }
        
        @Override
        public NpcTalkReq getDefaultInstanceForType() {
            return NpcTalkReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new NpcTalkReq();
            PARSER = new AbstractParser<NpcTalkReq>() {
                @Override
                public NpcTalkReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new NpcTalkReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NpcTalkReqOrBuilder
        {
            private int entityId_;
            private int npcEntityId_;
            private int talkId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return NpcTalkReqOuterClass.internal_static_NpcTalkReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return NpcTalkReqOuterClass.internal_static_NpcTalkReq_fieldAccessorTable.ensureFieldAccessorsInitialized(NpcTalkReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (NpcTalkReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                this.npcEntityId_ = 0;
                this.talkId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return NpcTalkReqOuterClass.internal_static_NpcTalkReq_descriptor;
            }
            
            @Override
            public NpcTalkReq getDefaultInstanceForType() {
                return NpcTalkReq.getDefaultInstance();
            }
            
            @Override
            public NpcTalkReq build() {
                final NpcTalkReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public NpcTalkReq buildPartial() {
                final NpcTalkReq result = new NpcTalkReq(this);
                result.entityId_ = this.entityId_;
                result.npcEntityId_ = this.npcEntityId_;
                result.talkId_ = this.talkId_;
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
                if (other instanceof NpcTalkReq) {
                    return this.mergeFrom((NpcTalkReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final NpcTalkReq other) {
                if (other == NpcTalkReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getNpcEntityId() != 0) {
                    this.setNpcEntityId(other.getNpcEntityId());
                }
                if (other.getTalkId() != 0) {
                    this.setTalkId(other.getTalkId());
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
                NpcTalkReq parsedMessage = null;
                try {
                    parsedMessage = NpcTalkReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (NpcTalkReq)e.getUnfinishedMessage();
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
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getNpcEntityId() {
                return this.npcEntityId_;
            }
            
            public Builder setNpcEntityId(final int value) {
                this.npcEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNpcEntityId() {
                this.npcEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTalkId() {
                return this.talkId_;
            }
            
            public Builder setTalkId(final int value) {
                this.talkId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTalkId() {
                this.talkId_ = 0;
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
    
    public interface NpcTalkReqOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        int getNpcEntityId();
        
        int getTalkId();
    }
}
