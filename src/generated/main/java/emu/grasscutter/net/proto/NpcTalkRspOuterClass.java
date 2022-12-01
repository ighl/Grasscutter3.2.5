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

public final class NpcTalkRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_NpcTalkRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_NpcTalkRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private NpcTalkRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return NpcTalkRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010NpcTalkRsp.proto\"\\\n\nNpcTalkRsp\u0012\u0013\n\u000bcur_talk_id\u0018\t \u0001(\r\u0012\u0015\n\rnpc_entity_id\u0018\u0006 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0003 \u0001(\u0005\u0012\u0011\n\tentity_id\u0018\r \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        NpcTalkRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_NpcTalkRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_NpcTalkRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor, new String[] { "CurTalkId", "NpcEntityId", "Retcode", "EntityId" });
    }
    
    public static final class NpcTalkRsp extends GeneratedMessageV3 implements NpcTalkRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CUR_TALK_ID_FIELD_NUMBER = 9;
        private int curTalkId_;
        public static final int NPC_ENTITY_ID_FIELD_NUMBER = 6;
        private int npcEntityId_;
        public static final int RETCODE_FIELD_NUMBER = 3;
        private int retcode_;
        public static final int ENTITY_ID_FIELD_NUMBER = 13;
        private int entityId_;
        private byte memoizedIsInitialized;
        private static final NpcTalkRsp DEFAULT_INSTANCE;
        private static final Parser<NpcTalkRsp> PARSER;
        
        private NpcTalkRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private NpcTalkRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new NpcTalkRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private NpcTalkRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 48: {
                            this.npcEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.curTalkId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.entityId_ = input.readUInt32();
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
            return NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return NpcTalkRspOuterClass.internal_static_NpcTalkRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(NpcTalkRsp.class, Builder.class);
        }
        
        @Override
        public int getCurTalkId() {
            return this.curTalkId_;
        }
        
        @Override
        public int getNpcEntityId() {
            return this.npcEntityId_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
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
                output.writeInt32(3, this.retcode_);
            }
            if (this.npcEntityId_ != 0) {
                output.writeUInt32(6, this.npcEntityId_);
            }
            if (this.curTalkId_ != 0) {
                output.writeUInt32(9, this.curTalkId_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(13, this.entityId_);
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
                size += CodedOutputStream.computeInt32Size(3, this.retcode_);
            }
            if (this.npcEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.npcEntityId_);
            }
            if (this.curTalkId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.curTalkId_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NpcTalkRsp)) {
                return super.equals(obj);
            }
            final NpcTalkRsp other = (NpcTalkRsp)obj;
            return this.getCurTalkId() == other.getCurTalkId() && this.getNpcEntityId() == other.getNpcEntityId() && this.getRetcode() == other.getRetcode() && this.getEntityId() == other.getEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getCurTalkId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getNpcEntityId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static NpcTalkRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return NpcTalkRsp.PARSER.parseFrom(data);
        }
        
        public static NpcTalkRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NpcTalkRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NpcTalkRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return NpcTalkRsp.PARSER.parseFrom(data);
        }
        
        public static NpcTalkRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NpcTalkRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NpcTalkRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return NpcTalkRsp.PARSER.parseFrom(data);
        }
        
        public static NpcTalkRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return NpcTalkRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static NpcTalkRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NpcTalkRsp.PARSER, input);
        }
        
        public static NpcTalkRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NpcTalkRsp.PARSER, input, extensionRegistry);
        }
        
        public static NpcTalkRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(NpcTalkRsp.PARSER, input);
        }
        
        public static NpcTalkRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(NpcTalkRsp.PARSER, input, extensionRegistry);
        }
        
        public static NpcTalkRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NpcTalkRsp.PARSER, input);
        }
        
        public static NpcTalkRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(NpcTalkRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return NpcTalkRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final NpcTalkRsp prototype) {
            return NpcTalkRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == NpcTalkRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static NpcTalkRsp getDefaultInstance() {
            return NpcTalkRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<NpcTalkRsp> parser() {
            return NpcTalkRsp.PARSER;
        }
        
        @Override
        public Parser<NpcTalkRsp> getParserForType() {
            return NpcTalkRsp.PARSER;
        }
        
        @Override
        public NpcTalkRsp getDefaultInstanceForType() {
            return NpcTalkRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new NpcTalkRsp();
            PARSER = new AbstractParser<NpcTalkRsp>() {
                @Override
                public NpcTalkRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new NpcTalkRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NpcTalkRspOrBuilder
        {
            private int curTalkId_;
            private int npcEntityId_;
            private int retcode_;
            private int entityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return NpcTalkRspOuterClass.internal_static_NpcTalkRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(NpcTalkRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (NpcTalkRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.curTalkId_ = 0;
                this.npcEntityId_ = 0;
                this.retcode_ = 0;
                this.entityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return NpcTalkRspOuterClass.internal_static_NpcTalkRsp_descriptor;
            }
            
            @Override
            public NpcTalkRsp getDefaultInstanceForType() {
                return NpcTalkRsp.getDefaultInstance();
            }
            
            @Override
            public NpcTalkRsp build() {
                final NpcTalkRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public NpcTalkRsp buildPartial() {
                final NpcTalkRsp result = new NpcTalkRsp(this);
                result.curTalkId_ = this.curTalkId_;
                result.npcEntityId_ = this.npcEntityId_;
                result.retcode_ = this.retcode_;
                result.entityId_ = this.entityId_;
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
                if (other instanceof NpcTalkRsp) {
                    return this.mergeFrom((NpcTalkRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final NpcTalkRsp other) {
                if (other == NpcTalkRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getCurTalkId() != 0) {
                    this.setCurTalkId(other.getCurTalkId());
                }
                if (other.getNpcEntityId() != 0) {
                    this.setNpcEntityId(other.getNpcEntityId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
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
                NpcTalkRsp parsedMessage = null;
                try {
                    parsedMessage = NpcTalkRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (NpcTalkRsp)e.getUnfinishedMessage();
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
            public int getCurTalkId() {
                return this.curTalkId_;
            }
            
            public Builder setCurTalkId(final int value) {
                this.curTalkId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurTalkId() {
                this.curTalkId_ = 0;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface NpcTalkRspOrBuilder extends MessageOrBuilder
    {
        int getCurTalkId();
        
        int getNpcEntityId();
        
        int getRetcode();
        
        int getEntityId();
    }
}
