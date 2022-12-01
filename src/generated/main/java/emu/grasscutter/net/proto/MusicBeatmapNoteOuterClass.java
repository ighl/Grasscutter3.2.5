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

public final class MusicBeatmapNoteOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicBeatmapNote_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicBeatmapNote_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicBeatmapNoteOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicBeatmapNoteOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016MusicBeatmapNote.proto\"8\n\u0010MusicBeatmapNote\u0012\u0012\n\nstart_time\u0018\u0001 \u0001(\r\u0012\u0010\n\bend_time\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicBeatmapNoteOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_MusicBeatmapNote_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicBeatmapNote_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicBeatmapNoteOuterClass.internal_static_MusicBeatmapNote_descriptor, new String[] { "StartTime", "EndTime" });
    }
    
    public static final class MusicBeatmapNote extends GeneratedMessageV3 implements MusicBeatmapNoteOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int START_TIME_FIELD_NUMBER = 1;
        private int startTime_;
        public static final int END_TIME_FIELD_NUMBER = 2;
        private int endTime_;
        private byte memoizedIsInitialized;
        private static final MusicBeatmapNote DEFAULT_INSTANCE;
        private static final Parser<MusicBeatmapNote> PARSER;
        
        private MusicBeatmapNote(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MusicBeatmapNote() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicBeatmapNote();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicBeatmapNote(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.startTime_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.endTime_ = input.readUInt32();
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
            return MusicBeatmapNoteOuterClass.internal_static_MusicBeatmapNote_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicBeatmapNoteOuterClass.internal_static_MusicBeatmapNote_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicBeatmapNote.class, Builder.class);
        }
        
        @Override
        public int getStartTime() {
            return this.startTime_;
        }
        
        @Override
        public int getEndTime() {
            return this.endTime_;
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
            if (this.startTime_ != 0) {
                output.writeUInt32(1, this.startTime_);
            }
            if (this.endTime_ != 0) {
                output.writeUInt32(2, this.endTime_);
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
            if (this.startTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.startTime_);
            }
            if (this.endTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.endTime_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicBeatmapNote)) {
                return super.equals(obj);
            }
            final MusicBeatmapNote other = (MusicBeatmapNote)obj;
            return this.getStartTime() == other.getStartTime() && this.getEndTime() == other.getEndTime() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getStartTime();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getEndTime();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicBeatmapNote parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicBeatmapNote.PARSER.parseFrom(data);
        }
        
        public static MusicBeatmapNote parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBeatmapNote.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBeatmapNote parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicBeatmapNote.PARSER.parseFrom(data);
        }
        
        public static MusicBeatmapNote parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBeatmapNote.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBeatmapNote parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicBeatmapNote.PARSER.parseFrom(data);
        }
        
        public static MusicBeatmapNote parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicBeatmapNote.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicBeatmapNote parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmapNote.PARSER, input);
        }
        
        public static MusicBeatmapNote parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmapNote.PARSER, input, extensionRegistry);
        }
        
        public static MusicBeatmapNote parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicBeatmapNote.PARSER, input);
        }
        
        public static MusicBeatmapNote parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicBeatmapNote.PARSER, input, extensionRegistry);
        }
        
        public static MusicBeatmapNote parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmapNote.PARSER, input);
        }
        
        public static MusicBeatmapNote parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicBeatmapNote.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicBeatmapNote.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicBeatmapNote prototype) {
            return MusicBeatmapNote.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicBeatmapNote.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicBeatmapNote getDefaultInstance() {
            return MusicBeatmapNote.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicBeatmapNote> parser() {
            return MusicBeatmapNote.PARSER;
        }
        
        @Override
        public Parser<MusicBeatmapNote> getParserForType() {
            return MusicBeatmapNote.PARSER;
        }
        
        @Override
        public MusicBeatmapNote getDefaultInstanceForType() {
            return MusicBeatmapNote.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicBeatmapNote();
            PARSER = new AbstractParser<MusicBeatmapNote>() {
                @Override
                public MusicBeatmapNote parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicBeatmapNote(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicBeatmapNoteOrBuilder
        {
            private int startTime_;
            private int endTime_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicBeatmapNoteOuterClass.internal_static_MusicBeatmapNote_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicBeatmapNoteOuterClass.internal_static_MusicBeatmapNote_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicBeatmapNote.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicBeatmapNote.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.startTime_ = 0;
                this.endTime_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicBeatmapNoteOuterClass.internal_static_MusicBeatmapNote_descriptor;
            }
            
            @Override
            public MusicBeatmapNote getDefaultInstanceForType() {
                return MusicBeatmapNote.getDefaultInstance();
            }
            
            @Override
            public MusicBeatmapNote build() {
                final MusicBeatmapNote result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicBeatmapNote buildPartial() {
                final MusicBeatmapNote result = new MusicBeatmapNote(this);
                result.startTime_ = this.startTime_;
                result.endTime_ = this.endTime_;
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
                if (other instanceof MusicBeatmapNote) {
                    return this.mergeFrom((MusicBeatmapNote)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicBeatmapNote other) {
                if (other == MusicBeatmapNote.getDefaultInstance()) {
                    return this;
                }
                if (other.getStartTime() != 0) {
                    this.setStartTime(other.getStartTime());
                }
                if (other.getEndTime() != 0) {
                    this.setEndTime(other.getEndTime());
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
                MusicBeatmapNote parsedMessage = null;
                try {
                    parsedMessage = MusicBeatmapNote.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicBeatmapNote)e.getUnfinishedMessage();
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
            public int getStartTime() {
                return this.startTime_;
            }
            
            public Builder setStartTime(final int value) {
                this.startTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStartTime() {
                this.startTime_ = 0;
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface MusicBeatmapNoteOrBuilder extends MessageOrBuilder
    {
        int getStartTime();
        
        int getEndTime();
    }
}
