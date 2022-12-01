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

public final class ChildQuestOuterClass
{
    private static final Descriptors.Descriptor internal_static_ChildQuest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ChildQuest_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ChildQuestOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ChildQuestOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010ChildQuest.proto\"F\n\nChildQuest\u0012\u0017\n\u000fquest_config_id\u0018\b \u0001(\r\u0012\r\n\u0005state\u0018\u0004 \u0001(\r\u0012\u0010\n\bquest_id\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ChildQuestOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ChildQuest_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ChildQuest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ChildQuestOuterClass.internal_static_ChildQuest_descriptor, new String[] { "QuestConfigId", "State", "QuestId" });
    }
    
    public static final class ChildQuest extends GeneratedMessageV3 implements ChildQuestOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int QUEST_CONFIG_ID_FIELD_NUMBER = 8;
        private int questConfigId_;
        public static final int STATE_FIELD_NUMBER = 4;
        private int state_;
        public static final int QUEST_ID_FIELD_NUMBER = 15;
        private int questId_;
        private byte memoizedIsInitialized;
        private static final ChildQuest DEFAULT_INSTANCE;
        private static final Parser<ChildQuest> PARSER;
        
        private ChildQuest(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ChildQuest() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ChildQuest();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ChildQuest(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.state_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.questConfigId_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.questId_ = input.readUInt32();
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
            return ChildQuestOuterClass.internal_static_ChildQuest_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ChildQuestOuterClass.internal_static_ChildQuest_fieldAccessorTable.ensureFieldAccessorsInitialized(ChildQuest.class, Builder.class);
        }
        
        @Override
        public int getQuestConfigId() {
            return this.questConfigId_;
        }
        
        @Override
        public int getState() {
            return this.state_;
        }
        
        @Override
        public int getQuestId() {
            return this.questId_;
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
            if (this.state_ != 0) {
                output.writeUInt32(4, this.state_);
            }
            if (this.questConfigId_ != 0) {
                output.writeUInt32(8, this.questConfigId_);
            }
            if (this.questId_ != 0) {
                output.writeUInt32(15, this.questId_);
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
            if (this.state_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.state_);
            }
            if (this.questConfigId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.questConfigId_);
            }
            if (this.questId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.questId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChildQuest)) {
                return super.equals(obj);
            }
            final ChildQuest other = (ChildQuest)obj;
            return this.getQuestConfigId() == other.getQuestConfigId() && this.getState() == other.getState() && this.getQuestId() == other.getQuestId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getQuestConfigId();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getState();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getQuestId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ChildQuest parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ChildQuest.PARSER.parseFrom(data);
        }
        
        public static ChildQuest parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChildQuest.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChildQuest parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ChildQuest.PARSER.parseFrom(data);
        }
        
        public static ChildQuest parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChildQuest.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChildQuest parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ChildQuest.PARSER.parseFrom(data);
        }
        
        public static ChildQuest parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ChildQuest.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ChildQuest parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChildQuest.PARSER, input);
        }
        
        public static ChildQuest parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChildQuest.PARSER, input, extensionRegistry);
        }
        
        public static ChildQuest parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ChildQuest.PARSER, input);
        }
        
        public static ChildQuest parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ChildQuest.PARSER, input, extensionRegistry);
        }
        
        public static ChildQuest parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChildQuest.PARSER, input);
        }
        
        public static ChildQuest parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ChildQuest.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ChildQuest.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ChildQuest prototype) {
            return ChildQuest.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ChildQuest.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ChildQuest getDefaultInstance() {
            return ChildQuest.DEFAULT_INSTANCE;
        }
        
        public static Parser<ChildQuest> parser() {
            return ChildQuest.PARSER;
        }
        
        @Override
        public Parser<ChildQuest> getParserForType() {
            return ChildQuest.PARSER;
        }
        
        @Override
        public ChildQuest getDefaultInstanceForType() {
            return ChildQuest.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ChildQuest();
            PARSER = new AbstractParser<ChildQuest>() {
                @Override
                public ChildQuest parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ChildQuest(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChildQuestOrBuilder
        {
            private int questConfigId_;
            private int state_;
            private int questId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ChildQuestOuterClass.internal_static_ChildQuest_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ChildQuestOuterClass.internal_static_ChildQuest_fieldAccessorTable.ensureFieldAccessorsInitialized(ChildQuest.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ChildQuest.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.questConfigId_ = 0;
                this.state_ = 0;
                this.questId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ChildQuestOuterClass.internal_static_ChildQuest_descriptor;
            }
            
            @Override
            public ChildQuest getDefaultInstanceForType() {
                return ChildQuest.getDefaultInstance();
            }
            
            @Override
            public ChildQuest build() {
                final ChildQuest result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ChildQuest buildPartial() {
                final ChildQuest result = new ChildQuest(this);
                result.questConfigId_ = this.questConfigId_;
                result.state_ = this.state_;
                result.questId_ = this.questId_;
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
                if (other instanceof ChildQuest) {
                    return this.mergeFrom((ChildQuest)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ChildQuest other) {
                if (other == ChildQuest.getDefaultInstance()) {
                    return this;
                }
                if (other.getQuestConfigId() != 0) {
                    this.setQuestConfigId(other.getQuestConfigId());
                }
                if (other.getState() != 0) {
                    this.setState(other.getState());
                }
                if (other.getQuestId() != 0) {
                    this.setQuestId(other.getQuestId());
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
                ChildQuest parsedMessage = null;
                try {
                    parsedMessage = ChildQuest.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ChildQuest)e.getUnfinishedMessage();
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
            public int getQuestConfigId() {
                return this.questConfigId_;
            }
            
            public Builder setQuestConfigId(final int value) {
                this.questConfigId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQuestConfigId() {
                this.questConfigId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getState() {
                return this.state_;
            }
            
            public Builder setState(final int value) {
                this.state_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearState() {
                this.state_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getQuestId() {
                return this.questId_;
            }
            
            public Builder setQuestId(final int value) {
                this.questId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQuestId() {
                this.questId_ = 0;
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
    
    public interface ChildQuestOrBuilder extends MessageOrBuilder
    {
        int getQuestConfigId();
        
        int getState();
        
        int getQuestId();
    }
}
