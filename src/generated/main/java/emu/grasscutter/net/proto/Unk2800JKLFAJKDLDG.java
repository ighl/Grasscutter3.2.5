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

public final class Unk2800JKLFAJKDLDG
{
    private static final Descriptors.Descriptor internal_static_Unk2800_JKLFAJKDLDG_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Unk2800_JKLFAJKDLDG_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private Unk2800JKLFAJKDLDG() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return Unk2800JKLFAJKDLDG.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019Unk2800_JKLFAJKDLDG.proto\"9\n\u0013Unk2800_JKLFAJKDLDG\u0012\u0010\n\bquest_id\u0018\r \u0001(\r\u0012\u0010\n\bpoint_id\u0018\u0006 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        Unk2800JKLFAJKDLDG.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_Unk2800_JKLFAJKDLDG_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Unk2800_JKLFAJKDLDG_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(Unk2800JKLFAJKDLDG.internal_static_Unk2800_JKLFAJKDLDG_descriptor, new String[] { "QuestId", "PointId" });
    }
    
    public static final class Unk2800_JKLFAJKDLDG extends GeneratedMessageV3 implements Unk2800_JKLFAJKDLDGOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int QUEST_ID_FIELD_NUMBER = 13;
        private int questId_;
        public static final int POINT_ID_FIELD_NUMBER = 6;
        private int pointId_;
        private byte memoizedIsInitialized;
        private static final Unk2800_JKLFAJKDLDG DEFAULT_INSTANCE;
        private static final Parser<Unk2800_JKLFAJKDLDG> PARSER;
        
        private Unk2800_JKLFAJKDLDG(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Unk2800_JKLFAJKDLDG() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Unk2800_JKLFAJKDLDG();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Unk2800_JKLFAJKDLDG(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.pointId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
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
            return Unk2800JKLFAJKDLDG.internal_static_Unk2800_JKLFAJKDLDG_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return Unk2800JKLFAJKDLDG.internal_static_Unk2800_JKLFAJKDLDG_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2800_JKLFAJKDLDG.class, Builder.class);
        }
        
        @Override
        public int getQuestId() {
            return this.questId_;
        }
        
        @Override
        public int getPointId() {
            return this.pointId_;
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
            if (this.pointId_ != 0) {
                output.writeUInt32(6, this.pointId_);
            }
            if (this.questId_ != 0) {
                output.writeUInt32(13, this.questId_);
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
            if (this.pointId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.pointId_);
            }
            if (this.questId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.questId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unk2800_JKLFAJKDLDG)) {
                return super.equals(obj);
            }
            final Unk2800_JKLFAJKDLDG other = (Unk2800_JKLFAJKDLDG)obj;
            return this.getQuestId() == other.getQuestId() && this.getPointId() == other.getPointId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getQuestId();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getPointId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Unk2800_JKLFAJKDLDG parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Unk2800_JKLFAJKDLDG.PARSER.parseFrom(data);
        }
        
        public static Unk2800_JKLFAJKDLDG parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_JKLFAJKDLDG.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_JKLFAJKDLDG parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Unk2800_JKLFAJKDLDG.PARSER.parseFrom(data);
        }
        
        public static Unk2800_JKLFAJKDLDG parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_JKLFAJKDLDG.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_JKLFAJKDLDG parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Unk2800_JKLFAJKDLDG.PARSER.parseFrom(data);
        }
        
        public static Unk2800_JKLFAJKDLDG parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Unk2800_JKLFAJKDLDG.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Unk2800_JKLFAJKDLDG parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_JKLFAJKDLDG.PARSER, input);
        }
        
        public static Unk2800_JKLFAJKDLDG parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_JKLFAJKDLDG.PARSER, input, extensionRegistry);
        }
        
        public static Unk2800_JKLFAJKDLDG parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2800_JKLFAJKDLDG.PARSER, input);
        }
        
        public static Unk2800_JKLFAJKDLDG parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Unk2800_JKLFAJKDLDG.PARSER, input, extensionRegistry);
        }
        
        public static Unk2800_JKLFAJKDLDG parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_JKLFAJKDLDG.PARSER, input);
        }
        
        public static Unk2800_JKLFAJKDLDG parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Unk2800_JKLFAJKDLDG.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Unk2800_JKLFAJKDLDG.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Unk2800_JKLFAJKDLDG prototype) {
            return Unk2800_JKLFAJKDLDG.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Unk2800_JKLFAJKDLDG.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Unk2800_JKLFAJKDLDG getDefaultInstance() {
            return Unk2800_JKLFAJKDLDG.DEFAULT_INSTANCE;
        }
        
        public static Parser<Unk2800_JKLFAJKDLDG> parser() {
            return Unk2800_JKLFAJKDLDG.PARSER;
        }
        
        @Override
        public Parser<Unk2800_JKLFAJKDLDG> getParserForType() {
            return Unk2800_JKLFAJKDLDG.PARSER;
        }
        
        @Override
        public Unk2800_JKLFAJKDLDG getDefaultInstanceForType() {
            return Unk2800_JKLFAJKDLDG.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Unk2800_JKLFAJKDLDG();
            PARSER = new AbstractParser<Unk2800_JKLFAJKDLDG>() {
                @Override
                public Unk2800_JKLFAJKDLDG parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Unk2800_JKLFAJKDLDG(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements Unk2800_JKLFAJKDLDGOrBuilder
        {
            private int questId_;
            private int pointId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return Unk2800JKLFAJKDLDG.internal_static_Unk2800_JKLFAJKDLDG_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return Unk2800JKLFAJKDLDG.internal_static_Unk2800_JKLFAJKDLDG_fieldAccessorTable.ensureFieldAccessorsInitialized(Unk2800_JKLFAJKDLDG.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Unk2800_JKLFAJKDLDG.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.questId_ = 0;
                this.pointId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return Unk2800JKLFAJKDLDG.internal_static_Unk2800_JKLFAJKDLDG_descriptor;
            }
            
            @Override
            public Unk2800_JKLFAJKDLDG getDefaultInstanceForType() {
                return Unk2800_JKLFAJKDLDG.getDefaultInstance();
            }
            
            @Override
            public Unk2800_JKLFAJKDLDG build() {
                final Unk2800_JKLFAJKDLDG result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Unk2800_JKLFAJKDLDG buildPartial() {
                final Unk2800_JKLFAJKDLDG result = new Unk2800_JKLFAJKDLDG(this);
                result.questId_ = this.questId_;
                result.pointId_ = this.pointId_;
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
                if (other instanceof Unk2800_JKLFAJKDLDG) {
                    return this.mergeFrom((Unk2800_JKLFAJKDLDG)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Unk2800_JKLFAJKDLDG other) {
                if (other == Unk2800_JKLFAJKDLDG.getDefaultInstance()) {
                    return this;
                }
                if (other.getQuestId() != 0) {
                    this.setQuestId(other.getQuestId());
                }
                if (other.getPointId() != 0) {
                    this.setPointId(other.getPointId());
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
                Unk2800_JKLFAJKDLDG parsedMessage = null;
                try {
                    parsedMessage = Unk2800_JKLFAJKDLDG.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Unk2800_JKLFAJKDLDG)e.getUnfinishedMessage();
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
            public int getPointId() {
                return this.pointId_;
            }
            
            public Builder setPointId(final int value) {
                this.pointId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPointId() {
                this.pointId_ = 0;
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
    
    public interface Unk2800_JKLFAJKDLDGOrBuilder extends MessageOrBuilder
    {
        int getQuestId();
        
        int getPointId();
    }
}
